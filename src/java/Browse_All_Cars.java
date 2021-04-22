/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mobai
 */
public class Browse_All_Cars extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Browse_All_Cars</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Browse_All_Cars at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        PrintWriter out = response.getWriter();
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost:3306/csis";

        //  Database credentials
        final String USER = "yousef";
        final String PASS = "123456";
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Browse_All_Cars.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "select * from cars";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            out.println(" <head>\n"
                    + " <meta charset=\"UTF-8\">\n"
                    + "    <meta name=\"description\" content=\"Browse  all  car page\">\n"
                    + "    <meta name=\"keywords\" content=\"car ,Broese \">\n"
                    + "    <meta name=\"author\" content=\"Yousef sarkar\">");
            out.println("    <title>Brwose all cars </title>\n"
                    + "");
            out.println("    <link rel=\"stylesheet\" href=\"css/style.css\">\n"
                    + "</head>");
            out.println("<body>\n"
                    + "    <nav class=\"nav\">\n"
                    + "        <ul>\n"
                    + "            <li><a href=\"Add_Car_for_Sale.html\">ADD CAR For sale</a></li>\n"
                    + "            <li><a href=\"Browse_All_Cars\"> browse all car</a></li>\n"
                    + "        </ul>\n"
                    + "\n"
                    + "    </nav>");
              out.print("<table id=\"tbl\"> <tr> "
                    + "<th>ID </th>"
                    + "<th> Manufacturer</th>"
                    + "<th> Model</th>"
                    + "<th>Type </th>"
                    + "<th> Year_of_Manufacturing</th>"
                    + "<th> Miles</th>"
                    + "<th> price</th>"
              
                    + "<th> create time </th>"
                
                    + "  </tr>");
                  while (rs.next()) {
                out.print("<tr><td>");
                out.print(rs.getString("id"));
                out.print("</td>");
                out.print("<td>" + rs.getString("Manufacturer") + "</td>");
                out.print("<td>" + rs.getString("Model") + "</td>");
                out.print("<td>" + rs.getString("Type") + "</td>");
                out.print("<td>" + rs.getString("Year_of_Manufacturing") + "</td>");
                out.print("<td>" + rs.getString("Miles") + "</td>");
                out.print("<td>" + rs.getString("price") + "</td>");
            
                out.print("<td>" + rs.getString("CreationDateTime") + "</td>");

                out.print("</tr>");

            }
        } catch (SQLException ex) {
            Logger.getLogger(Browse_All_Cars.class.getName()).log(Level.SEVERE, null, ex);
        }

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
