<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>1. b</title>
        <link rel="stylesheet" href="../../css/table.css" />
    </header>
    <body>
        <h2>b) 특정 Student를 선택하여 해당 Student가 수강하는
            Course 이름과 학점 및 시험 점수를 검색할 수 있어야 한다.</h2>

        <table>
            <tr>
                <th>cname</th>
                <th>credit</th>
                <th>exam</th>
            </tr>
            <c:forEach items="${univB}" var="object">
                <tr>
                    <td>${object.getCname()}</td>
                    <td>${object.getCredit()}</td>
                    <td>${object.getExam()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>UnivB Table</b></span>

    </body>
</html>


