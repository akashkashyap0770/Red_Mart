import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterConf extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         String utype=request.getParameter("utype");
          String uname=request.getParameter("uname");
          String udob=request.getParameter("udob");
          String email=request.getParameter("email");
          String pswd=request.getParameter("pswd");
          String cpswd=request.getParameter("cpswd");
          DBCon db=new DBCon();
          if(pswd.equals(cpswd))
          {
            db.pstmt=db.con.prepareStatement("INSERT  INTO register(utype,uname,udob,email) values(?,?,?,?)");
            db.pstmt.setString(1, utype);
            db.pstmt.setString(2, uname);
            db.pstmt.setString(3, udob);
            db.pstmt.setString(4, email);
            int i1=db.pstmt.executeUpdate();//
            db.pstmt=db.con.prepareStatement("INSERT INTO login(email,pswd,utype)values(?,?,?)");
            db.pstmt.setString(1, email);
            db.pstmt.setString(2, pswd);
            db.pstmt.setString(3, utype);
            int i2=db.pstmt.executeUpdate();
            if(i1>0 && i2>0)
                 response.sendRedirect("UserLogin.jsp?msg=User Registeration Successfully");
            else
                 out.println("Error in Registeration");
          }
          
          else
          {
              response.sendRedirect("Register.jsp?msg=Password and COnfirm Password does not Match");
          }
        }
        catch(Exception e)
        {
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
