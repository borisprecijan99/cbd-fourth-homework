package rzk;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import geoip.GeoIPRemote;
import geoip.GeoIPService;
import whois.WhoIsRemote;
import whois.WhoIsService;

@Stateless
@WebService
public class ResolverBean implements ResolverBeanRemote {

	@WebServiceRef(WhoIsService.class)
	private WhoIsRemote whoIs;

	@WebServiceRef(GeoIPService.class)
	private GeoIPRemote geoIp;

	public ResolverBean() {

	}

	@Override
	@WebMethod
	public String resolve(String s) {
		((BindingProvider) geoIp).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"https://jovicev-ejb-servis.herokuapp.com/JovicevEJBServis-0.0.1-SNAPSHOT/GeoIP?wsdl");
		((BindingProvider) whoIs).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"https://jovicev-ejb-servis.herokuapp.com/JovicevEJBServis-0.0.1-SNAPSHOT/WhoIs?wsdl");
		String responseFromWhoIs = whoIs.getWhoIsDescription(s);
		String responseFromGeoIp = geoIp.getGeoIPRemote(s);
		System.out.println("---------- RESPONSE FROM WHOIS ----------");
		System.out.println(responseFromWhoIs);
		System.out.println("---------- RESPONSE FROM GEOIP ----------");
		System.out.println(responseFromGeoIp);
		return responseFromWhoIs + "<br><br><br>" + responseFromGeoIp;
	}

}
