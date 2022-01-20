
package ca.sait.calculator.servelt;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author changyu yang
 */
public class AgeCalculatorServelt extends HttpServlet {

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
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
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
        String ageInput = request.getParameter("age");
        
        if(ageInput != null){
            try{
                int age = Integer.parseInt(ageInput);

                age++;

                String message = String .format("You will be %d agter your birthday", age);

                request.setAttribute("message", message);

            } 
            catch(Exception ex){     
                request.setAttribute("message", "Please enter correct number.");     
            }
        }    
        else{  
            request.setAttribute("message", "Please enter correct number.");
            
        }

        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

}
