
package pe.bn.com.sate.ope.infrastructure.service.external.domain.mc;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "Service1", targetNamespace = "http://tempuri.org/", wsdlLocation = "WEB-INF/wsdl/Service2.svc.wsdl")
public class Service1
    extends Service
{

    private final static URL SERVICE1_WSDL_LOCATION;
    private final static WebServiceException SERVICE1_EXCEPTION;
    private final static QName SERVICE1_QNAME = new QName("http://tempuri.org/", "Service1");

    static {
        SERVICE1_WSDL_LOCATION = pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.Service1 .class.getResource("WEB-INF/wsdl/Service2.svc.wsdl");
        WebServiceException e = null;
        if (SERVICE1_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'WEB-INF/wsdl/Service2.svc.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        SERVICE1_EXCEPTION = e;
    }

    public Service1() {
        super(__getWsdlLocation(), SERVICE1_QNAME);
    }

    public Service1(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICE1_QNAME, features);
    }

    public Service1(URL wsdlLocation) {
        super(wsdlLocation, SERVICE1_QNAME);
    }

    public Service1(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE1_QNAME, features);
    }

    public Service1(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Service1(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IService1
     */
    @WebEndpoint(name = "BasicHttpsBinding_IService1")
    public IService1 getBasicHttpsBindingIService1() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpsBinding_IService1"), IService1.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IService1
     */
    @WebEndpoint(name = "BasicHttpsBinding_IService1")
    public IService1 getBasicHttpsBindingIService1(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpsBinding_IService1"), IService1.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICE1_EXCEPTION!= null) {
            throw SERVICE1_EXCEPTION;
        }
        return SERVICE1_WSDL_LOCATION;
    }

}
