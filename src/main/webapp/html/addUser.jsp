<%--
  Created by IntelliJ IDEA.
  User: sjj
  Date: 2015/10/24 0024
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>SpringMVC 添加用户</title>

  <link rel="stylesheet" href="/css/bootstrap.min.css">

</head>
<body>
<div class="container">
  <h1>SpringMVC </h1>
  <hr/>
  <form:form action="/employee/addUserPost" method="post" commandName="user" role="form">
    <div class="form-group">
      <label for="firstName">First Name:</label>
      <input type="text" class="form-control" id="firstName" name="firstName" placeholder="Enter FirstName:"/>
    </div>
    <div class="form-group">
      <label for="lastName">Last Name:</label>
      <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Enter LastName:"/>
    </div>
    <div class="form-group">
      <label for="password">Password:</label>
      <input type="text" class="form-control" id="password" name="password" placeholder="Enter Password:"/>
    </div>
    <div class="form-group">
      <button type="submit" class="btn btn-sm btn-success">Add</button>
    </div>
  </form:form>
</div>


<script src="/js/jquery.min.js"></script>

<script src="/js/bootstrap.min.js"></script>
</body>
</html>
