<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<meta charset="utf-8" />
<title>护理等级增添页面</title>
<!--可写在html中任何地方-->
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>

<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
</head>
<script>
	//验证id
	function checkid() {
		var sn = document.getElementById("id").value;
		var d = document.getElementById("errorMessage");
		if (sn == "") {
			d.innerText = "护理等级id不能为空！";
			return false;
		} else {
			return true;
		}
	}
	//验证 编号
	function checkserialNumber() {
		var num = document.getElementById("name").value;
		if (num == "") {
			var d = document.getElementById("errorMessage");
			d.innerText = "护理等级名称不能为空！";
			return false;
		} else {
			return true;
		}

	}

	function checkform() {
		if (checkid() && checkserialNumber()) {
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
	<h1 class="color">护理等级添加界面</h1>
	<!--表单标签-->
	<div style="color: #FF0000; font-size: 36px; font-weight: bold;"
		id="errorMessage">${requestScope.msg}</div>
	<form name="myform" action="/SupportCenter/LevelAddController"
		method="get">
		<!--表单元素-->
		护理等级ID:<input type="text" name="id" id="id" /><br /> 
		护理等级名称:<input
			type="text" name="name" id="name" /><br /> 
		护理等级状态:<select name="status" id="status">
			<option value="1">启用</option>
			<option value="2">停用</option>
		</select> <br/>
		
		<input type="button" value="测试" onclick="checkcid()" /> <input
			type="button" value="添加" onclick="checkform()" /> <input
			type="reset" value="重置" />
	</form>
</body>
</html>