<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>1. h</title>
        <link rel="stylesheet" href="../css/table.css" />
    </header>
    <body>

        <div>
            <a href="/">Return Home</a>
        </div>

        <h2>h) 학과별, 학년별 총 학생 수를 확인할 수 있어야 한다.</h2>

        <table>
            <tr>
                <th>dept</th>
                <th>count students</th>
            </tr>
            <c:forEach items="${univH1}" var="object">
                <tr>
                    <td>${object.getDept()}</td>
                    <td>${object.getCountStudents()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Count Students Based Dept Table</b></span>

        <br><br>

        <table>
            <tr>
                <th>year</th>
                <th>count students</th>
            </tr>
            <c:forEach items="${univH2}" var="object">
                <tr>
                    <td>${object.getYear()}</td>
                    <td>${object.getCountStudents()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Count Students Based Year Table</b></span>

    </body>
</html>


