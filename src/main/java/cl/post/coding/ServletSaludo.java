package cl.post.coding;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/saludar")
public class ServletSaludo extends HttpServlet {
	
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String html="""
				<html>
					<header>
						<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
					</header>
					<body>
						<div class="container">
							<form method="post" action="#">
							  <div class="mb-3">
							    <label for="nombre" class="form-label">Nombre</label>
							    <input type="text" class="form-control" name="nombre" id="nombre" aria-describedby="tuNombre">
							    <div id="emailHelp" class="form-text">Escribe tu nombre.</div>
							  </div>
							  <div class="mb-3">
							    <label for="apellido" class="form-label">Apellido</label>
							    <input type="text" class="form-control" name="apellido" id="apellido" aria-describedby="tuapellido">
							    <div id="emailHelp" class="form-text">Escribe tu apellido.</div>
							  </div>
							  <button type="submit" class="btn btn-primary">Saludar</button>
							</form>
						</div>
					</body>
				</hmtl>
				""";
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().print(html);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String parametroNombre= req.getParameter("nombre");
		String parametroApellido= req.getParameter("apellido");
		
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().print("<html>");
		resp.getWriter().print("<header><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"></header>");
		resp.getWriter().print("<body>");
		resp.getWriter().print("<div class=\"container\">");
		resp.getWriter().print("<div class=\"card\">");
		resp.getWriter().print("  <div class=\"card-header\">");
		resp.getWriter().print("    Saludoinador");
		resp.getWriter().print("  </div>");
		resp.getWriter().print("  <div class=\"card-body\">");
		resp.getWriter().print("    <h5 class=\"card-title\">Este es un Saludo</h5>");
		resp.getWriter().print("    <p class=\"card-text\">Hola !!!!! "+parametroNombre+"  "+parametroApellido+" .</p>");
		resp.getWriter().print("    <a href=\"/clase_54/saludar\" class=\"btn btn-primary\">Volver</a>");
		resp.getWriter().print("  </div>");
		resp.getWriter().print("</div>");
		resp.getWriter().print("</div>");
		resp.getWriter().print("</html>");
	}

	
	
}
