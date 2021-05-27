package aplicacion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.CalculadoraModelo;
/**
 * Servlet implementation class CalculadoraServlet
 */
@WebServlet("/Calculadora")
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CalculadoraModelo modelo;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.modelo = new CalculadoraModelo();
		request.setAttribute("modelo", modelo);
		
		String ruta = "/Calculadora.jsp";
		request.getRequestDispatcher(ruta).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.modelo = new CalculadoraModelo(Float.valueOf(request.getParameter("altura")), Float.valueOf(request.getParameter("peso")));
		Float p =this.modelo.calcular();
		if(p <18.5) {
			modelo.mensaje="delgado";
		} else if ( p>18.5 && p <25) { 
			modelo.mensaje="normal";
		} else {modelo.mensaje="obeso";}
		request.setAttribute("modelo", modelo);
		
		String ruta = "/Calculadora.jsp";
		request.getRequestDispatcher(ruta).forward(request, response);
	}

}
