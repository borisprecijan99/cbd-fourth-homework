package rzk;

import javax.ejb.Remote;
import javax.jws.WebService;

@WebService
@Remote
public interface ResolverBeanRemote {
	String resolve(String s);
}
