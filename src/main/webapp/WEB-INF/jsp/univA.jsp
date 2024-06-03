<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>1. a</title>
        <link rel="stylesheet" href="../css/table.css" />
    </header>
    <body>

        <div>
            <a href="/">Return Home</a>
        </div>

        <h2>a) 각 Table에 존재하는 Data를 확인하고 tuple의 총 개수를 출력할 수 있어야 한다.</h2>

        <table>
            <tr>
                <th>sno</th>
                <th>pno</th>
                <th>sname</th>
                <th>year</th>
                <th>dept</th>
            </tr>
            <c:forEach items="${students}" var="object">
                <tr>
                    <td>${object.getSno()}</td>
                    <td>${object.getProfessorEntity().getPno()}</td>
                    <td>${object.getSname()}</td>
                    <td>${object.getYear()}</td>
                    <td>${object.getDept()}</td>
                </tr>
            </c:forEach>
        </table>
        <span>tuple의 총 개수: ${students.size()}개</span> <p></p>
        <span><b>STUDENT Table</b></span>

        <br><br>
        <br><br>

        <table>
            <tr>
                <th>pno</th>
                <th>pname</th>
                <th>pmajor</th>
                <th>pdept</th>
            </tr>
            <c:forEach items="${professors}" var="object">
                <tr>
                    <td>${object.getPno()}</td>
                    <td>${object.getPname()}</td>
                    <td>${object.getPmajor()}</td>
                    <td>${object.getPdept()}</td>
                </tr>
            </c:forEach>
        </table>
        <span>tuple의 총 개수: ${professors.size()}개</span> <p></p>
        <span><b>PROFESSOR Table</b></span>

        <br><br>
        <br><br>

        <table>
            <tr>
                <th>cno</th>
                <th>cname</th>
                <th>credit</th>
                <th>sessions</th>
            </tr>
            <c:forEach items="${courses}" var="object">
                <tr>
                    <td>${object.getCno()}</td>
                    <td>${object.getCname()}</td>
                    <td>${object.getCredit()}</td>
                    <td>${object.getSessions()}</td>
                </tr>
            </c:forEach>
        </table>
        <span>tuple의 총 개수: ${courses.size()}개</span> <p></p>
        <span><b>Course Table</b></span>

        <br><br>
        <br><br>

        <table>
            <tr>
                <th>sno</th>
                <th>cno</th>
                <th>grade</th>
                <th>exam</th>
            </tr>
            <c:forEach items="${enrolls}" var="object">
                <tr>
                    <td>${object.getEnrollId().getSno()}</td>
                    <td>${object.getEnrollId().getCno()}</td>
                    <td>${object.getGrade()}</td>
                    <td>${object.getExam()}</td>
                </tr>
            </c:forEach>
        </table>
        <span>tuple의 총 개수: ${enrolls.size()}개</span> <p></p>
        <span><b>Enroll Table</b></span>

        <br><br>
        <br><br>

        <table>
            <tr>
                <th>cno</th>
                <th>pno</th>
                <th>lec time</th>
                <th>room</th>
            </tr>
            <c:forEach items="${lectures}" var="object">
                <tr>
                    <td>${object.getLectureId().getCno()}</td>
                    <td>${object.getLectureId().getPno()}</td>
                    <td>${object.getLec_time()}</td>
                    <td>${object.getRoom()}</td>
                </tr>
            </c:forEach>
        </table>
        <span>tuple의 총 개수: ${lectures.size()}개</span> <p></p>
        <span><b>Lecture Table</b></span>

    </body>
</html>


