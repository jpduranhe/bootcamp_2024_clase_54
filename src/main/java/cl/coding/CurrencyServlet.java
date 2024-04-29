package cl.coding;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/currency")
public class CurrencyServlet extends HttpServlet {

	private static final long serialVersionUID = -3414772585314271068L;
	
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String parameterNombre = req.getParameter("parameterNombre");
		String parameterNombre2 = req.getParameter("parameterNombre2");
		String parameterNombre2Mayus = req.getParameter("parameterNombre2Mayus");
	
		resp.getWriter().println("<html><body>");
		
		if(parameterNombre!=null) {
			resp.getWriter().println("<h1>Hola "+parameterNombre+"<h1>");
		}
		if(parameterNombre2!=null) {
			if(parameterNombre2Mayus!= null && parameterNombre2Mayus.equals("1")) {
				
				parameterNombre2=parameterNombre2.toUpperCase();
			}
			resp.getWriter().println("<h1>Hola "+parameterNombre2+"<h1>");
		}		
		resp.getWriter().println("</body></html>");
		
		
		resp.setContentType("text/html;charset=UTF-8");
		
	}
	
	

}
