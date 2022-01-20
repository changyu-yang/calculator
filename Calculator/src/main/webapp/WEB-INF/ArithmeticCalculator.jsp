<%-- 
    Document   : ArithmeticCalculator
    Created on : Jan 19, 2022, 5:50:02 PM
    Author     : didck
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post">
            <label for="first">First: </label>
            <input type="number" name="first"id="first">
            <br> 
            <label for="second">Second: </label>
            <input type="number" name="second"id="second">
            <br>
            <button type="submit" id="plus" value="+" name="operator">+</button>
            <button type="submit" id="minus" value="-" name="operator">-</button>
            <button type="submit" id="multiple" value="*" name="operator">*</button>
            <button type="submit" id="division" value="%" name="operator">%</button>
            <br>
            Result: ${result}
        </form>
        
        <a href="age">Age Calculator</a>
    </body>
</html>
