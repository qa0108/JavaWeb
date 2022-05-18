/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(name = "Welcome", urlPatterns = {"/Welcome"})
public class Welcome extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Welcome</title>");  
            out.println("<link href='CSS/myStyle.css' rel='stylesheet'/>");
            out.println("<script>");
            out.println("flag = true;\n" +
"function myFun(i,j,n){\n" +
"    var obj = document.getElementById(\"id\"+ (i*n+j));\n" +
"    if(!obj){} else{\n" +
"        obj.innerHTML = flag? \"X\":\"O\";\n" +
"        flag =!flag;\n" +
"    }\n" +
"}");
            out.println("</script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Welcome at " + request.getContextPath() + "</h1>");
            int n = Integer.parseInt(request.getParameter("size"));
            String s= "<table>";  
            for (int i = 0; i < n; i++) {
                s+="<tr>";
                for (int j = 0; j < n; j++) {
//                    if((i+j)%2==0){
//                        s+="<td style = 'background-color:red'>";
//                    }
//                    else{
//                        s+="<td style = 'background-color:blue'>";
//                    }
                    //s+="<td style = 'background-color:"+((i+j)%2==0?"orange":"pink")+"'>";
                    //s+="<td class='"+((i+j)%2==0?"red":"blue")+"'>";
                    s+="<td id='id"+(i*n+j)+"' onclick='myFun("+i+","+j+","+n+")'>";
                    s+="";
                    s+="</td>";
                }
                s+="</tr>";
            }
            s+="</table>";
            out.println(s);
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
