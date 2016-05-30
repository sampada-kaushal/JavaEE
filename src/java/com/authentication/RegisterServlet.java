/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.authentication;

import com.hibernate.pojo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author sampada kaushal
 */
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // System.out.println("1");
        PrintWriter out = response.getWriter();
    
    String name = request.getParameter("name");
       // out.println("1");
        String password = request.getParameter("password");
       // out.println("1");

        String re_password = request.getParameter("re_password");
       // out.println("1");
        String email = request.getParameter("email");
//        out.println("1");
//        out.println(password);
//        out.println(re_password);

        if (password.equals(re_password)) {
            out.print("ggg");
            pojo obj = new pojo();

            obj.setName(name);
            obj.setPassword(password);
            obj.setEmail(email);


            SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

            Session session = factory.openSession();


            Transaction tx = session.beginTransaction();
            session.save(obj);


            request.setAttribute("loginstatus", "Login Successful.");
           

            tx.commit();

            out.println("Insertion Successful...");

            session.close();
             //getServletContext().getRequestDispatcher("/home_index.jsp").forward(request, response);
            RequestDispatcher rd=request.getRequestDispatcher("signup1.html");
            rd.forward(request, response);

        } else {
            RequestDispatcher rd=request.getRequestDispatcher("signup.jsp");
            rd.forward(request, response);

            out.println("Passwords do not match");
        }


//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        try {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet RegisterServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet RegisterServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        } finally {            
//            out.close();
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   //     processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    //    processRequest(request, response);
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
