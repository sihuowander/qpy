<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
    	function clearHandle(){
    		var username = document.getElementById("username");
    		username.value = "";
    		var pwd1 = document.getElementById("pwd1");
    		pwd1.value = "";
    		var pwd2 = document.getElementById("pwd2");
    		pwd2.value = "";
    	}
    	function check(){
    		var pwd1 = document.getElementById("pwd1");
    		
    		var pwd2 = document.getElementById("pwd2");
    		
    		if(pwd1!=pwd2){
    			
    		}
    	}
    </script>
  </head>
  
  <body>
    <form action="<%= basePath%>doRegister">
    	
    	<table>
    		<!--
    		<tr><td>用户名：</td><td><input id="username" type="text" name="username"/></td></tr>
    		<tr><td>密码：</td><td><input id="pwd1" type="password" name="password"/></td></tr>
    		<tr><td>确认密码：</td><td><input id="pwd2" type="password" name="password2" onblur="check()"/></td></tr>
    		<tr><td>手机号：</td><td><input id="phonenumb" type="text" name="phonenumb"/></td></tr>
    		<tr><td>是否进行实名认证：</td>
    		<td>
    			<input type="radio" name="isC" value="1" checked="checked">是
				<input type="radio" name="isC" value="0">否
			</td>
    		</tr>
    		<tr><td>姓名：</td><td><input id="username2" type="text" name="username2"/></td></tr>
    		<tr><td>身份证：</td><td><input id="idno" type="text" name="idno"/></td></tr>
    		
    		
    		
    		<tr><td><input type="submit" value="注册"/></td><td><input type="button" value="重置" onclick="clearHandle()"/></td></tr>
    		-->
    	</table>
    </form>
  </body>
</html>
