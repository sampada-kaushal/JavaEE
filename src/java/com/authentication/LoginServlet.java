/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.authentication;

import com.hibernate.pojo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
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
public class LoginServlet extends HttpServlet {

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
         PrintWriter out = response.getWriter();

		
		
		String password = request.getParameter("password");
                
                String email=request.getParameter("email");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
                
                
                 Transaction tx=session.beginTransaction();
        
        java.util.List hql=session.createQuery("FROM pojo").list();
        for(Iterator iterator=hql.iterator();iterator.hasNext();)
        {
            pojo obj=(pojo)iterator.next();
            out.println("<br> password  =  "+obj.getPassword()+"</td><br>");
            out.println("<td> email id=  "+obj.getEmail()+"</td><br>");
          
        }
        
        if(hql.size()>0){
            RequestDispatcher rd=request.getRequestDispatcher("login1.html");
            rd.forward(request, response);
			//request.setAttribute("loginstatus", "Login Successful.");
			//getServletContext().getRequestDispatcher("/home_index.jsp").forward(request, response);
		}
        else
        {
            RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
			//request.setAttribute("loginstatus", "Username/Password do not match.");
			//getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		}
	
        tx.commit();


    
    
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        try {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet LoginServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
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
//        processRequest(request, response);
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
  //      processRequest(request, response);
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