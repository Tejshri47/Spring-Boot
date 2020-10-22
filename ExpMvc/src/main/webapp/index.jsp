<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h3>Welcome to Employee Registration Form </h3>
 
<form action ="addempdetails" method="post">
enter Id of employee :<input type="text" name="eid"><br>
enter name of employee: <input type ="text" name ="ename"><br>
Department : <input type="radio"  name ="dept" value ="hr department" >hr department
<input type="radio"  name ="dept" value ="IT dept" >IT dept
<input type="radio"  name ="dept" value ="Service dep" >Service dep
<input type="submit"><br>  <hr>
</form>


<form action="getbyeid" method ="get">
Enter the ID : <input type="text" name="eid"><br>
<input type="submit"><hr>
</form>

<form action= "getbyename" method ="get"> 
 Enter the emp name : <input type="text" name="ename"> <br>
 <input type="submit">
</form>


</body>
</html>