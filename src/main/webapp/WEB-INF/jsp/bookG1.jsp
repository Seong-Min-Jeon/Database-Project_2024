<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2. g</title>
        <link rel="stylesheet" href="../../css/table.css" />
    </header>
    <body>

        <div>
            <a href="/">Return Home</a>
        </div>

        <h2>g) 재고가 특정 부수 이상 넘어가는 도서를 검색하고, 가격 할인을 할 수 있어야 한다.
            (예, 재고가 500부 이상 남은 도서에 대해서 가격을 10% 할인하여 BOOK.price에 반영)</h2>

        <p>할인이 적용되었습니다.</p>

        <table>
            <tr>
                <th>ISBN</th>
                <th>title</th>
                <th>price</th>
                <th>num of books</th>
            </tr>
            <c:forEach items="${bookG}" var="object">
                <tr>
                    <td>${object.getISBN()}</td>
                    <td>${object.getTitle()}</td>
                    <td>${object.getPrice()}</td>
                    <td>${object.getNum()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Book Table</b></span>

    </body>
</html>


