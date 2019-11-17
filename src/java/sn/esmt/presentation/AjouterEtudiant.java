package sn.esmt.presentation;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.esmt.dao.EtudiantDaoImpl;
import sn.esmt.domaine.Etudiant;
import sn.esmt.service.IEtudiantService;
import sn.esmt.service.IEtudiantServiceImpl;

/**
 * Servlet implementation class AjouterEtudiant
 */
@WebServlet("/Ajouter")
public class AjouterEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterEtudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
            IEtudiantService  ies= new IEtudiantServiceImpl();
            List<Etudiant> liste = ies.listeEtudiant();
            request.setAttribute("listeEtudiant", liste);
            request.getRequestDispatcher("/ajoutEtudiant.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            System.out.println(request.getParameter("nom")+" "+request.getParameter("prenom"));
            Etudiant etudiant = new Etudiant(request.getParameter("nom"),request.getParameter("prenom"));
            IEtudiantService  ies= new IEtudiantServiceImpl();
            ies.addEtudiant(etudiant);
            request.setAttribute("etudiant", etudiant);
            request.getRequestDispatcher("/ajoutEtudiant.jsp").forward(request, response);
	}

}
