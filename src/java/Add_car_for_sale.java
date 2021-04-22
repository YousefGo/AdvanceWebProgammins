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
public class Add_car_for_sale extends HttpServlet {

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
            out.println("<title>Servlet Add_car_for_sale</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Add_car_for_sale at " + request.getContextPath() + "</h1>");
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
        PrintWriter out = response.getWriter();
        String Manufacturer = request.getParameter("Manufacturer");
        String Model = request.getParameter("Model");
        String Type = request.getParameter("Type");
        String Year_of_Manufacturing = request.getParameter("Year_of_Manufacturing");
        String Miles = request.getParameter("Miles");
        String price = request.getParameter("price");
        String HasAC = request.getParameter("HasAC");
        String HasDVD = request.getParameter("HasDVD");
        String Comments = request.getParameter("Comments");

//        out.println("<h1>  Wellcome</h1>");
//        out.println(Manufacturer);
//        out.println(Model);
//        out.println(Type);
//        out.println(Year_of_Manufacturing);
//        out.println(Miles);
//        out.println(price);
//        out.println(HasAC);
//        out.println(HasDVD);
//        out.println(Comments);

        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost:3306/csis";

        //  Database credentials
        final String USER = "yousef";
        final String PASS = "123456";
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Add_car_for_sale.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "insert into cars(Manufacturer,Model,Type,Year_of_Manufacturing,miles,"
                    + "price,hasAC,hasDVD,comments,CreationDateTime) values(?,?,?,?,?,?,?,?,?,?)";

            java.util.Date dt = new java.util.Date();

            java.text.SimpleDateFormat sdf
                    = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String currentTime = sdf.format(dt);

            PreparedStatement stmt = conn.prepareStatement(sql);
            int year = Integer.parseInt(Year_of_Manufacturing);
            int miles = Integer.parseInt(Miles);
            float priceF = Float.parseFloat(price);
            stmt.setString(1, Manufacturer);
            stmt.setString(2, Model);
            stmt.setString(3, Type);
            stmt.setInt(4, year);

            stmt.setInt(5, miles);
            stmt.setFloat(6, priceF);
            stmt.setString(7, HasAC);
            stmt.setString(8, HasDVD);
            stmt.setString(9, Comments);
            stmt.setString(10, currentTime);
            try {
                int k = stmt.executeUpdate();

                System.out.println(k);
                if (k == 1) {
                response.sendRedirect("Browse_All_Cars");
                } else {

                }
            } catch (SQLException ex) {
                Logger.getLogger(Add_car_for_sale.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Add_car_for_sale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
        
        
            () {
        return "Short description";
        }// </editor-fold>

    }
