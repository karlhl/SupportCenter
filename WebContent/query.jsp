<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="utf-8">
<title>护理内容查询页面</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	<script>
		function checkdelete(url){
			if(confirm("确认删除吗？")==true){
				//delect
				//发送请求
				location.href=url;
				
			}else{
				//cancle
			}
		}
	</script>
	
	
</head>

<body>
	
	<form name="myform" action="http://localhost:8080/SupportCenter/ContentQueryConroller" method="get">
		<input type="text" name="id" id="id" placeholder="请输入id">
		<input type="submit" value="查询">
	</form>
	<hr/>

	
	<table class="table table-striped">
		<caption>学生信息表</caption>
		<tr>
			<td>学号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>生日</td>
			<td>班级</td>
			<td>操作</td>
			
		</tr>
		<c:forEach items="${requestScope.student}" var="s">
		<tr>
			<td>${s.studentID}</td>
			<td>${s.studentName}</td>
			<td>${s.studentAge}</td>
			<td>${s.studentBirthday}</td>
			<td>${s.classID}</td>
			<td><a href="/WebDemo/StudentQueryController?student_id=${s.studentID}&flag=update">更新</a> <a href="javascript:checkdelete('/WebDemo/StudentDelectController?sid=${s.studentID}')" >删除</a></td>
			
			
		</tr>
		</c:forEach>
	</table>

	
	
</body>
</html>