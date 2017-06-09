<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'myInfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="">
    	<table>
    		<tr><td>基础信息</td></tr>
    		
    		<tr><td>昵称：</td><td><input type="text" value="sihuowander"/></td></tr>
    		<tr><td>头像</td><td></td></tr>
    		<tr><td>性别：</td><td><input name=passport_sex id=passport-sex-1 type=radio value=1  checked > 男 <input name=passport_sex id=passport-sex-2 type=radio value=2 > 女</td></tr>
    		<tr><td>生日:</td><td></td></tr>
    		<tr>
    		<td>血型:</td>
    		<td>
    		<select>
    		<option value="0">请选择</option>
    		<option value="1">O</option>
    		<option value="2">A</option>
    		<option value="3">B</option>
    		<option value="4">AB</option>
    		<option value="5">其他</option>
    		</select>
    		</td>
    		</tr>
    		<tr><td>出生地:</td><td></td></tr>
    		<tr><td>居住地:</td><td></td></tr>
    		<tr><td>隐私信息</td></tr>
    		<tr><td>身高：</td><td></td></tr>
    		<tr><td>体重：</td><td></td></tr>
    		<tr><td>兴趣爱好</td></tr>
    		<tr><td></td><td></td></tr>
    		
    		
    		<tr><td><input type="submit" value="保存"/></td><td><input type="reset" value="恢复默认选项"></td></tr>
    	</table>
    
    </form>
  </body>
</html>
