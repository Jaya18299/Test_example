package com.hibernate.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.bean.User;
import com.hibernate.dao.UserDao;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//String id = request.getParameter("id");
		String name = request.getParameter("name");
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		if (name != null && userId != null && password != null) {
			//User u = new User(name,userId,password);
			UserDao ud = new UserDao();
			ud.add(name,userId,password);
	}
         out.close();
	}
}
