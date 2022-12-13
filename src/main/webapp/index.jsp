<%@ page language="java" contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion Produit</title>
 
 <link  href = "bootstrap.min.css"  rel = " stylesheet " >
</head>
<body>
<p></p>
    
     <div class="container">
         <%--<div class="card">
                 <div class="card text-white bg-dark">
                 <div class="card-header">
                      Recherche des Produits
                 </div>
                 </div>

                <form action="ProdMotCle" method="get">
                      <div class="card-body">
                          <label class="col-md-2">Mot cle</label>
                          <input type="text" name="mc">
                           <input type="submit" name="action" value="rechercher"class="btn btn-primary">
                       </div>
                 </form>
            </div>
           <c:if test="${LV==false }">--%>
              
                <table class="table table-striped" style="width:1000px">
                      <tr>
                           <th>id</th><th>Nom</th><th>prix</th> <th>categorie</th><th>Action</th>
                       </tr>
                    <c:forEach items="${liste}" var="p" >
                       
                        <tr>
                             <td>${p.id}</td>
                             <td>${p.name}</td>
                             <td>${p.price}</td>
                             <td>${p.category.name}</td>
                             <td>
                                 <a href="delete-product?id=${p.id}"class="btn btn-danger">Supprimer</a>
                                 <a href="edit-products?id=${p.id}"class="btn btn-success">Modifer</a>
                             </td>
                             
                         </tr>
                      </c:forEach>
                 
                  </table>
            <%--</c:if>--%>
<br>

     <div class="card">
                  
                  <div class="card text-white bg-secondary">
                     <div class="card-header">
                        Ajouter un produit
                    </div>
                   </div>
               <form action="add-product" method="post">
               
                    <div class="form-group">
                    
                          <label class="form-label">nom :</label>
                          <input type="text" name="name" class="form-control car"><br>
                          <label class="form-label">prix :</label>
                          <input type="Number" name="price" class="form-control car"><br>
                          <label class="form-label">Categorie</label>
                          <select name="category">
                               <c:forEach items="${categorie}" var="x">
                                   <option value="${x.id}">"${x.name}"</option>
                                </c:forEach>
                          </select>
                            <br>
                          <input type="submit" name="action" value="ajouter"class="btn btn-success">
                          
                      </div>
                </form>
         </div>
         <div>
             <a href="category-list">consulter liste categories</a>
         </div>
    </div>


</body>
</html>