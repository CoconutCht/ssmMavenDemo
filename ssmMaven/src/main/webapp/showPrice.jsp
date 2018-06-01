<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>车票价格查询</title>
<script type="text/javascript" src="static/js/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		//监听表单事件
		$("#subFrom").submit(function() {
			var trainnum = $("#trainnum").val();
			if (trainnum == "") {
				alert("车次不能为空!");
				return false;
			}

			var startStation = $("#startStation").val();
			if (startStation == "") {
				alert("出发站不能为空!");
				return false;
			}

			var endStation = $("#endStation").val();
			if (endStation == "") {
				alert("目的站不能为空!");
				return false;
			}
		})

	})
</script>
</head>
<body>
	<center>
		<h1>查询车票价格</h1>
		<form id="subFrom" action="getPrice.htm" method="post">
			<table border="1" width="50%" style="text-align: center;">
				<tr>
					<td>车次</td>
					<td><input type="text" id="trainnum" name="trainnum"></td>
				</tr>
				<tr>
					<td>出发地</td>
					<td><input type="text"  id="startStation" name="startStation"></td>
				</tr>
				<tr>
					<td>目的地</td>
					<td><input type="text"   id="endStation" name="endStation"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="提交"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>