<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
<title>jsp ssm整合测试</title>
</head>
<body>
	<script type="text/javascript">
		function test(){
			var id = $("#userId").val() ;
			alert(id) ;
			$.ajax({
				url : "../User/findUserById.action",
				type : "GET",
				data : "id="+id,
				success:function(data){
					alert(data) ;
				}				
			}) ;
			
		}
	</script>
	<input id="userId" type="text" />
	<input type="button" onclick="test()" value="点击测试"/>
	
</body>
</html>