<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8"/>
        <title>护理内容增添页面</title>
		<!--可写在html中任何地方-->
		<script>
			//验证id
			function checkcid(){
				var sn = document.getElementById("cid").value;
				var d = document.getElementById("errorMessage");
				if(sn==""){
					d.innerText = "id不能为空！";
					return false;
				}else{
					return true;
				}
			}
			//验证 编号
			function checkserialNumber(){
				var num = document.getElementById("serialNumber").value;
				if(num ==""){
					var d = document.getElementById("errorMessage");
					d.innerText = "编号不能为空！";
					return false;
				}
				else{
					return true;
				}
				
				
			}
			//验证名称非空
			function checknursingName(){
				var name = document.getElementById("nursingName").value;
				if(name ==""){
					var d = document.getElementById("errorMessage");
					d.innerText = "名称不能为空！";
					return false;
				}
				else{
					return true;
				}
				
				
			}
			function checkform(){
				if(checkcid() && checkserialNumber()&&checknursingName()){
					document.myform.submit();
				}
			}
		</script>
		</head>
        <body>
            <h1 class="color">护理内容添加界面</h1>
            <!--表单标签-->
			<div style="color: #FF0000; font-size: 36px; font-weight: bold;" id="errorMessage">
				${requestScope.msg}
			</div>
            <form name = "myform" action="/SupportCenter/ContentAddController" method="get">
				<!--表单元素-->
				id:<input type="text" name = "cid" id = "cid"/><br/>
				编号:<input type="text"name="serialNumber" id = "serialNumber" /><br />
				名称:<input type="text" name="nursingName" id="nursingName" /><br />
				价格:<input type="text" name="servicePrice"/><br />
				描述:<input type="text" name="describe"/><br />
				是否增值：<select name="incrementFlag">
							<option value = "1">是</option>
							<option value = "2">否</option>
						</select><br/>
				是否启用:<select name="status">
							<option value = "1"> 启用</option>
							<option value = "2">停用</option>
						</select>
				<input type="button" value="测试" onclick="checkcid()" />
				<input type="button" value="添加" onclick="checkform()" />
				<input type="reset" value="重置" />
			</form>
        </body>
</html>