<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="modal-dialog text-center">
            <div class="col-lg-8">
                <div class="modal-content">
                    <div class="col-12">
                    <img src="img/49c8e403cd1929e9e7b02126824ff831.jpg" alt="avatar" height="128" width="128"/>
                    </div>
                    <form action="MiSesionCTO?accion=validar" method="POST" class="col-12">
                        <div class="form-group text-center">
                            <p>Bienvenido al sistema de Acceso</p>
                        </div>
                        <div class="form-group">
                            <label>Usuario: </label>
                            <input type="text" name="txtUsuario" placeholder="ejemplo@gmail.com" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Clave de Acceso: </label>
                            <input type="password" name="txtPss" placeholder="Clave" class="form-control" required>
                        </div>

                        <input type="submit" name="btnIngresar" value="Ingresar" class="btn btn-primary">
                    </form>    
                </div>
            </div>
        </div>
        <a href="ProductoCTO?accion=listar_datos">Listar Productos</a>
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>
    </body>
</html>
