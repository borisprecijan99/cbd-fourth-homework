package rzk.web;

import java.io.IOException;
import java.net.InetAddress;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

import rzk.ResolverBeanRemote;
import rzk.ResolverBeanService;

@WebServlet("/ResolveServlet")
public class ResolveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@WebServiceRef(ResolverBeanService.class)
	private ResolverBeanRemote resolverBean;

	public ResolveServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String address = request.getParameter("address");
		String ipAddress = InetAddress.getByName(address).getHostAddress();
		String result = resolverBean.resolve(ipAddress);
		request.setAttribute("message", result);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
