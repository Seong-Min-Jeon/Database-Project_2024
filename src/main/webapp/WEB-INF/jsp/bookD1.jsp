<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2. d</title>
        <link rel="stylesheet" href="../../css/table.css" />
    </header>
    <body>

        <div>
            <a href="/">Return Home</a>
        </div>

        <h2>d) 새로운 도서가 등록 될 경우에는 저자와 출판사 창고별 재고량이 함께 등록 되어야 한다.</h2>

        <span><b>성공적으로 Insert 되었습니다.</b></span>

        <br>

        <table>
            <tr>
                <th>ISBN</th>
                <th>title</th>
                <th>year</th>
                <th>price</th>
            </tr>
            <c:forEach items="${bookD1}" var="object">
                <tr>
                    <td>${object.getISBN()}</td>
                    <td>${object.getTitle()}</td>
                    <td>${object.getYear()}</td>
                    <td>${object.getPrice()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Book Table</b></span>

        <br><br>

        <table>
            <tr>
                <th>ISBN</th>
                <th>code</th>
                <th>num</th>
            </tr>
            <c:forEach items="${bookD2}" var="object">
                <tr>
                    <td>${object.getStocksId().getISBN()}</td>
                    <td>${object.getStocksId().getCode()}</td>
                    <td>${object.getNum()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Stocks Table</b></span>

        <br><br>

        <table>
            <tr>
                <th>name</th>
                <th>address</th>
                <th>ISBN</th>
            </tr>
            <c:forEach items="${bookD3}" var="object">
                <tr>
                    <td>${object.getWrittenById().getName()}</td>
                    <td>${object.getWrittenById().getAddress()}</td>
                    <td>${object.getWrittenById().getISBN()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Written By Table</b></span>

        <br><br>

        <table>
            <tr>
                <th>name</th>
                <th>ISBN</th>
            </tr>
            <c:forEach items="${bookD4}" var="object">
                <tr>
                    <td>${object.getPublishedById().getName()}</td>
                    <td>${object.getPublishedById().getISBN()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Published By Table</b></span>

    </body>
</html>


