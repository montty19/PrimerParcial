<%-- 
    Document   : actas
    Created on : 16/08/2020, 12:58:42 PM
    Author     : Alejandro Montalvo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>Primer Parcial</title>
    </head>
    <body>
       <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a class="btn btn-primary" href="agregar_acta.htm">Nueva Acta</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Carne</th>
                                <th>Codigo_curso</th>
                                <th>Codigo_catedratico</th>
                                <th>Fecha</th>
                                <th>Nota</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="dato" items="{lista}">
                            <tr>
                                <td>${dato.Id}</td>
                                <td>${dato.Carne}</td>
                                <td>${dato.Codigo_curso}</td>
                                <td>${dato.Codigo_catedratico}</td>
                                <td>${dato.Fecha}</td>
                                <td>${dato.Nota}</td>
                                <td>
                                    <a href="editar_acta.htm?id=${dato.Id}" class="btn btn-warning">Editar</a>
                                    <a href="eliminar_acta.htm?id=${dato.Id}" class="btn btn-danger">Eliminar</a>
                                </td>
                            </tr>
                        </c:forEach>    
                        </tbody>
                    </table>                                                    
                </div>
            </div>
        </div>
    </body>
</html>
