package rzk;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.4
 * 2021-12-21T22:30:32.083+01:00
 * Generated source version: 3.4.4
 *
 */
@WebServiceClient(name = "ResolverBeanService",
                  wsdlLocation = "http://localhost:8080/DNSResolverEJB/ResolverBean?wsdl",
                  targetNamespace = "http://rzk/")
public class ResolverBeanService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://rzk/", "ResolverBeanService");
    public final static QName ResolverBeanPort = new QName("http://rzk/", "ResolverBeanPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/DNSResolverEJB/ResolverBean?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ResolverBeanService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/DNSResolverEJB/ResolverBean?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ResolverBeanService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ResolverBeanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ResolverBeanService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ResolverBeanService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ResolverBeanService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ResolverBeanService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ResolverBeanRemote
     */
    @WebEndpoint(name = "ResolverBeanPort")
    public ResolverBeanRemote getResolverBeanPort() {
        return super.getPort(ResolverBeanPort, ResolverBeanRemote.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ResolverBeanRemote
     */
    @WebEndpoint(name = "ResolverBeanPort")
    public ResolverBeanRemote getResolverBeanPort(WebServiceFeature... features) {
        return super.getPort(ResolverBeanPort, ResolverBeanRemote.class, features);
    }

}