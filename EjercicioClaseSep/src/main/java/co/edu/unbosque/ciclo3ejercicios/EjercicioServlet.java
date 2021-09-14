package co.edu.unbosque.ciclo3ejercicios;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EjercicioServlet
 */
@WebServlet("/EjercicioServlet")
public class EjercicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjercicioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String nombre = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		
		if (nombre.toUpperCase().equals("WILLIAM") && telefono.toUpperCase().equals("12345678")) {
			request.getRequestDispatcher("/vistas/Menu.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/vistas/ErrorLogin.jsp").forward(request, response);
		}
		
		/*
		PrintWriter writer = response.getWriter();
		if (nombre!=null && cedula!=null) {
			writer.println("Datos recibidos: "+nombre+" y "+cedula);
		}else {
			writer.println("Datos incompletos");
		}
		writer.close();
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
