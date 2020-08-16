<%-- 
    Document   : estudiantes
    Created on : 15/08/2020, 11:58:38 PM
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
                    <a class="btn btn-primary" href="agregar.htm">Nuevo Estudiante</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>Carne</th>
                                <th>Carrera</th>
                                <th>Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="dato" items="{lista}">
                            <tr>
                                <td>${dato.Id}</td>
                                <td>${dato.Nombre}</td>
                                <td>${dato.Apellido}</td>
                                <td>${dato.Carne}</td>
                                <td>${dato.Carrera}</td>
                                <td>
                                    <a href="editar.htm?id=${dato.Id}" class="btn btn-warning">Editar</a>
                                    <a href="eliminar.htm?id=${dato.Id}" class="btn btn-danger">Eliminar</a>
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
