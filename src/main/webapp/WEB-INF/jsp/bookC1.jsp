<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2. c</title>
        <link rel="stylesheet" href="../../css/table.css" />
    </header>
    <body>

        <div>
            <a href="/">Return Home</a>
        </div>

        <h2>c) 모든 고객의 정보를 확인 할 수 있어야 하며 특정 고객을 선택 하였을 경우, 해당 고
            객이 주문한 도서와 해당 도서의 출판사, 저자의 정보를 출력 할 수 있어야 한다.</h2>

        <table>
            <tr>
                <th>ISBN</th>
                <th>title</th>
                <th>year</th>
                <th>price</th>
                <th>publisher name</th>
                <th>publisher address</th>
                <th>publisher phone</th>
                <th>publisher url</th>
                <th>author name</th>
                <th>author address</th>
                <th>author url</th>
            </tr>
            <c:forEach items="${bookC}" var="object">
                <tr>
                    <td>${object.getISBN()}</td>
                    <td>${object.getTitle()}</td>
                    <td>${object.getYear()}</td>
                    <td>${object.getPrice()}</td>
                    <td>${object.getPublisherName()}</td>
                    <td>${object.getPublisherAddress()}</td>
                    <td>${object.getPublisherPhone()}</td>
                    <td>${object.getPublisherUrl()}</td>
                    <td>${object.getAuthorName()}</td>
                    <td>${object.getAuthorAddress()}</td>
                    <td>${object.getAuthorUrl()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Book and Publisher and Author Table</b></span>

    </body>
</html>


