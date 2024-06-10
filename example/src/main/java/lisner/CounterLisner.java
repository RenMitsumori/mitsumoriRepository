package lisner;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class CounterLisner implements ServletContextListener{

	public void contextInitialized(ServletContextEvent sce) {
		
		ServletContext context =sce.getServletContext();
		
	Integer count =0;
	context.setAttribute("count", count);
	}
	public void contextDestroyed(ServletContextEvent sce) {
 }
}
