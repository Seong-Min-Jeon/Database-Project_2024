<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>1. b</title>
        <link rel="stylesheet" href="../css/table.css" />
    </header>
    <body>
        <h2>b) 특정 Student를 선택하여 해당 Student가 수강하는
            Course 이름과 학점 및 시험 점수를 검색할 수 있어야 한다.</h2>

        <form name="stuname" method="get" action="/university/b/1">
            <p>이름: <input type="text" name="name"></p>
            <p><input type="submit" name="submit" value="제출"></p>
        </form>

        <table>
            <tr>
                <th>sname</th>
            </tr>
            <c:forEach items="${students}" var="object">
                <tr>
                    <td>${object.getSname()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Student Name Table</b></span>

    </body>
</html>


