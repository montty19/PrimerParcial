<%-- 
    Document   : agregar
    Created on : 15/08/2020, 09:09:07 PM
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
                    <h4> Agregar nueva Acta</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Carne</label>
                        <input type="text" name="car" class="form-control">
                         <label>Codigo_Curso</label>
                        <input type="text" name="cod" class="form-control">
                         <label>Codigo_catedratico</label>
                        <input type="text" name="codca" class="form-control">
                        <label>Fecha</label>
                         <input type="text" name="fe" class="form-control"><br>
                         <label>Nota</label>
                         <input type="text" name="not" class="form-control"><br>
                        <input type="submit" value="Agregar" class="btn btn-success">
                        <a href="actas.htm">Regresar</a>
                        </form>
                </div>
            </div>
        </div>
       
    </body>
</html>
