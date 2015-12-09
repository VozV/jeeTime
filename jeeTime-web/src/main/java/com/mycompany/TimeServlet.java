package com.mycompany;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TimeServlet", urlPatterns = {"/current","/"})
public class TimeServlet extends HttpServlet {

    @EJB
    private NewSessionBean newSessionBean;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            getServletContext().getRequestDispatcher("/outTime.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.addHeader("Date", timeToString(newSessionBean.getTime()));
        processRequest(request, response);
    }
    
    private String timeToString(Date c){
        return new SimpleDateFormat("HH:mm").format(c);
    }
}
