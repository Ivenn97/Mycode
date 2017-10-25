<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body>
    <div class="panel-body" style="margin-top: 50px; margin-right: 700px; margin-left: 100px">
				<form class="form-horizontal" action="ChangeServlet" method="post"  id="form">
				<input type="hidden" value="add" name="flag"/>
					<div class="form-group">
						<label class="col-sm-2 control-label">姓名</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="name" value="${plannerInfo.name }"
								placeholder="Name">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">手机号</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="phone" value="${plannerInfo.phone }"
								placeholder="Phone">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">所属公司</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="company"  value="${plannerInfo.company }"
								placeholder="Company">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">备注</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="ps" value="${plannerInfo.ps }"
								placeholder="Ps">
						</div>
					</div>
					<input type="hidden" name="id" value="${plannerInfo.id }">
					<div class="form-group">
						<label class="col-sm-2 control-label">职称</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="position" value="${plannerInfo.position }"
								placeholder="Position">
						</div>
					</div>
				</form>
				<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<input type="submit" class="btn btn-info" onclick="add()" value="提交" />
						</div>
				</div>
			</div>
</body>

<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="js/ajaxfileupload.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<script>
	function add() {
		$("#form").submit();
		
	}
</script>

</html>