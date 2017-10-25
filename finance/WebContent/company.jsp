<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="css/demo.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body>
	<div class="table-responsive">
		<table class="table table-striped table-hover">
			<thead>
				<tr>
					<td><h4>姓名</h4></td>
					<td><h4>手机号</h4></td>
					<td><h4>所属公司</h4></td>
					<td><h4>状态</h4></td>
					<td><h4>最后修改时间</h4></td>
					<td><h4>顾问照片路径</h4></td>
					<td><h4>备注</h4></td>
					<td><h4>职称</h4></td>
				</tr>
			</thead>

			<tbody>
			    <tr>
			    <%-- <%request.getAttribute("Company"); %> --%>
			            <td id="td1_${status.count}" contentEditable="false"
							style="white-space: nowrap">${Company.name}</td>
						<td id="td2_${status.count}" contentEditable="false">
							${Company.phone}</td>
						<td id="td3_${status.count}" contentEditable="false">
							${Company.company}</td>
						<td id="td4_${status.count}" contentEditable="false">
							${Company.status}</td>
						<td id="td5_${status.count}" contentEditable="false">
							${Company.last_change}</td>
						<td id="td6_${status.count}" contentEditable="false">
							${Company.photo_url}</td>
						<td id="td7_${status.count}" contentEditable="false">
							${Company.ps}</td>
						<td id="td8_${status.count}" contentEditable="false">
							${Company.position}</td>
			    </tr>
			</tbody>
		</table>
	</div>
	<a class="btn btn-default" href="add.jsp" role="button">新增信息</a>
</body>

<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</html>