<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>1. f</title>
        <link rel="stylesheet" href="../css/table.css" />
    </header>
    <body>

        <div>
            <a href="/">Return Home</a>
        </div>

        <h2>f) 과목별로 전체 평균 점수와 학점별 학생 수를 확인할 수 있어야 한다.</h2>

        <table>
            <tr>
                <th>cno</th>
                <th>cname</th>
                <th>avg of exams</th>
            </tr>
            <c:forEach items="${univF1}" var="object">
                <tr>
                    <td>${object.getCno()}</td>
                    <td>${object.getCname()}</td>
                    <td>${object.getAvgExams()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Exams and Student Table</b></span>

        <table>
            <tr>
                <th>cno</th>
                <th>cname</th>
                <th>grade</th>
                <th>count students</th>
            </tr>
            <c:forEach items="${univF2}" var="object">
                <tr>
                    <td>${object.getCno()}</td>
                    <td>${object.getCname()}</td>
                    <td>${object.getGrade()}</td>
                    <td>${object.getCountStudents()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Grade and Student Table</b></span>

    </body>
</html>


