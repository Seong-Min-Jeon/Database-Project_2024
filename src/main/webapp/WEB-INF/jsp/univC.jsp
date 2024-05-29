<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>1. c</title>
        <link rel="stylesheet" href="../css/table.css" />
    </header>
    <body>
        <h2>c) Student의 시험 점수에 대한 학점이 잘못 기재되어 있는 학생의 이름과 학번, 과목번호
            를 확인 할 수 있어야 하며, 수정 요청에 대해 정상적인 학점으로 수정이 되어야 한다.
            (단, 학점 부여방식은 다음과 같다고 가정한다. 60점 미만 : F, 60~69 : D, 70~79 :
            C, 80 ~89 : B, 90 이상 : A)</h2>

        <form name="solve" method="post" action="/university/c/1">
            <p><input type="submit" name="submit" value="잘못된 학점 수정하기"></p>
        </form>

        <table>
            <tr>
                <th>sname</th>
                <th>sno</th>
                <th>cno</th>
                <th>exam</th>
                <th>grade</th>
            </tr>
            <c:forEach items="${univC}" var="object">
                <tr>
                    <td>${object.getSname()}</td>
                    <td>${object.getSno()}</td>
                    <td>${object.getCno()}</td>
                    <td>${object.getExam()}</td>
                    <td>${object.getGrade()}</td>
                </tr>
            </c:forEach>
        </table>
        <span><b>Student and Grade Table</b></span>

    </body>
</html>


