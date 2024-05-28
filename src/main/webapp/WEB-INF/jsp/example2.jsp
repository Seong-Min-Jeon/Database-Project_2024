<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8" />
    <title>Login Page</title>
    <link rel="stylesheet" href="css/example.css" />
</head>

<body>
<nav>
    <a href="/">로그인</a>
    <a href="/visit">방문기록</a>
    <a href="/upload">파일전송</a>
</nav>

<h2>Login</h2>
<div>
    <form id="form" action='/admit' method='post'>
        <label>UserName</label>
        <input type="text" name="login"><br>
        <label>Password</label>
        <input type="password" name="password"><p>
        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>
