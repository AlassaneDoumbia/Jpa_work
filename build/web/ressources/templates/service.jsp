<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <section id="portfolio" class="clearfix">
      <div class="container">

        <header class="section-header">
          <h3 class="section-title">Services</h3>
        </header>
        <div class="row portfolio-container">
          <div class="col-lg-4 col-md-6 portfolio-item filter-web" data-wow-delay="0.1s">
            <div class="portfolio-wrap">
              <img src="<c:url value="ressources/img/portfolio/web3.jpg" />" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4><a href="<c:url value="#" />">Etudiant</a></h4>
                <p>Ajouter un Etudiant</p>
                <div>
                  <a href="<c:url value="ressources/img/portfolio/web3.jpg" />" class="link-preview" data-lightbox="portfolio" data-title="Web 3" title="Preview"><i class="ion ion-eye"></i></a>
                  <a href="<%=request.getContextPath()%>/Ajouter" class="link-details" title="Aller au formulaire"><i class="ion ion-android-open"></i></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-4 col-md-6 portfolio-item filter-web" data-wow-delay="0.1s">
            <div class="portfolio-wrap">
              <img src="<c:url value="ressources/img/portfolio/web3.jpg" />" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4><a href="<c:url value="#" />">Etudiant</a></h4>
                <p>Liste des Etudiants</p>
                <div>
                  <a href="<c:url value="ressources/img/portfolio/web3.jpg" />" class="link-preview" data-lightbox="portfolio" data-title="Web 3" title="Preview"><i class="ion ion-eye"></i></a>
                  <a href="<%=request.getContextPath()%>/ModifierEtudiant" class="link-details" title="Voir liste des etudiants"><i class="ion ion-android-open"></i></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-4 col-md-6 portfolio-item filter-web" data-wow-delay="0.1s">
            <div class="portfolio-wrap">
              <img src="<c:url value="ressources/img/portfolio/web3.jpg" />" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4><a href="<c:url value="#" />">Ecole</a></h4>
                <p>Ajouter une Ecole</p>
                <div>
                  <a href="<c:url value="ressources/img/portfolio/web3.jpg" />" class="link-preview" data-lightbox="portfolio" data-title="Web 3" title="Preview"><i class="ion ion-eye"></i></a>
                  <a href="<c:url value="ajoutEcole.jsp" />" class="link-details" title="More Details"><i class="ion ion-android-open"></i></a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-4 col-md-6 portfolio-item filter-web" data-wow-delay="0.1s">
            <div class="portfolio-wrap">
              <img src="<c:url value="ressources/img/portfolio/web3.jpg" />" class="img-fluid" alt="">
              <div class="portfolio-info">
                <h4><a href="<c:url value="#" />">Ecole</a></h4>
                <p>Liste des Ecoles</p>
                <div>
                  <a href="<c:url value="ressources/img/portfolio/web3.jpg" />" class="link-preview" data-lightbox="portfolio" data-title="Web 3" title="Preview"><i class="ion ion-eye"></i></a>
                  <a href="<c:url value="listeEcole.jsp" />" class="link-details" title="More Details"><i class="ion ion-android-open"></i></a>
                </div>
              </div>
            </div>
          </div>
        </div>

      </div>
    </section><!-- #portfolio -->

</html>
