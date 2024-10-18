<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
    span {
        display: inline-block;
        width: 200px;
        text-align: left;
    }
</style>

</head>
<body>

 <div align="center">
        <h2>Bill Recipite</h2>
       
        <span>Pizza Size:</span><span>${pizza.pizzasize}</span><br/>
         <span>Pizza Size Cost:</span><span>${pizza.pizzasizecost}</span><br/>
         <span>Pizza Quantity:</span><span>${pizza.pizzasizeqty}</span><br/>
         
          <span>Pizza Topping:</span><span>${pizza.pizzatoppings}</span><br/>
         <span>Pizza Toppings Cost:</span><span>${pizza.pizzatoppingscost}</span><br/>
         <span>Pizza Toppings Quantity:</span><span>${pizza.pizzatoppingqty}</span><br/>
         
           <span>Cold Drinks:</span><span>${pizza.colddrinks}</span><br/>
         <span>Cold Drinks Cost:</span><span>${pizza.colddrinkscost}</span><br/>
         <span>Cold Drinks Quantity:</span><span>${pizza.colddrinksqty}</span><br/>
         
         
         
         <span>Total:</span><span>${pizza.fun()}</span><br/>
    </div>

</body>
</html>