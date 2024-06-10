package servlet;



import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Uranaiservret
 */
@WebServlet("/Uranaiservret")
public class Uranaiservret extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] luckArray = {"超スッキリ","スッキリ","最悪"};
		int index =(int)(Math.random()*3);
		String luck = luckArray[index];
		//実行日を取得
		Date date =new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
		String today =sdf.format(date);
		
		//HTMLを出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\"/>");
		out.println("<title>スッキリ占い</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+ today+"の運勢は「" + luck + "」です</p>");
		out.println("<p>" + "本日も一日頑張ってください" + "</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
