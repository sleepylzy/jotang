<%--
  Created by IntelliJ IDEA.
  User: panda
  Date: 2022/9/28
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>内容输入</title>
</head>
<body>
<h3>请输入聊天内容</h3>
<font color="red">${msg}</font>
<form action="/task2/addServlet" method="get" >
    <textarea name = "myText"></textarea><br><br>
    <input type="reset" value="重置">
    <input type="submit" value="提交">


</form>
</body>
</html>
