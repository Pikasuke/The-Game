package com.thegame.servlet;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.thegame.model.Bon;
import com.thegame.model.Mauvais;

/**
 * Servlet implementation class fight
 */
@WebServlet("/fight")
public class fight extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public fight() {
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
		String nom = (String) session.getAttribute("nom");
		Mauvais mechant = (Mauvais) session.getAttribute("mechant");
		Bon gentil = (Bon) session.getAttribute("gentil");
		String player = (String) session.getAttribute("player");
		String charactere = (String) session.getAttribute("charactere");
		Integer gentilIPV = (Integer) session.getAttribute("gentilIPV");
		Integer mechantIPV = (Integer) session.getAttribute("mechantIPV");

		System.out.println("Attaque " + request.getParameter("attaque"));

		// Calcul de vie
		Double gVie = (gentil.getPv() / (double) gentilIPV * 100);
		Double mVie = (mechant.getPv() / (double) mechantIPV) * 100;

		NumberFormat nf = new DecimalFormat("0.##");
		String bonVie = nf.format(gVie);
		String badVie = nf.format(mVie);

		// Envoie donnée à la vue
		request.setAttribute("player", player);
		request.setAttribute("charactere", charactere);
		request.setAttribute("nom", nom);
		request.setAttribute("mechant", mechant);
		request.setAttribute("gentil", gentil);
		request.setAttribute("gIPV", gentilIPV);
		request.setAttribute("mIPV", mechantIPV);
		request.setAttribute("bonVie", bonVie);
		request.setAttribute("badVie", badVie);

		if (request.getParameter("attaque") == null) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/fight.jsp").forward(request, response);
			} else {
				Integer att = Integer.parseInt(request.getParameter("attaque"));
				gentil.attaquer(mechant, att);
				// on arrÃªte le combat avant que le mechant attaque si on a gagne
					if (mechant.getPv() <= 0) {
						this.getServletContext().getRequestDispatcher("/WEB-INF/resultat.jsp").forward(request, response);
					} else {
							//this.getServletContext().getRequestDispatcher("/WEB-INF/fight.jsp").forward(request, response);
						}
	
				mechant.attaquer(0, gentil); // choix est inutile ici
				// on arrete le combat si on a perdu
					if (gentil.getPv() <= 0) {
						System.out.println("Tes mort 1");
						this.getServletContext().getRequestDispatcher("/WEB-INF/resultat.jsp").forward(request, response);
							System.out.println("Tes mort 2");
					} else {
		
						this.getServletContext().getRequestDispatcher("/WEB-INF/fight.jsp").forward(request, response);
						}
			}
		System.out.println("sortie if");

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
