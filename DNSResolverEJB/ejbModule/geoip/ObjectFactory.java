
package geoip;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the geoip package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetGeoIPRemote_QNAME = new QName("http://milan.jovic.dmi.uns.ac.rs/", "getGeoIPRemote");
    private final static QName _GetGeoIPRemoteResponse_QNAME = new QName("http://milan.jovic.dmi.uns.ac.rs/", "getGeoIPRemoteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: geoip
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetGeoIPRemote }
     * 
     */
    public GetGeoIPRemote createGetGeoIPRemote() {
        return new GetGeoIPRemote();
    }

    /**
     * Create an instance of {@link GetGeoIPRemoteResponse }
     * 
     */
    public GetGeoIPRemoteResponse createGetGeoIPRemoteResponse() {
        return new GetGeoIPRemoteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeoIPRemote }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGeoIPRemote }{@code >}
     */
    @XmlElementDecl(namespace = "http://milan.jovic.dmi.uns.ac.rs/", name = "getGeoIPRemote")
    public JAXBElement<GetGeoIPRemote> createGetGeoIPRemote(GetGeoIPRemote value) {
        return new JAXBElement<GetGeoIPRemote>(_GetGeoIPRemote_QNAME, GetGeoIPRemote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeoIPRemoteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGeoIPRemoteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://milan.jovic.dmi.uns.ac.rs/", name = "getGeoIPRemoteResponse")
    public JAXBElement<GetGeoIPRemoteResponse> createGetGeoIPRemoteResponse(GetGeoIPRemoteResponse value) {
        return new JAXBElement<GetGeoIPRemoteResponse>(_GetGeoIPRemoteResponse_QNAME, GetGeoIPRemoteResponse.class, null, value);
    }

}
