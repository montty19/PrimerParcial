<%-- 
    Document   : editar
    Created on : 15/08/2020, 11:06:05 PM
    Author     : Alejandro Montalvo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>Primer Parcial</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-5">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4> Actualizar estudiante</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Nombre</label>
                        <input type="text" name="nom" class="form-control" value ="${lista[0].Nombre}">
                         <label>Apellido</label>
                        <input type="text" name="ape" class="form-control" value ="${lista[0].Apellido}">
                         <label>Carne</label>
                        <input type="text" name="car" class="form-control" value ="${lista[0].Carne}">
                         <label>Carrera</label>
                        <input type="text" name="cae" class="form-control" value ="${lista[0].Carrera}"><br>
                        <input type="submit" value="Actualizar" class="btn btn-success">
                        <a href="estudiantes.htm">Regresar</a>
                        </form>
                </div>
            </div>
        </div>
    </body>
</html>
