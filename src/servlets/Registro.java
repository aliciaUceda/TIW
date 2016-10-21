package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAOUsuario;
import dominio.Usuario;

/**
 * Servlet implementation class Registro
 */
@WebServlet("/Registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("cargado servlet registro");
		String usuario = request.getParameter("usuario");
		String clave=request.getParameter("clave");
		String claveRepetida =request.getParameter("claveRepetida");
		String email =request.getParameter("email");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		if (!clave.equals(claveRepetida)){
		String error = "Las claves no coinciden";
		request.setAttribute("error", error);
		request.getRequestDispatcher("/registro.jsp").forward(request, response);
	}
	else{
		
		DAOUsuario.registro(usuario,clave,email);
		DAOUsuario.login(usuario, clave);
		request.getRequestDispatcher("/menu_principal.jsp").forward(request, response);
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
