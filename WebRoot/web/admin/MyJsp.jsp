<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'MyJsp.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery-1.10.2.js"></script>
		<style type="text/css">
#mainDiv {
	width: 100%;
	height: 100%;
}

#leftDiv {
	width: 40%;
	height: 100%;
	background: #cccc22;
	float: left;
}

#leftDiv1 {
	width: 100%;
	height: 50%;
	background: #0099cc;
}

#leftDiv2 {
	width: 100%;
	height: 50%;
}

#centerDiv {
	width: 20%;
	height: 100%;
	float: left;
	background: #339966;
}

#rightDiv {
	width: 40%;
	height: 100%;
	float: left;
	background: #cccc22;
}

#rightDiv1 {
	width: 100%;
	height: 50%;
	background: #0099cc;
}

#rightDiv2 {
	width: 100%;
	height: 50%;
}
</style>

		<script type="text/javascript">
function register() {

$.ajax({
  url: 'login.do',
  type: 'POST',
  dataType: 'json',
  data: {
     username:wjy1
  },
  success: function(){
         alert("�ɹ�");
  },
  error: function(){
         alert("ʧ��");
  }
})
}
</script>


	</head>

	<body>
		<div id="mainDiv">
			<div id="leftDiv">
				<div id="leftDiv1"></div>
				<div id="leftDiv2"></div>
			</div>
			<div id="centerDiv">
				<!--��½ע�� ��곬��������Ϸ�����½ע�ᰴť�½�����Բ�Σ��ϰ�ԲΪ��½���°�ԲΪע�� ������ƿ���Բ���Զ�����
				<div id="centerDiv1" style="x: 0px; y: 0px;">
					<div id="loginDiv">
						<a href="<%=basePath%>login.jsp">��½</a>
					</div>
					<div id="registerDiv">
						<input type="button" value="ע��" onclick="register()" />
					</div>
				</div>-->

				<div>
					<a href="<%=basePath%>web/myWorld/MyWorld.jsp">�ҵ�����</a>
				</div>


				<!-- ������һ���������������� 
				<div id="footDiv" style="x: 0px; y: 0px;">
					<div id="callMe">
						<a>��ϵ����</a>
					</div>
					<div id="aboutMe">
						<a>��������</a>
					</div>
				</div>-->
			</div>
			<div id="rightDiv">
				<div id="rightDiv1"></div>
				<div id="rightDiv2"></div>
			</div>
		</div>
	</body>
</html>
