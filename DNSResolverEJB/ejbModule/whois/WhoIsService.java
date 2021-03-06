package whois;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.4
 * 2021-12-21T22:01:34.411+01:00
 * Generated source version: 3.4.4
 *
 */
@WebServiceClient(name = "WhoIsService",
                  wsdlLocation = "https://jovicev-ejb-servis.herokuapp.com/JovicevEJBServis-0.0.1-SNAPSHOT/WhoIs?wsdl",
                  targetNamespace = "http://milan.jovic.dmi.uns.ac.rs/")
public class WhoIsService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://milan.jovic.dmi.uns.ac.rs/", "WhoIsService");
    public final static QName WhoIsPort = new QName("http://milan.jovic.dmi.uns.ac.rs/", "WhoIsPort");
    static {
        URL url = null;
        try {
            url = new URL("https://jovicev-ejb-servis.herokuapp.com/JovicevEJBServis-0.0.1-SNAPSHOT/WhoIs?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WhoIsService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "https://jovicev-ejb-servis.herokuapp.com/JovicevEJBServis-0.0.1-SNAPSHOT/WhoIs?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WhoIsService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WhoIsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WhoIsService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public WhoIsService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WhoIsService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WhoIsService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns WhoIsRemote
     */
    @WebEndpoint(name = "WhoIsPort")
    public WhoIsRemote getWhoIsPort() {
        return super.getPort(WhoIsPort, WhoIsRemote.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WhoIsRemote
     */
    @WebEndpoint(name = "WhoIsPort")
    public WhoIsRemote getWhoIsPort(WebServiceFeature... features) {
        return super.getPort(WhoIsPort, WhoIsRemote.class, features);
    }

}
