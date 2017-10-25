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

	<div class="search d7">
		<form action="SearchServlet" method="post" id="form">
			<input type="text" placeholder="Name Or Phone Or Company" name="search">
			<button type="submit" id="submit" name="flag" value=""></button>
		</form>
	</div>

	<input type="hidden" value="search" name="flag" />
	<input type="hidden" value="add" name="flag" />
	<input type="hidden" name="flag" value="delete">
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
				<c:forEach items="${plannerinfos}" var="planner" varStatus="status">
					<tr>
						<td id="td1_${status.count}" contentEditable="false" width="10%"
							style="white-space: nowrap">${planner.name}</td>
						<td id="td2_${status.count}" contentEditable="false" width="15%">
							${planner.phone}</td>
						<td id="td3_${status.count}" contentEditable="false" width="10%">
							${planner.company}</td>
						<td id="td4_${status.count}" contentEditable="false" width="5%">
							${planner.status}</td>
						<td id="td5_${status.count}" contentEditable="false" width="15%">
							${planner.last_change}</td>
						<td id="td6_${status.count}" contentEditable="false"  width="20%">
							${planner.photo_url}</td>
						<td id="td7_${status.count}" contentEditable="false" width="10%">
							${planner.ps}</td>
						<td id="td8_${status.count}" contentEditable="false" width="15%">
							${planner.position}</td>
						<td>
							<div class="dropdown">
								<button class="btn btn-default dropdown-toggle" type="button"
									id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
									aria-expanded="true">
									<i class="glyphicon glyphicon-hand-up">操作</i><span class="caret"></span>
								</button>
								<ul class="dropdown-menu dropdown-menu-right"
									aria-labelledby="dropdownMenu1" style="min-width: 120px">
									<li><a href="GetOneByIdServlet?id=${planner.id }">修改</a></li>
									<!-- 链接到GetOneByIdServlet -->
									
									<li><a href="DeleteServlet?id=${planner.id }">删除</a></li>
									<!-- 链接到DeleteServlet -->
								</ul>
							</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<a class="btn btn-default" href="add.jsp" role="button"><i class="glyphicon glyphicon-plus">新增信息</i></a>
</body>
<script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script>
	function add() {
		$("#form").submit();
		
	}
</script>
</html>