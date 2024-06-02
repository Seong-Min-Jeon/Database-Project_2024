<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>1. g</title>
        <link rel="stylesheet" href="../css/table.css" />
    </header>
    <body>

        <div>
            <a href="/">Return Home</a>
        </div>

        <h2>g) 학과별로 개설된 강좌(Lecture)의 수를 확인 할 수 있어야 한다.</h2>

        <table>
            <tr>
                <th>dept</th>
                <th>count lectures</th>
            </tr>
            <c:forEach items="${univG}" var="object">
                <tr>
                    <td>${object.getDept()}</td>
                    <td>${object.getCountLectures()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Dept and Count Lecture Table</b></span>

    </body>
</html>


