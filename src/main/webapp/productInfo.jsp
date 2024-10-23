<%--
  Created by IntelliJ IDEA.
  User: SW_CHO
  Date: 2024-05-16
  Time: 오전 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>상품정보 조회</title>
</head>
<body>
<h2>상품정보 조회</h2>
<hr>
<ul>
    <li>상품코드: ${p.id}</li>
    <li>상품명: ${p.name}</li>
    <li>제조사: ${p.maker}</li>
    <li>가격: ${p.price}</li>
    <li>등록일: ${p.date}</li>
</ul>
</body>
</html>
