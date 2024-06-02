<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2. c</title>
        <link rel="stylesheet" href="../css/table.css" />
    </header>
    <body>

        <div>
            <a href="/">Return Home</a>
        </div>

        <h2>c) 모든 고객의 정보를 확인 할 수 있어야 하며 특정 고객을 선택 하였을 경우, 해당 고
            객이 주문한 도서와 해당 도서의 출판사, 저자의 정보를 출력 할 수 있어야 한다.</h2>

        <form name="customerEmail" method="get" action="/bookstore/c/1">
            <p>이메일: <input type="text" name="email"></p>
            <p><input type="submit" name="submit" value="제출"></p>
        </form>

        <table>
            <tr>
                <th>email</th>
                <th>name</th>
                <th>address</th>
                <th>phone</th>
            </tr>
            <c:forEach items="${bookC}" var="object">
                <tr>
                    <td>${object.getEmail()}</td>
                    <td>${object.getName()}</td>
                    <td>${object.getAddress()}</td>
                    <td>${object.getPhone()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Customer Table</b></span>

    </body>
</html>


