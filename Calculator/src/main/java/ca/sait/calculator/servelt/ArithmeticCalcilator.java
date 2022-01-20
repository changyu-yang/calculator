
package ca.sait.calculator.servelt;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author changyu yang
 */
public class ArithmeticCalcilator extends HttpServlet {

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

        String message = String.format("---");
        request.setAttribute("message", message);

        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
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
        
        String firstInput = request.getParameter("first");
        String secondInput = request.getParameter("second");
        String message = "";
        
        if (firstInput != null & secondInput != null) {
            try{
                int first = Integer.parseInt(firstInput);
                int second = Integer.parseInt(secondInput);
                String result = "";
                
                if (request.getParameter("plus") != null) {
                    result = Integer.toString(first + second);
                } else if (request.getParameter("minus") != null) {
                    result = Integer.toString(first - second);
                } else if (request.getParameter("multiple") != null) {
                    result = Integer.toString(first * second);
                } else if (request.getParameter("division") != null) {
                    result = Double.toString((first * 1.0) / second);
                }
                
                message = String.format("%d", result);

                request.setAttribute("firstInput", firstInput);
                request.setAttribute("secondInput", secondInput);                
                request.setAttribute("message", message);
                
            } catch (NumberFormatException ex) {
                // Input exists but is not a number.
                message = "invalid";

                request.setAttribute("message", message);
            } 
        } else {
            // Input is missing
            message = "invalid";

            request.setAttribute("message", message);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
    }

}
