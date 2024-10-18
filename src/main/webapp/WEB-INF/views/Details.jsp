<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<style type="text/css">
    label {
        display: inline-block;
        width: 200px;
        margin: 5px;
        text-align: left;
    }
    input[type=text], input[type=password], select {
        width: 200px;  
    }
    input[type=radio] {
        display: inline-block;
        margin-left: 45px;
    }
    input[type=checkbox] {
        display: inline-block;
        margin-right: 190px;
    }  
     
    button {
        padding: 10px;
        margin: 10px;
    }
    </style>
<title>Insert title here</title>
</head>
<body>

<div align="center">
        <h2> Nive Pizza Hut</h2>
        <form:form action="Details" method="post" modelAttribute="pizza">
            
            <form:label path="pizzasize">Pizza Sizes:</form:label>
            <form:select path="pizzasize" items="${sizelist}" /><br/>
            
         <%--    <form:label path="pizzasizecost">Pizza Sizes Cost:</form:label>
            <form:select path="pizzasizecost" items="${pizzasizecost}" /><br/> --%>
            
              <form:label path="pizzasizeqty">Pizza Quantity:</form:label>
            <form:select path="pizzasizeqty" items="${pizzasizeqty}" /><br/>
            
              <center><label>Pizza Cost</label>
		<input type="text" id="pizzasizecost" class="form-control" name="pizzasizecost" >	
	      </center>
                     
            <form:label path="pizzatoppings">Pizza Toppings:</form:label>
            <form:select path="pizzatoppings" items="${toppingslist}" /><br/>
            
                <form:label path="pizzatoppingqty">Pizza Toppings Quantity:</form:label>
            <form:select path="pizzatoppingqty" items="${pizzatoppingqty}" /><br/>
            
          <center>  <label>Pizza Cost</label>
		<input type="text" id="pizzatoppingscost" class="form-control" name="pizzatoppingscost" >	
	        </center>
            
              <form:label path="colddrinks">Cold Drinks:</form:label>
            <form:select path="colddrinks" items="${colddrinkslist}" /><br/>
            
                <form:label path="colddrinksqty">Cold Drinks Quantity:</form:label>
            <form:select path="colddrinksqty" items="${colddrinksqty}" /><br/>
            
          <center>  <label>Cold Drinks Cost</label>
		<input type="text" id="colddrinkscost" class="form-control" name="colddrinkscost" >	
	        </center>
                              
           
            <form:button>Place Order</form:button>
        </form:form>
    </div>

</body>
</html>