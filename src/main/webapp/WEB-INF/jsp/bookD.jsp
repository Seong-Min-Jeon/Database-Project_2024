<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2. d</title>
        <link rel="stylesheet" href="../css/table.css" />
    </header>
    <body>

        <div>
            <a href="/">Return Home</a>
        </div>

        <h2>d) 새로운 도서가 등록 될 경우에는 저자와 출판사 창고별 재고량이 함께 등록 되어야 한다.</h2>

        <form name="book data" method="post" action="/bookstore/d/1">
            <div>
                <p>ISBN: <input type="number" name="ISBN" required></p>
                <p>책 제목: <input type="text" name="title" required></p>
                <p>책 발매년도: <input type="number" name="year"></p>
                <p>책 가격: <input type="number" name="price"></p>
            </div>
            <br>
            <div>
                <p>저자 정보</p>
                <select name="authorData">
                    <c:forEach items="${bookD1}" var="object">
                        <option value="${object.getAuthorId().getName()}//${object.getAuthorId().getAddress()}">
                                ${object.getAuthorId().getName()} ${object.getAuthorId().getAddress()}
                        </option>
                    </c:forEach>
                </select>
            </div>
            <br><br>
            <div>
                <p>출판사명</p>
                <select name="publisherData">
                    <c:forEach items="${bookD2}" var="object">
                        <option value="${object.getName()}">${object.getName()}</option>
                    </c:forEach>
                </select>
            </div>
            <br><br>
            <div>
                <p>창고별 재고</p>
                <c:forEach items="${bookD3}" var="object">
                    <p style="display: inline-block">${object.getCode()}: <input type="text" name="codes[]"></p>
                    <p style="display: inline-block">재고 수: <input type="number" name="nums[]"></p>
                    <p></p>
                </c:forEach>
            </div>

            <p><input type="submit" name="submit" value="제출"></p>
        </form>

    </body>
</html>


