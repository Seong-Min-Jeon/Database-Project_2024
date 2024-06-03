<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2. e</title>
        <link rel="stylesheet" href="../css/table.css" />
    </header>
    <body>

        <div>
            <a href="/">Return Home</a>
        </div>

        <h2>e) 전체 도서의 평균 가격 및 년도별 평균 가격을 산정할 수 있어야 한다.</h2>

        <table>
            <tr>
                <th>avg price</th>
            </tr>
            <c:forEach items="${bookE1}" var="object">
                <tr>
                    <td>${object.getAvgPrice()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Avg Price Table</b></span>

        <br><br>

        <table>
            <tr>
                <th>year</th>
                <th>avg price</th>
            </tr>
            <c:forEach items="${bookE2}" var="object">
                <tr>
                    <td>${object.getYear()}</td>
                    <td>${object.getAvgPriceBasedYear()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Avg Price Based Year Table</b></span>

    </body>
</html>


