/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.Alterar;
import dao.CursoDAO;
import dao.Deletar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Felipe Gomes Mendes
 */
@WebServlet(name = "AlterarServlet", urlPatterns = {"/AlterarServlet.Action"})
public class AlterarServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            if(request.getParameter("type") != null){
                // verificando se parametro é igual a o informado no formulario
                if(request.getParameter("type").equals("update")){
                    
                    Alterar curso = new Alterar();
                    CursoDAO dao = new CursoDAO();
                    // capturando informação do  formulario com getParameter();
                    String condi = request.getParameter("condi");     
                    String novadesc = request.getParameter("novadesc");
                    int quant = Integer.parseInt(request.getParameter("novaquant"));
                    curso.setCondi(condi);    
                    curso.setDesc(novadesc); 
                    curso.setQuant(quant);  
                    dao.alterar(curso);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlterarServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>O Curso " + condi +"Foi Alterado Para"+ novadesc + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
   
  }
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
        processRequest(request, response);
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
