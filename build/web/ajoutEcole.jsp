<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajouter Etudiant</title>
        <c:import url="ressources/templates/head.jsp" />
    </head>
    <body>
        
        
        <main id="main">
        <section id="contact">
          <div class="container-fluid">

            <div class="section-header">
              <h3>Ajouter une Ecole</h3>
            </div>

            <div class="row wow fadeInUp">

              <div class="col-lg-12">
                <div class="form">
                  <div id="sendmessage">L'etudiant a été bien enregistre. Merci!</div>
                  <div id="errormessage"></div>
                  <form action="<%=request.getContextPath()%>/Ajouter" method="post" role="form" class="contactForm">
                    <div class="form-row">
                      <div class="form-group col-lg-6">
                        <input type="text" name="nom" class="form-control" id="name" placeholder="Votre Nom" data-rule="minlen:2" data-msg="S'il vous plait entrez au moins 2 charactères" />
                        <div class="validation"></div>
                      </div>
                      <div class="form-group col-lg-6">
                        <input type="text" class="form-control" name="prenom" id="email" placeholder="Votre Prenom" data-rule="minlen:2" data-msg="S'il vous plait au moins 2 charactères" />
                        <div class="validation"></div>
                      </div>
                    </div>
                    <div class="form-group">
                      <textarea class="form-control" name="Description" rows="5" data-rule="required" data-msg="Please write something for us" placeholder="Message"></textarea>
                      <div class="validation"></div>
                    </div>
                    
                    <div class="text-center"><button type="submit" title="Send Message">Enregistrer</button></div>
                  </form>
                </div>
              </div>

            </div>

          </div>
        </section><!-- #contact -->
        </main>
        <a href="<c:url value="#" />" ><i class="fa fa-chevron-up"></i></a>
        <c:import url="ressources/templates/footer.jsp" />
    </body>
</html>
