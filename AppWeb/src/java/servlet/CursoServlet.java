/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.Curso;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Curso;
import dao.CursoDAO;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Felipe Gomes Mendes
 */
@WebServlet(name = "CursoServlet", urlPatterns = {"/CursoServlet.Action"})
public class CursoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            // verificando se o parametro está vindo nulo
            if(request.getParameter("type") != null){
                // verificando se parametro é igual a o informado no formulario
                if(request.getParameter("type").equals("save")){
                    
                    Curso curso = new Curso();
                    CursoDAO dao = new CursoDAO();
                    // capturando informação do  formulario com getParameter();
                    String nome = request.getParameter("descricao");
                    int quant = Integer.parseInt(request.getParameter("quant"));
                    
                    curso.setDescricao(nome);                   
                    curso.setQuantidade(quant);
                    
                    
                    dao.insert(curso);
                    // todo servlet deve retornar uma página html
                    StringBuilder html = new StringBuilder();
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet CursoServlet</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Bem vindo !!! " + nome + "</h1>");
                    out.println("</body>");
                    out.println("</html>");
            

                }
            }
            /* TODO output your page here. You may use following sample code. */
           
            // METODO DE REDIRECIONAMENTO 
            //response.sendRedirect("https://www.devmedia.com.br/classe-de-conexao-em-java-no-netbeans-driver-mysql/18804");
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
