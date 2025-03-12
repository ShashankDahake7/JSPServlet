<html>
<head>
<title>JavaBean Example</title>
</head>
<body>
<jsp:useBean id="cars" class="com.myCar.CarsBean">
<jsp:setProperty name="cars" property="carName" value="Swift" />
<jsp:setProperty name="cars" property="brandName" value="Maruti Suzuki" />
<jsp:setProperty name="cars" property="price" value="700000" />
</jsp:useBean>
<p>Car Name: <jsp:getProperty name="cars" property="carName" /></p>
<p>Brand Name: <jsp:getProperty name="cars" property="brandName" /></p>
<p>Price: <jsp:getProperty name="cars" property="price" /></p>
</body>
</html>