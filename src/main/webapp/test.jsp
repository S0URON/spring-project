<%@ page language="java" contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Gestion Category</title>

    <link  href = "bootstrap.min.css"  rel = " stylesheet " >
</head>
<body>
<p></p>

<div class="container">
    <table class="table table-striped" style="width:1000px">
        <tr>
            <th>id</th><th>Nom</th><th>Action</th>
        </tr>
        <c:forEach items="${liste}" var="c" >

            <tr>
                <td>${c.id}</td>
                <td>${c.name}</td>
                <td>
                    <a href="delete-category?id=${c.id}"class="btn btn-danger">Supprimer</a>
                </td>
            </tr>
        </c:forEach>

    </table>
    <br>
        <div class="card">

        <div class="card text-white bg-secondary">
            <div class="card-header">
                Ajouter une category
            </div>
        </div>
        <form action="add-category" method="post">
            <div class="form-group">
                <label class="form-label">nom :</label>
                <input type="text" name="name" class="form-control car"><br>
                <input type="submit" name="action" value="ajouter"class="btn btn-success">
            </div>
        </form>
    </div>
    <div>
        <a href="products">consulter liste produits</a>
    </div>
</div>


</body>
</html>