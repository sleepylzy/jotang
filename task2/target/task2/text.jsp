<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: panda
  Date: 2022/9/26
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<html>
<head>
    <meta charset="UTF-8">
    <title>聊天内容</title>
</head>
<body>

<table border="1" cellspacing="0">
    <tr>
        <th>内容</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${myTexts}" var="myText">

        <c:if test="${myText.status==1}">
            <tr>
                <td>${myText.myText}</td>
                <td><a href="/task2/deleteServlet?id=${myText.id}">删除</a>
                    <a href="/task2/logicalDeleteServlet?id=${myText.id}">逻辑删除</a> </td>
            </tr>
        </c:if>

    </c:forEach>
</table>
<br>
<input type="button" value="添加内容" id="add">    <input type="button" value="恢复逻辑删除" id="recover">

<script>
    document.getElementById("add").onclick=function (){
        location.href="/task2/talk.jsp"
    }

    document.getElementById("recover").onclick=function (){
        location.href="/task2/recoverServlet"
    }
</script>

</body>
</html>
