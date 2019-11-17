package sn.esmt.presentation;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sn.esmt.domaine.Etudiant;
import sn.esmt.service.IEtudiantService;
import sn.esmt.service.IEtudiantServiceImpl;


@WebServlet("/ModifierEtudiant")
public class ModifierEtudiant extends HttpServlet {

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierEtudiant() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        IEtudiantService  ies= new IEtudiantServiceImpl();
        List<Etudiant> liste = ies.listeEtudiant();
        request.setAttribute("listeEtudiant", liste);
        System.out.println("sn.esmt.presentation.ModifierEtudiant.doGet()");
        request.getRequestDispatcher("/listeEtudiant.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
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
