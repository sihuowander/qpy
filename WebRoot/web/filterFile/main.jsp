<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

		<title>My JSP 'main.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

		<link rel="stylesheet" type="text/css" href="css/mainCss.css">

		<style type="text/css">
		</style>
		<script type="text/javascript">
			function toFSHandle(){
				debugger
				window.location.href='<%=path%>'+"/web/filterFile/fs/fs.jsp";
			}
		</script>
	</head>

	<body>
		<div id="mainDiv">
			<div id="leftDiv">
				<div id="left1"></div>
				<div id="left2"></div>
			</div>
			<div id="centerDiv">
				<div id="center1" class="centerDiv5">
					<a href="<%=path%>/web/filterFile/fs/fs.jsp" target="_blank">测试</a>
				</div>
				<div id="center2" class="centerDiv5">
					<input id="" type="button" src="" value="" name=""
						class="centerButton" />
				</div>
				<div id="center3" class="centerDiv5">
					<input id="" type="button" src="" value="" name=""
						class="centerButton" />
				</div>
				<div id="center4" class="centerDiv5">
					<input id="" type="button" src="" value="" name=""
						class="centerButton" />
				</div>
				<div id="center5" class="centerDiv5">
					<input id="" type="button" src="" value="" name=""
						class="centerButton" />
				</div>
			</div>
			<div id="rightDiv">
				<div id="right1"></div>
				<div id="right2"></div>
			</div>

		</div>
	</body>
</html>
