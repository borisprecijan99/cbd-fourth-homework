
package whois;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the whois package. 
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

    private final static QName _GetWhoIsDescription_QNAME = new QName("http://milan.jovic.dmi.uns.ac.rs/", "getWhoIsDescription");
    private final static QName _GetWhoIsDescriptionResponse_QNAME = new QName("http://milan.jovic.dmi.uns.ac.rs/", "getWhoIsDescriptionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: whois
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWhoIsDescription }
     * 
     */
    public GetWhoIsDescription createGetWhoIsDescription() {
        return new GetWhoIsDescription();
    }

    /**
     * Create an instance of {@link GetWhoIsDescriptionResponse }
     * 
     */
    public GetWhoIsDescriptionResponse createGetWhoIsDescriptionResponse() {
        return new GetWhoIsDescriptionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWhoIsDescription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWhoIsDescription }{@code >}
     */
    @XmlElementDecl(namespace = "http://milan.jovic.dmi.uns.ac.rs/", name = "getWhoIsDescription")
    public JAXBElement<GetWhoIsDescription> createGetWhoIsDescription(GetWhoIsDescription value) {
        return new JAXBElement<GetWhoIsDescription>(_GetWhoIsDescription_QNAME, GetWhoIsDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWhoIsDescriptionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWhoIsDescriptionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://milan.jovic.dmi.uns.ac.rs/", name = "getWhoIsDescriptionResponse")
    public JAXBElement<GetWhoIsDescriptionResponse> createGetWhoIsDescriptionResponse(GetWhoIsDescriptionResponse value) {
        return new JAXBElement<GetWhoIsDescriptionResponse>(_GetWhoIsDescriptionResponse_QNAME, GetWhoIsDescriptionResponse.class, null, value);
    }

}
