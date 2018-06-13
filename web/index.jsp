<%--
  Licensed and Created by: Gurubalan Harikrishnan.
  For Educational purposes only.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Web Application</title>
  </head>
  <body class="body">
  <h3>Sample From</h3>
      <div class="div1">
          <form method="post" action="Servlet" onsubmit="return validate()" name="form">
              Firstname: <input type="text" name="fn" id="id-fn" placeholder="Enter name!"/>
              <br/>
              <br/>
              Lastname: <input type="text" name="ln" id="id-ln" placeholder="Enter name!"/>
              <br/>
              <br/>
              Username: <input type="text" name="un" id="id-un" placeholder="Enter name!"/>
              <br/>
              <br/>
              Password: <input type="password" name="pass" id="id-pass" placeholder="Enter name!"/>
              <br/>
              <br/>
              <label class="l1">Address: </label><textarea name="address" id="id-address"></textarea>
              <br/>
              <br/>
              Gender: <select name="gender" id="id-gender">
                  <option value="Male">Male</option>
                  <option value="Female">Female</option>
              </select>
              <br/>
              <br/>
              <input type="submit" value="Submit!"/>
              <br/>
          </form>
      </div>
  <script src="Script.js"></script>
  <link rel="stylesheet" href="Style.css">
  </body>
</html>
