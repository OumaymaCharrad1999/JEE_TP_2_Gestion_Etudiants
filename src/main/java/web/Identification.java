package web;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Servlet implementation class Identification
*/
@WebServlet("/Identification")
public class Identification extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
    * @see HttpServlet#HttpServlet()
    */
    public Identification() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

    /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	if(username.equals(password)) {
            response.sendRedirect("insertionEtudiant.html");
	} 
        else {
            response.sendRedirect("echec.html");
        }		
    }
}