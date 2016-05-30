/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.search;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
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
public class servSearch extends HttpServlet {

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
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         {
             response.setContentType("text/html;charset=UTF-8");
        
         }
         PrintWriter out = response.getWriter();
       //  pojo obj=new pojo();
		
		String val = request.getParameter("val");
	        val=val.toLowerCase();
		
		 
        Configuration cfg=new Configuration();
        cfg.configure("hibernate1.cfg.xml");
        SessionFactory fct=cfg.buildSessionFactory();
        Session sec=fct.openSession();
        Transaction tx=sec.beginTransaction();
        
        List<pojoSearch> hql=sec.createQuery("FROM pojoSearch where keyword like '%"+val+"%'").list();// where keyword like '%"+val+"%'").list();
        
        Iterator<pojoSearch> iterator=hql.iterator();
        
        while(iterator.hasNext())
        {
            pojoSearch obj=iterator.next();
            out.println(" You searched for= "+obj.getVal());
            out.println("links related to your search");
            getServletContext().getRequestDispatcher("/"+obj.getUrl()+".html").forward(request, response);
               }
                 
  
         
//       if(hql.size()>0){
//			request.setAttribute("status", "Search Successful.");
//			getServletContext().getRequestDispatcher("/text.jsp").forward(request, response);
//		}else{
//			request.setAttribute("status", "Search unsuccessful");
//			getServletContext().getRequestDispatcher("/text.jsp").forward(request, response);
//		}
//	
        tx.commit();

    
    sec.close();
    
    
    
    
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        try {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet servSearch</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet servSearch at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        } finally {            
//            out.close();
//        }
//    }

    }    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }

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
