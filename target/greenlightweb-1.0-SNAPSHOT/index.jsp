<%-- 
    Document   : index
    Created on : 18 ago. 2023, 10:28:08
    Author     : Eslover
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/estilos.css"/>
    </head>
     <body>
        <div class="cuerpo">

            <header>
                <img src="img/saveFreepik.png" alt="no carga">
            </header>

            <nav>
                
            </nav>

            <section>
                <article>
                    <fieldset> 
                        <legend>Registrar Usuario</legend>
                        <form action="SvUsuario" method="POST">
                            <label for="txtCodigo">Código:</label><br>
                            <input type="number" id="txtCodigo" name="codigo" ><br>
                            <label for="txtNombre">Nombre:</label><br>
                            <input type="text" id="txtNombre" name="nombre"><br>
                            <label for="txtApellido">Apellido:</label><br>
                            <input type="text" id="txtApellido" name="apellido" ><br>
                            <label for="txtEdad">Edad</label><br>
                            <input type="number" id="txtEdad" name="edad" ><br><br>
                            <input type="submit" value="Registrar">
                        </form>
                    </fieldset>  
                </article>
                
                <article>
                    <fieldset> 
                        <legend>Listar Usuarios</legend>
                        <p>Para listar usuarios presione el siguiente boton</p>
                        
                        <form action="SvUsuario" method="GET">
                    
                            <input type="submit" value="Consultar">
                        </form>
                    </fieldset>  
                </article>
                
            </section>

            <footer>

                <h2>Reg&iacute;strate en GreenLight</h2>
            </footer>

        </div>
    </body>
</html>