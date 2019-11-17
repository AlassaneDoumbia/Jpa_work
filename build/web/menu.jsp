<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div id="menu">
    <ul>
        <li><a href="index.jsp">Accueil</a></li>
        <div class="dropdown">
            <li class="dropbtn"><a href="#">Etudiant</a></li>
            <div class="dropdown-content">
                <a href="listeEtudiant.jsp">Liste</a>
                <a href="ajoutEtudinat.jsp">Ajouter</a>
            </div>
        </div>
        <div class="dropdown">
            <li class="dropbtn"><a href="#">Ecole</a></li>
            <div class="dropdown-content">
                <a href="listeEcole.jsp">Liste</a>
                <a href="ajoutEcole.jsp">Ajout</a>
            </div>
        </div>
        <li><a href="listeCmd.php">Notes</a></li>
    </ul>
</div>>
