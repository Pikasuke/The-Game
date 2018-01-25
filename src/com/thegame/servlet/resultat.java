package com.thegame.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.thegame.model.Bon;
import com.thegame.model.Mauvais;

/**
 * Servlet implementation class resultat
 */
@WebServlet("/resultat")
public class resultat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public resultat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		String nom = (String) session.getAttribute("nom");
		Mauvais mechant = (Mauvais) session.getAttribute("mechant");
		Bon gentil = (Bon) session.getAttribute("gentil");
		
		request.setAttribute("nom", nom);
		request.setAttribute("mechant", mechant);
		request.setAttribute("gentil", gentil);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/resultat.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
