
import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserLoginConf extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String utype = request.getParameter("utype");
            String email = request.getParameter("email");
            String pswd = request.getParameter("pswd");
            DBCon db = new DBCon();
            db.pstmt = db.con.prepareStatement("select * from login where utype=? and email=? and pswd=?");
            db.pstmt.setString(1, utype);
            db.pstmt.setString(2, email);
            db.pstmt.setString(3, pswd);
            db.rst = db.pstmt.executeQuery();
            if (db.rst.next()) {
                if (utype.equals("Retailer")) {
                    response.sendRedirect("RetailDash.jsp");
                } else if (utype.equals("Salesman")) {
                    response.sendRedirect("SalesDash.jsp");
                } else if (utype.equals("Customer")) {
                    response.sendRedirect("CustomerDash.jsp");
                } else {
                    out.println("select Profile");
                }
            } else {
                out.println("Incorrect username or password");
            }
        } catch (Exception e) {
            e.printStackTrace();
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
