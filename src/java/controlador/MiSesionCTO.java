package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.dao.UsuarioDAO;
import modelo.dto.UsuarioDTO;

/**
 *
 * @author ANDRES
 */
public class MiSesionCTO extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String accion = request.getParameter("accion");
            
            
            switch (accion) {
                case "validar":
                    UsuarioDAO dao = new UsuarioDAO();
                    String usuario = request.getParameter("txtUsuario");
                    String clave = asegurarClave(request.getParameter("txtPss"));
                    UsuarioDTO dto = new UsuarioDTO(usuario, clave);
                    dto = dao.valSesion(dto);
                    if(dto != null){
                        HttpSession session = request.getSession();
                        session.setAttribute("usActual", dto);
                        request.getRequestDispatcher("ProductoCTO?accion=listar_datos").forward(request, response);
                    }else{
                        System.out.println("No valido");
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    }
                    break;
                case "salir":
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MiSesionCTO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String asegurarClave(String clave) {
        String clave2 = "";
        try {
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            sha256.reset();
            sha256.update(clave.getBytes("utf8"));
            clave2 = Base64.getEncoder().encodeToString(sha256.digest());
            System.out.println("Clave2: " + clave2);
            System.out.println("Tamaño: " + clave2.length());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            System.out.println("errado en cifrar: " + ex.getMessage());
        }

        return clave2;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
