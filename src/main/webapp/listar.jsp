<%-- 
    Document   : listar
    Created on : 18 ago. 2023, 19:19:20
    Author     : Eslover
--%>

<%@page import="co.sena.edu.greenlightweb.logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de usuarios</h1>
        
        <%
            List<Usuario> usuarios = (List) request.getSession().getAttribute("listaUsuarios");
            int cont = 1;
            for (Usuario u : usuarios) {
        %>
        
        <p><b>usuario número: <%=cont%></b></p>
        <p><%=u%></p>
        <%cont=cont+1;%>
        <%}%>
    </body>
</html>
