<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>1. e</title>
        <link rel="stylesheet" href="../css/table.css" />
    </header>
    <body>

        <div>
            <a href="/">Return Home</a>
        </div>

        <h2>e) 학생별로 수강한 교과목의 총학점(sum of credits)과
            시험점수의 평균을 확인할 수 있어야 한다.</h2>

        <table>
            <tr>
                <th>sno</th>
                <th>sname</th>
                <th>sum of credits</th>
                <th>avg of exams</th>
            </tr>
            <c:forEach items="${univE}" var="object">
                <tr>
                    <td>${object.getSno()}</td>
                    <td>${object.getSname()}</td>
                    <td>${object.getTotalCredits()}</td>
                    <td>${object.getAvgExams()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Credits and Exams Table</b></span>

    </body>
</html>


