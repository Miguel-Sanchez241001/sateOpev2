package pe.bn.com.sate.ope.transversal.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.*;
import java.util.Collection;
import java.util.List;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.security.cert.CertificateNotYetValidException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import pe.bn.com.sate.ope.transversal.util.componentes.Parametros;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;



public class CertificadoUtil {
	private @Autowired
	static
	Parametros parametros;
	private final static Logger log = Logger.getLogger(CertificadoUtil.class);



public static SSLContext getSslContext(final String vHost) throws KeyStoreException,
            IOException, NoSuchAlgorithmException, CertificateException, KeyManagementException {
	
		//final String vHost = host;
		
		String certPath = ConstantesGenerales.certificadoIzipay;
	
		 //Crear KeyStore e importar el certificado
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        
        File file = new File(certPath);
		
        try(FileInputStream inputStream = new FileInputStream(file)){
            final X509Certificate certificate = (X509Certificate) CertificateFactory
                    .getInstance("X.509").generateCertificate(inputStream);
            keyStore.setCertificateEntry("my_cert", certificate);

            // Imprimir detalles del certificado usando log.info
            log.debug("Subject: {}"+ certificate.getSubjectDN());
            log.debug("Issuer: {}"+ certificate.getIssuerDN());
            log.debug("Serial Number: {}"+ certificate.getSerialNumber());
            log.debug("Valid From: {}"+ certificate.getNotBefore());
            log.debug("Valid To: {}"+ certificate.getNotAfter());
            log.debug("Signature Algorithm: {}"+ certificate.getSigAlgName());
            log.debug("Version: {}"+ certificate.getVersion());
            log.debug("Public Key: {}"+ certificate.getPublicKey());

            //Crear TrustManager personalizado con el KeyStore
            TrustManager[] trustManagers = new TrustManager[]{
                    new X509TrustManager() {
                        public X509Certificate[] getAcceptedIssuers() {
                            return new X509Certificate[]{certificate};
                        }

                        public void checkClientTrusted(X509Certificate[] certs, String authType)
                                throws CertificateException {
                            verifyCertificates(certs,vHost);
                        }

                        public void checkServerTrusted(X509Certificate[] certs, String authType)
                                throws CertificateException {
                            verifyCertificates(certs,vHost);
                        }


                        private void verifyCertificates(X509Certificate[] certs, String host)
                                throws CertificateException {
                            try {
                                // Verificar cada certificado por fecha
                                for (X509Certificate cert : certs) {
                                    cert.checkValidity();
                                }

                                verifyHostName(certs[0],host);

                            } catch (CertificateExpiredException e) {
                                throw new CertificateException("Certificate not valid: " + e.getMessage(), e);
                            } catch (Exception e) {
                                throw new CertificateException("Certificate validation error: " + e.getMessage(), e);
                            }
                        }

                    }
            };

            // Crear SSLContext personalizado con el TrustManager
            SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
            sslContext.init(null, trustManagers, null);
        
		return sslContext;
		
        }
	}
	
	public static void verifyHostName(X509Certificate cert, String host) throws CertificateException {
		try {
			// Suponiendo que el nombre de host esperado es "example.com"
			String expectedHostName = host;
 
			// Obtener nombres alternativos del certificado
			Collection<List<?>> altNames = cert.getSubjectAlternativeNames();
			if (altNames != null) {
				for (List<?> altName : altNames) {
					if (((Integer) altName.get(0)) == 2) { // Tipo 2 = DNS name
						String dnsName = (String) altName.get(1);
						if (matchesWildcard(dnsName,expectedHostName)) {
							return; // Hostname is valid
						}
					}
				}
			}
 
			// Si no se encuentra en los nombres alternativos, verificar el CN
			String dn = cert.getSubjectX500Principal().getName();
			String cn = getCommonName(dn);
			if (matchesWildcard(cn,expectedHostName)) {
				return; // Hostname is valid
			}
 
			throw new CertificateException("Hostname verification failed");
 
		} catch (Exception e) {
			throw new CertificateException("Hostname verification error: " + e.getMessage(), e);
		}
	}
	
	private static boolean matchesWildcard(String pattern, String host) {
		if (pattern.startsWith("*.")) {
			String suffix = pattern.substring(2);
			return host.contains(suffix) && host.length() > suffix.length();
		}
		return pattern.equalsIgnoreCase(host);
	}
	
	private static String getCommonName(String dn) throws CertificateException {
		try {
			for (String part : dn.split(",")) {
				if (part.trim().startsWith("CN=")) {
					return part.trim().substring(3);
				}
			}
			throw new CertificateException("No common name found");
		} catch (Exception e) {
			throw new CertificateException("Failed to get common name: " + e.getMessage(), e);
		}
	}
}
