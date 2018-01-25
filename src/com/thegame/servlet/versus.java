package com.thegame.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.thegame.model.Archer;
import com.thegame.model.Assassin;
import com.thegame.model.Berserker;
import com.thegame.model.Bon;
import com.thegame.model.Guerrier;
import com.thegame.model.Mage;
import com.thegame.model.Mauvais;
import com.thegame.model.Necromantien;

/**
 * Servlet implementation class versus
 */
@WebServlet("/versus")
public class versus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public versus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession(true);
		String cool = (String) session.getAttribute("cool");
		String vilain = (String) session.getAttribute("vilain");
		String nom = (String) session.getAttribute("name");
		
		Bon gentil = new Bon();
		String player = new String("");
		Integer initPv = new Integer(0);
			switch (cool)
			{
			  case "archer":
				  Archer archer = new Archer();
				  gentil = archer;
				  player="kakashi";
			    break;
			  case "mage":
			    	Mage mage = new Mage();
			    	 gentil = mage;
			    	 player="vegeta";
			    break;
			  case "guerrier":
				  Guerrier guerrier = new Guerrier();
				  gentil = guerrier;
				  player="felicia";
			    break;
			  default:
			}
		gentil.setNom(nom);
		initPv = gentil.getPv();
		request.setAttribute("player", player);	
		request.setAttribute("gentil", gentil);
		request.setAttribute("gentilIPV", initPv);
		
		Mauvais vraimechant = new Mauvais();
		String charactere = new String("");
		Integer iniPv = new Integer(0);
			switch (vilain)
		{
		  case "assassin":
			  Assassin assassin = new Assassin();
			  vraimechant = assassin;
			  charactere="mai";
		    break;
		  case "necromantien":
			  Necromantien necromantien = new Necromantien();
			  vraimechant = necromantien;
			  charactere="bryan";
		    break;
		  case "berserker":
			  Berserker berserker = new Berserker();
			  vraimechant = berserker;
			  charactere="ichigo";
		    break;
		  default:
		}
			
		iniPv = vraimechant.getPv();
		request.setAttribute("charactere", charactere);		
		request.setAttribute("mechant", vraimechant);
		request.setAttribute("mechantIPV", iniPv);
		
		session.setAttribute("name", nom);
		session.setAttribute("mechant", vraimechant);
		session.setAttribute("gentil", gentil);
		session.setAttribute("player", player);
		session.setAttribute("charactere", charactere);
		session.setAttribute("gentilIPV", initPv);
		session.setAttribute("mechantIPV", iniPv);
		
		String start = request.getParameter("start");
		
		if (start!=null) {
		response.sendRedirect("fight");
		} else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/versus.jsp").forward(request,response);
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
	this.getServletContext().getRequestDispatcher("/WEB-INF/versus.jsp").forward(request,response);
}
}
