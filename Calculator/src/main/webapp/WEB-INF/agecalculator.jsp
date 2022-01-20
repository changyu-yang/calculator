<%-- 
    Document   : agecalculator
    Created on : Jan 19, 2022, 5:23:39 PM
    Author     : didck
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    
        <h1>Age Calculator</h1>
        
        <form action="age" method="post">
            <label for="age">Enter your age: </label>
            <input type="number" name="age"id="age">
            
            <button type="submit">Submit</button>
        </form>
        
       ${message}
       
       <br>
       <a href="airthmetic">Arithmetic Calculator</a>
            
    
</html>
