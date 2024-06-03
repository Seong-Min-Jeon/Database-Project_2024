<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2. f</title>
        <link rel="stylesheet" href="../css/table.css" />
    </header>
    <body>

        <div>
            <a href="/">Return Home</a>
        </div>

        <h2>f) 작가별 도서의 총 개수, 최고, 최저, 평균 가격을 확인 할 수 있어야 한다.</h2>

        <table>
            <tr>
                <th>name</th>
                <th>address</th>
                <th>num of books</th>
                <th>max price of books</th>
                <th>min price of books</th>
                <th>avg price of books</th>
            </tr>
            <c:forEach items="${bookF}" var="object">
                <tr>
                    <td>${object.getName()}</td>
                    <td>${object.getAddress()}</td>
                    <td>${object.getNum()}</td>
                    <td>${object.getMax()}</td>
                    <td>${object.getMin()}</td>
                    <td>${object.getAvg()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Author and Book Table</b></span>

    </body>
</html>


