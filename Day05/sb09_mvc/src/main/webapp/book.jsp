<%@page import="com.sunbeam.entities.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subject Books</title>
<link rel="stylesheet" href="/css/site.css">
</head>
<body>
	<h3>Subject Books</h3>
	<table>
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Author</th>
			<th>Subject</th>
			<th>Price</th>
		</tr>
	</thead>
	<% List<Book> bookList = (List<Book>)request.getAttribute("bookList"); %>
	<% for(Book b: bookList) { %>
		<tr>
			<td> <%= b.getId() %> </td>
			<td> <%= b.getName() %> </td>
			<td> <%= b.getAuthor() %> </td>
			<td> <%= b.getSubject() %> </td>
			<td> <%= b.getPrice() %> </td>
		</tr>	
	<% } %>
	</table>
</body>
</html>