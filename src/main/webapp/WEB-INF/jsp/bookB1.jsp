<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2. b</title>
        <link rel="stylesheet" href="../../css/table.css" />
    </header>
    <body>

        <div>
            <a href="/">Return Home</a>
        </div>

        <h2>b) 모든 출판사의 정보를 확인 할 수 있어야 하며, 특정 출판사를 선택 하였을 경우 해당
            출판사에서 출판된 도서의 제목과 가격, 재고량을 확인할 수 있어야 한다. 재고량이
            없는 경우에는 해당 도서에 대해서 재고가 없음을 알려주어야 한다.</h2>

        <table>
            <tr>
                <th>title</th>
                <th>price</th>
                <th>stock num</th>
            </tr>
            <c:forEach items="${bookB}" var="object">
                <tr>
                    <td>${object.getTitle()}</td>
                    <td>${object.getPrice()}</td>
                    <c:choose>
                        <c:when test="${object.getNum() == 0}">
                            <td style="color: red; font-weight: bold">재고 없음!</td>
                        </c:when>
                        <c:otherwise>
                            <td>${object.getNum()}</td>
                        </c:otherwise>
                    </c:choose>
                </tr>
            </c:forEach>
        </table>
        <span><b>Title and Stock Num Table</b></span>

    </body>
</html>


