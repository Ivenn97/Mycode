<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增信息页面</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body>

        <div>
			<div class="panel-body" style="margin-top: 50px; margin-right: 700px; margin-left: 100px">
				<form class="form-horizontal" action="AddInfoServlet" method="post"  id="form">
				<input type="hidden" value="add" name="flag"/>
					<div class="form-group">
						<label class="col-sm-2 control-label">姓名</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="name" 
								placeholder="Name">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">手机号</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="phone" 
								placeholder="Phone">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">所属公司</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="company" 
								placeholder="Company">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">备注</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="ps" 
								placeholder="Ps">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">状态</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="status" 
								placeholder="Status">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">职称</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="position" 
								placeholder="Position">
						</div>
					</div>
				</form>
				<div class="form-group" style="margin-left: 100px">
						<label for="exampleInputFile" style="margin-left: 0px">logo</label>
						<img class="img-thumbnail" id="imgfileId" style="width: 250px; height: 250px" /><br /> <input type="file"
							id="inputFile" name="inputFile" onchange="ajaxFileUpload()" /> 
						<input type="hidden" name="fileurl" id="fileurl" />
						<p class="help-block">Example block-level help text here.</p>
				</div>
				<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<input type="submit" class="btn btn-info" onclick="add()" value="提交" />
						</div>
				</div>
				
			</div>
		</div>
</body>

<script type="text/javascript">
	function ajaxFileUpload() {
		$.ajaxFileUpload({
			url : 'AddInfoServlet', //用于文件上传的服务器端请求地址
			secureuri : false, //是否需要安全协议，一般设置为false
			fileElementId : 'inputFile', //文件上传域的ID
			dataType : 'text', //返回值类型 一般设置为json
			success : function(data, status) //服务器成功响应处理函数
			{
				alert(data);
				$("#imgfileId").attr("src", data);
				$("#fileurl").val(data);
			},
			error : function(data, status, e)//服务器响应失败处理函数
			{
				alert(e);
			}
		})
		return false;
	}
</script>
<script>
	function add() {
		$("#form").submit();
		
	}
</script>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="js/ajaxfileupload.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</html>