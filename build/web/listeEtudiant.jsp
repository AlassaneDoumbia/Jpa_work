<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste Etudiant</title>
        <c:import url="ressources/templates/head.jsp" />
    </head>
    <body>
        <h1>OKAY</h1>
        <div style="margin-left: 200px">
            <table class="table table-bordered table-striped col-lg-8">
                <c:forEach items="${listeEtudiant}" var="liste">
                    <tr>
                        <td>${liste.nom}</td>
                        <td>${liste.prenom}</td>
                        <td>${liste.id}</td>
                        <td><button onclick="<%=request.getContextPath()%>/ModifierEtudiant/${liste.id}"></button></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
