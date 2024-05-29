<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>1. d</title>
        <link rel="stylesheet" href="../css/table.css" />
    </header>
    <body>
        <h2>d) 과목별로 최고 점수와, 최저 점수를 획득 한 학생의 정보를 확인 할 수 있어야 한다.</h2>

        <table>
            <tr>
                <th>sno</th>
                <th>pno</th>
                <th>sname</th>
                <th>year</th>
                <th>dept</th>
                <th>comment</th>
            </tr>
            <c:forEach items="${univD1}" var="object">
                <tr>
                    <td>${object.getSno()}</td>
                    <td>${object.getPno()}</td>
                    <td>${object.getSname()}</td>
                    <td>${object.getYear()}</td>
                    <td>${object.getDept()}</td>
                    <td>${object.getCno()} 과목에서 최고 점수</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>High Grade Student Table</b></span>

        <br><br>

        <table>
            <tr>
                <th>sno</th>
                <th>pno</th>
                <th>sname</th>
                <th>year</th>
                <th>dept</th>
                <th>comment</th>
            </tr>
            <c:forEach items="${univD2}" var="object">
                <tr>
                    <td>${object.getSno()}</td>
                    <td>${object.getPno()}</td>
                    <td>${object.getSname()}</td>
                    <td>${object.getYear()}</td>
                    <td>${object.getDept()}</td>
                    <td>${object.getCno()} 과목에서 최저 점수</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Low Grade Student Table</b></span>

    </body>
</html>


