<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
<script type="text/javascript">
$(function(){
	
	var username = false;
	var password = false;
	var confirmpassword = false;
	var file = false;
	
	$(":text:eq(0)").blur(function(){
		if($(this).val() == ""){
			$(this).next().html("×").css("color","red");
			username = false;
		}else{
			$(this).next().html("√").css("color","green");
			username = true;
		}
	});
	
	$(":password:eq(0)").blur(function(){
		if($(this).val() == "" || !$(this).val().match(/^\w{6,12}$/)){
			$(this).next().html("×").css("color","red");
			password = false;
		}else{
			$(this).next().html("√").css("color","green");
			password = true;
		}
	});
	
	$(":password:eq(1)").blur(function(){
		if($(this).val() == "" || !$(this).val().match(/^\w{6,12}$/) || $(this).val() != $(":password:eq(0)").val()){
			$(this).next().html("×").css("color","red");
			confirmpassword = false;
		}else{
			$(this).next().html("√").css("color","green");
			confirmpassword = true;
		}
	});
	
	$(":file:eq(0)").blur(function(){
		if($(this).val() == ""){
			$(this).next().html("×").css("color","red");
			file = false;
		}else{
			$(this).next().html("√").css("color","green");
			file = true;
		}
	});
	
	$(":submit").click(function(){
		if(username == false || password == false || confirmpassword == false || $(":file").val() == ""){
			alert("请将信息完善");
			return false;
		}
		                                                                                                 
	});
	
});
</script>
</head>
<body>
<form action="regist" method="post" encType="multipart/form-data">
用户名:<input type="text" name="username"/><span></span><br/>
密码:<input type="password" name="password"/><span></span><br/>
确认密码:<input type="password" name="confirmpassword"/><span></span><br/>
照片:<input type="file" name="file"/><span></span><br/>
<input type="submit" value="register"/>
</form>
</body>
</html>