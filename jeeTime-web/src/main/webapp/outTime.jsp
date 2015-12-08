<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Current time</title>
    </head>
    <body>
        <h1> <%= response.getHeader("Date")%></h1>
    </body>
</html>
