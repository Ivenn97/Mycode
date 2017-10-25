<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />

</head>
<body>
    <div class="panel panel-default">
		  <div class="panel-heading"><span class="glyphicon glyphicon-zoom-in"></span>用户查询列表</div>
		  <div class="panel-body">
		    <table class="table table-bordered">
	         <tr>
                <th>姓名</th>
		        <th>手机号</th>
			    <th>所属公司</th>
			    <th>状态</th>
			    <th>最后修改时间</th>
			    <th>顾问照片路径</th>
			    <th>备注</th>
			    <th>职称</th>
            </tr>
            
		          <c:forEach items="${plannerinfos }" var="bo">
					<tr>
					    <td>${bo.name}</td>
					    <td>${bo.phone }</td>
					    <td >${bo.company}</td>
					    <td >${bo.status}</td>
					    <td >${bo.last_change}</td>
					    <td >${bo.photo_url}</td>
					    <td >${bo.ps}</td>
					    <td >${bo.position}</td>
					</tr>
				  </c:forEach> 	
			</table>
			
		  </div>
	</div>
       
</body>
<script type="text/javascript" src="js/jquery-1.9.1.min.js" ></script>
<script type="text/javascript" src="js/bootstrap.min.js" ></script>
</html>