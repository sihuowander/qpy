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
    		<tr><td>������Ϣ</td></tr>
    		
    		<tr><td>�ǳƣ�</td><td><input type="text" value="sihuowander"/></td></tr>
    		<tr><td>ͷ��</td><td></td></tr>
    		<tr><td>�Ա�</td><td><input name=passport_sex id=passport-sex-1 type=radio value=1  checked > �� <input name=passport_sex id=passport-sex-2 type=radio value=2 > Ů</td></tr>
    		<tr><td>����:</td><td></td></tr>
    		<tr>
    		<td>Ѫ��:</td>
    		<td>
    		<select>
    		<option value="0">��ѡ��</option>
    		<option value="1">O</option>
    		<option value="2">A</option>
    		<option value="3">B</option>
    		<option value="4">AB</option>
    		<option value="5">����</option>
    		</select>
    		</td>
    		</tr>
    		<tr><td>������:</td><td></td></tr>
    		<tr><td>��ס��:</td><td></td></tr>
    		<tr><td>��˽��Ϣ</td></tr>
    		<tr><td>��ߣ�</td><td></td></tr>
    		<tr><td>���أ�</td><td></td></tr>
    		<tr><td>��Ȥ����</td></tr>
    		<tr><td></td><td></td></tr>
    		
    		
    		<tr><td><input type="submit" value="����"/></td><td><input type="reset" value="�ָ�Ĭ��ѡ��"></td></tr>
    	</table>
    
    </form>
  </body>
</html>
