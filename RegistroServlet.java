import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class RegistroServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");

        // Aquí puedes realizar el procesamiento y la inserción en la base de datos

        request.setAttribute("mensaje", "Registro exitoso");
        RequestDispatcher rd = request.getRequestDispatcher("mensaje.jsp");
        rd.forward(request, response);
    }
}
