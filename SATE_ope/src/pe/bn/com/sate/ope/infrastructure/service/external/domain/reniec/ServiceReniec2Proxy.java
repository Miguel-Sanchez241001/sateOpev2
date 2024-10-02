package pe.bn.com.sate.ope.infrastructure.service.external.domain.reniec;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

public class ServiceReniec2Proxy{

    protected Descriptor _descriptor;

    public class Descriptor {
        private pe.bn.com.sate.ope.infrastructure.service.external.domain.reniec.ServiceReniec2Service _service = null;
        private pe.bn.com.sate.ope.infrastructure.service.external.domain.reniec.ServiceReniec2 _proxy = null;
        private Dispatch<Source> _dispatch = null;
        private boolean _useJNDIOnly = false;

        public Descriptor() {
            init();
        }

        public Descriptor(URL wsdlLocation, QName serviceName) {
            _service = new pe.bn.com.sate.ope.infrastructure.service.external.domain.reniec.ServiceReniec2Service(wsdlLocation, serviceName);
            initCommon();
        }

        public void init() {
            _service = null;
            _proxy = null;
            _dispatch = null;
            try
            {
                InitialContext ctx = new InitialContext();
                _service = (pe.bn.com.sate.ope.infrastructure.service.external.domain.reniec.ServiceReniec2Service)ctx.lookup("java:comp/env/service/ServiceReniec2Service");
            }
            catch (NamingException e)
            {
                if ("true".equalsIgnoreCase(System.getProperty("DEBUG_PROXY"))) {
                    System.out.println("JNDI lookup failure: javax.naming.NamingException: " + e.getMessage());
                    e.printStackTrace(System.out);
                }
            }

            if (_service == null && !_useJNDIOnly)
                _service = new pe.bn.com.sate.ope.infrastructure.service.external.domain.reniec.ServiceReniec2Service();
            initCommon();
        }

        private void initCommon() {
            _proxy = _service.getServiceReniec2();
        }

        public pe.bn.com.sate.ope.infrastructure.service.external.domain.reniec.ServiceReniec2 getProxy() {
            return _proxy;
        }

        public void useJNDIOnly(boolean useJNDIOnly) {
            _useJNDIOnly = useJNDIOnly;
            init();
        }

        public Dispatch<Source> getDispatch() {
            if (_dispatch == null ) {
                QName portQName = new QName("http://interfaz.mq2.bn", "ServiceReniec2");
                _dispatch = _service.createDispatch(portQName, Source.class, Service.Mode.MESSAGE);

                String proxyEndpointUrl = getEndpoint();
                BindingProvider bp = (BindingProvider) _dispatch;
                String dispatchEndpointUrl = (String) bp.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
                if (!dispatchEndpointUrl.equals(proxyEndpointUrl))
                    bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, proxyEndpointUrl);
            }
            return _dispatch;
        }

        public String getEndpoint() {
            BindingProvider bp = (BindingProvider) _proxy;
            return (String) bp.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
        }

        public void setEndpoint(String endpointUrl) {
            BindingProvider bp = (BindingProvider) _proxy;
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);

            if (_dispatch != null ) {
                bp = (BindingProvider) _dispatch;
                bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);
            }
        }

        public void setMTOMEnabled(boolean enable) {
            SOAPBinding binding = (SOAPBinding) ((BindingProvider) _proxy).getBinding();
            binding.setMTOMEnabled(enable);
        }
    }

    public ServiceReniec2Proxy() {
        _descriptor = new Descriptor();
        _descriptor.setMTOMEnabled(false);
    }

    public ServiceReniec2Proxy(URL wsdlLocation, QName serviceName) {
        _descriptor = new Descriptor(wsdlLocation, serviceName);
        _descriptor.setMTOMEnabled(false);
    }

    public Descriptor _getDescriptor() {
        return _descriptor;
    }

    public Identidad2 consulta7(String sistema, String usrapp, String claveapp, String user, String dni) {
        return _getDescriptor().getProxy().consulta7(sistema,usrapp,claveapp,user,dni);
    }

    public IdentidadInfo2 consulta1(String sistema, String usrapp, String claveapp, String user, int numReg, int initGroup, String apePat, String apeMat, String nombre) {
        return _getDescriptor().getProxy().consulta1(sistema,usrapp,claveapp,user,numReg,initGroup,apePat,apeMat,nombre);
    }

    public Firma2 consulta4(String sistema, String usrapp, String claveapp, String user, String dni) {
        return _getDescriptor().getProxy().consulta4(sistema,usrapp,claveapp,user,dni);
    }

    public Foto2 consulta3(String sistema, String usrapp, String claveapp, String user, String dni) {
        return _getDescriptor().getProxy().consulta3(sistema,usrapp,claveapp,user,dni);
    }

    public IdentidadHuman2 consulta2(String sistema, String usrapp, String claveapp, String user, String dni) {
        return _getDescriptor().getProxy().consulta2(sistema,usrapp,claveapp,user,dni);
    }

}