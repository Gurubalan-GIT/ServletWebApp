<%--
  Created by IntelliJ IDEA.
  User: Gurubalan
  Date: 12-06-2018
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Web Application</title>
  </head>
  <body>
  <h3>Sample From</h3>
  <form method="post" action="Servlet" onsubmit="return validate()" name="form">
      <label>Name</label>
      <input type="text" name="name" id="id-name" placeholder="Enter name!"/>
      <br>
      <br>
      <input type="submit" value="Submit!"/>
      <br>
  </form>
  <script src="Functions.js"></script>
  </body>
</html>
