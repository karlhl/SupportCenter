<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<style type="text/css">
input {
	border: 1px solid #ccc;
	padding: 4px 0px;
	border-radius: 3px;
	padding-left: 5px;
	-webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
	-webkit-transition: border-color ease-in-out .15s, -webkit-box-shadow
		ease-in-out .15s;
	-o-transition: border-color ease-in-out .15s, box-shadow ease-in-out
		.15s;
	transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s
}

input:focus {
	border-color: #66afe9;
	outline: 0;
	-webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075), 0 0 8px
		rgba(102, 175, 233, .6);
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075), 0 0 8px
		rgba(102, 175, 233, .6)
}

select {
	border: solid 1px #ccc;
	appearance: none; /*清除select下拉框默认样式*/
	-moz-appearance: none;
	-webkit-appearance: none;
	padding-right: 14px; /*为下拉小箭头留出一点位置，避免被文字覆盖*/
}
</style>
<meta charset="utf-8" />
<title></title>
<link href="css/test.css" type="text/css" rel="stylesheet" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<!--可写在html中任何地方-->
<script>
	function checkname() {
		var name = document.getElementById("name").value;
		if (name == "") {
			var d = document.getElementById("errorMessage");
			d.innerText = "客户姓名不能为空！";
			//alert("学生姓名为空");
			return false;
		} else {
			return true;
		}

	}
	function checkform() {
		if (checkname()) {
			document.myform.submit();
		}
	}
</script>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/SupportCenter/index.html">东软颐养中心</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="/SupportCenter/index.html">主页
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">护理级别 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="/SupportCenter/addCareLevel.jsp">添加护理级别</a></li>
							<li><a href="/SupportCenter/queryCareLevel.jsp">查询护理级别</a></li>
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">护理内容 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="/SupportCenter//LevelQueryAddController">增加护理内容</a></li>
							<li><a href="/SupportCenter/query.jsp">查询护理内容</a></li>
						</ul>
					</li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">护理记录 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="/SupportCenter/addNursingRecord.jsp">增加护理记录</a></li>
							<li><a href="/SupportCenter/queryNursingRecord.jsp">查询护理记录</a></li>
						</ul>
					</li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">膳食日历 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">Separated link</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">One more separated link</a></li>
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">入户登记 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="/SupportCenter/AddCustomer.jsp">添加入住登记</a></li>
							<li><a href="/SupportCenter/queryCustomer.jsp">查询入住登记</a></li>
						</ul>
					</li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">退住登记 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="/SupportCenter/queryCustomer2.jsp">办理退住登记</a></li>
							<li><a href="/SupportCenter/addRetreatCustomer.jsp">添加退住房登记</a></li>
							<li><a href="/SupportCenter/queryRetreatCustomer.jsp">查询退住登记</a></li>
						</ul>
					</li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">外出登记 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="/SupportCenter/queryCustomer3.jsp">办理外出登记</a></li>
							<li><a href="/SupportCenter/addOutCustomer.jsp">添加外出登记</a></li>
							<li><a href="/SupportCenter/queryOutCustomer.jsp">查询外出登记</a></li>
						</ul>
					</li>
					
					
					
					
					
					
					
					
					</ul>

				<ul class="nav navbar-nav navbar-right">

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Dropdown <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">Separated link</a></li>
						</ul></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
	<h1 class="color">客户更新页面</h1>
	<!--表单标签-->
	<div style="color: #FF0000; font-size: 36px; font-weight: bold;"
		id="errorMessage">${requestScope.msg}</div>
	<form name="myform" action="/SupportCenter/updateCustomerController"
		method="get">
		<!--表单元素-->
		<!--input type="text" name = "wd"/>
				<input type="submit" value="百度一下" />-->
		编号:<input type="text" name="id" id="ID"
			value="${requestScope.customer[0].ID}" readonly /><br /> 姓名:<input
			type="text" name="name" id="name"
			value="${requestScope.customer[0].name}" /><br /> 年龄:<input
			type="number" name="age" value="${requestScope.customer[0].age}" /><br />
		性别:<select name="sex">
			<option value="m">男</option>
			<option value="f">女</option>
		</select><br /> 身份证号:<input type="text" name="IDCARD"
			value="${requestScope.customer[0].IDCARD}" /><br /> 档案编号:<input
			type="text" name="recordID" id="recordID"
			value="${requestScope.customer[0].recordID}" /><br /> 老人类型:<select
			name="elderType">
			<option value="1">类型一</option>
			<option value="2">类型二</option>
		</select><br /> 入住时间:<input type="date" name="checkinDate"
			value="${requestScope.customer[0].checkInDate}" /><br /> 服务到期时间:<input
			type="date" name="expirationtionDate"
			value="${requestScope.customer[0].expirationtionDate}" /><br /> 联系电话:<input
			type="text" name="contactTel" id="contactTel"
			value="${requestScope.customer[0].contactTel}" /><br /> 出生日期:<input
			type="date" name="birthday"
			value="${requestScope.customer[0].birthday}" /><br /> 身高:<input
			type="text" name="height" id="height"
			value="${requestScope.customer[0].height}" /><br /> <input
			type="button" value="测试" onclick="checkname()" /> <input
			type="button" value="更新" onclick="checkform()" /> <input
			type="reset" value="重置" />
	</form>
</body>
</html>