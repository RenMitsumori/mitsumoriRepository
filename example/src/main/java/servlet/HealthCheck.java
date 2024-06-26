package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Health;
import model.HealthCheckLogic;

/**
 * Servlet implementation class HealthCheck
 */
@WebServlet("/HealthCheck")
public class HealthCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HealthCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	RequestDispatcher dispatcher =
			request.getRequestDispatcher("WEB-INF/Jsp/healthCheck.jsp");
	dispatcher.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String weight = request.getParameter("weight");
    String height = request.getParameter("height");
    
    Health health =new Health();
    health.setHeight(Double.parseDouble(height));
    health.setWeight(Double.parseDouble(weight));
	
    HealthCheckLogic healthCheckLogic = new HealthCheckLogic();
    healthCheckLogic.execute(health);
    
    request.setAttribute("health",health);
    		RequestDispatcher dispatcher =
    		request.getRequestDispatcher("WEB-INF/Jsp/healthCheckResult.jsp");
    		dispatcher.forward(request, response);
    		
	}

}
