/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.sena.edu.greenlightweb.servlets;

import co.sena.edu.greenlightweb.logica.Controladora;
import co.sena.edu.greenlightweb.logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Eslover
 */
@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {
    
    Controladora controladora = new Controladora();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios = controladora.listarUsuarios();
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listaUsuarios", usuarios);
        response.sendRedirect("listar.jsp");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int codigo= Integer.parseInt(request.getParameter("codigo"));
        String nombre= request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        int edad=Integer.parseInt(request.getParameter("edad"));
        
        //Esto es solo para probar que al escribir los datos en el index.jsp los puedo capturar por consola en el SvUsuario.java
        /*System.out.println("codigo= "+codigo);
        System.out.println("nombre= "+nombre);
        System.out.println("apellido= "+apellido);
        System.out.println("edad= "+edad);*/
        
        Usuario u = new Usuario();
        u.setCodigo(codigo);
        u.setNombre(nombre);
        u.setApellido(apellido);
        u.setEdad(edad);
        
        controladora.registrarUsuarios(u);
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
