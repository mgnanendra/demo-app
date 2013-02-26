package ie.cit.adf.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class TimeServlet extends HttpServlet {
	private TimeService timeService;

	@Override
	public void init() throws ServletException {
		ServletContext servletContext = getServletContext();
		WebApplicationContext ctx = WebApplicationContextUtils
				.getWebApplicationContext(servletContext);
		timeService = ctx.getBean(TimeService.class);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("Current time: " + timeService.getCurrentDate());
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
	}

}
