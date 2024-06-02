<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2. a</title>
        <link rel="stylesheet" href="../css/table.css" />
    </header>
    <body>

        <div>
            <a href="/">Return Home</a>
        </div>

        <h2>a) 특정 작가를 선택 하였을 경우 해당 작가가 작성한 도서의 제목,
            해당 도서의 재고 수량을 확인할 수 있어야 한다.</h2>

        <form name="authorName" method="get" action="/bookstore/a/1">
            <p>이름: <input type="text" name="name"></p>
            <p>주소: <input type="text" name="address"></p>
            <p><input type="submit" name="submit" value="제출"></p>
        </form>

        <table>
            <tr>
                <th>name</th>
                <th>address</th>
            </tr>
            <c:forEach items="${bookA}" var="object">
                <tr>
                    <td>${object.getAuthorId().getName()}</td>
                    <td>${object.getAuthorId().getAddress()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Author Table</b></span>

    </body>
</html>


