<%@page import="www.jcoding.kr.BookController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    BookController control = new BookController();
    
    control.getBookList("삼국지");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
maven project
</body>
</html>