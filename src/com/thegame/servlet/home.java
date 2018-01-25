package com.thegame.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class home
 */
@WebServlet("/home")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public home() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession(true);
		String nom = request.getParameter("name");

		request.setAttribute("nom", nom);

		System.out.println(nom + request.getParameter("bon") + request.getParameter("mechant"));

		if (nom != null && request.getParameter("bon") != null && request.getParameter("mechant") != null) {
			session.setAttribute("name", nom);
			session.setAttribute("cool", request.getParameter("bon"));
			session.setAttribute("vilain", request.getParameter("mechant"));

			response.sendRedirect("versus");

		} else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
