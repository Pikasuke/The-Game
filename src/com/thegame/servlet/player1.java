package com.thegame.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class player1
 */
@WebServlet("/player1")
public class player1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public player1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		String nom = request.getParameter("name");

		request.setAttribute("nom", nom);

		System.out.println(nom + request.getParameter("bon") );

		if (nom != null && request.getParameter("bon") != null) {
			session.setAttribute("name", nom);
			session.setAttribute("cool", request.getParameter("bon"));
			
			response.sendRedirect("player2");

		} else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/player1.jsp").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
