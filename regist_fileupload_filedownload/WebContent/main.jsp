<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
<script type="text/javascript">
$(function(){
	$("a").click(function(){
		var $td = $(this).parent().prev();
		$td.html(parseInt($td.html()) + 1);
	});
});
</script>
</head>
<body>
<table border="1" width="400" cellspacing="0">
	<tr>
		<th>资料名称</th>
		<th>下载次数</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${requestScope.list }" var="datum">
	<tr>
		<td>${datum.fname }</td>
		<td>${datum.fcount }</td>
		<td><a href="download?id=${datum.id }&fname=${datum.fname}">下载</a></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>