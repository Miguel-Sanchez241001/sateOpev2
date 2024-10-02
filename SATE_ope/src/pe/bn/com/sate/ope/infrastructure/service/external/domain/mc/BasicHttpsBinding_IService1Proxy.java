package pe.bn.com.sate.ope.infrastructure.service.external.domain.mc;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

public class BasicHttpsBinding_IService1Proxy{

    protected Descriptor _descriptor;

    public class Descriptor {
        private pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.Service1 _service = null;
        private pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.IService1 _proxy = null;
        private Dispatch<Source> _dispatch = null;
        private boolean _useJNDIOnly = false;

        public Descriptor() {
            init();
        }

        public Descriptor(URL wsdlLocation, QName serviceName) {
            _service = new pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.Service1(wsdlLocation, serviceName);
            initCommon();
        }

        public void init() {
            _service = null;
            _proxy = null;
            _dispatch = null;
            try
            {
                InitialContext ctx = new InitialContext();
                _service = (pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.Service1)ctx.lookup("java:comp/env/service/Service1");
            }
            catch (NamingException e)
            {
                if ("true".equalsIgnoreCase(System.getProperty("DEBUG_PROXY"))) {
                    System.out.println("JNDI lookup failure: javax.naming.NamingException: " + e.getMessage());
                    e.printStackTrace(System.out);
                }
            }

            if (_service == null && !_useJNDIOnly)
                _service = new pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.Service1();
            initCommon();
        }

        private void initCommon() {
            _proxy = _service.getBasicHttpsBindingIService1();
        }

        public pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.IService1 getProxy() {
            return _proxy;
        }

        public void useJNDIOnly(boolean useJNDIOnly) {
            _useJNDIOnly = useJNDIOnly;
            init();
        }

        public Dispatch<Source> getDispatch() {
            if (_dispatch == null ) {
                QName portQName = new QName("http://tempuri.org/", "BasicHttpsBinding_IService1");
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

    public BasicHttpsBinding_IService1Proxy() {
        _descriptor = new Descriptor();
        _descriptor.setMTOMEnabled(false);
    }

    public BasicHttpsBinding_IService1Proxy(URL wsdlLocation, QName serviceName) {
        _descriptor = new Descriptor(wsdlLocation, serviceName);
        _descriptor.setMTOMEnabled(false);
    }

    public Descriptor _getDescriptor() {
        return _descriptor;
    }

    public String aperturaClientes(String xml) {
        return _getDescriptor().getProxy().aperturaClientes(xml);
    }

    public String modificacionClientes(String xml) {
        return _getDescriptor().getProxy().modificacionClientes(xml);
    }

    public String aperturaTarjetas(String xml) {
        return _getDescriptor().getProxy().aperturaTarjetas(xml);
    }

    public String modificacionTarjetas(String xml) {
        return _getDescriptor().getProxy().modificacionTarjetas(xml);
    }

    public String consultaMovimientos(String xml) {
        return _getDescriptor().getProxy().consultaMovimientos(xml);
    }

    public String anulaciones(String xml) {
        return _getDescriptor().getProxy().anulaciones(xml);
    }

    public String cashIn(String xml) {
        return _getDescriptor().getProxy().cashIn(xml);
    }

    public String nominacionTarjeta(String xml) {
        return _getDescriptor().getProxy().nominacionTarjeta(xml);
    }

    public String reemisionTarjeta(String xml) {
        return _getDescriptor().getProxy().reemisionTarjeta(xml);
    }

    public String consultas(String xml) {
        return _getDescriptor().getProxy().consultas(xml);
    }

    public String consultaSaldos(String xml) {
        return _getDescriptor().getProxy().consultaSaldos(xml);
    }

    public String compras(String xml) {
        return _getDescriptor().getProxy().compras(xml);
    }

    public String cambioPin(String xml) {
        return _getDescriptor().getProxy().cambioPin(xml);
    }

    public String validacionPin(String xml) {
        return _getDescriptor().getProxy().validacionPin(xml);
    }

    public String autoreversa(String xml) {
        return _getDescriptor().getProxy().autoreversa(xml);
    }

    public String reseteoPin(String xml) {
        return _getDescriptor().getProxy().reseteoPin(xml);
    }

    public String informacionTarjeta(String xml) {
        return _getDescriptor().getProxy().informacionTarjeta(xml);
    }

    public String generacionCVV2(String xml) {
        return _getDescriptor().getProxy().generacionCVV2(xml);
    }

    public String consultaDatosTarjeta(String xml) {
        return _getDescriptor().getProxy().consultaDatosTarjeta(xml);
    }

    public String consultaMovimientosExpediente(String xml) {
        return _getDescriptor().getProxy().consultaMovimientosExpediente(xml);
    }

    public String consultaDatosExpediente(String xml) {
        return _getDescriptor().getProxy().consultaDatosExpediente(xml);
    }

}