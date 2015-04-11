<%-- 
    Document   : index
    Created on : 1 Apr, 2015, 11:58:28 PM
    Author     : Jonty
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="card" scope="page" class="hibernate.helper.Card_handler" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          //plant.update_in_table(1, "alan", null);
            card.insert_into_table(5433,1);
                               %>
        <h1>Created!</h1>
    </body>
</html>
