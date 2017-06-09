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

		<title>My JSP 'MyWorld.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<style type="text/css">
			#mainDiv {
				width: 100%;
				height: 100%;
			}
			#catalogueDiv{
				width: 20%;
				height: 100%;
				float: left;
				background-color: #989090;
			}
			
			#contextDiv{
				width: 80%;
				height: 100%;
				float: left;
			}
		</style>
		
		<script type="text/javascript">
  			/*function handler(event) {
                  var index =event.data.index;
                  var lis = $("#lnav li ");
                   $.each( lis, function(i, n){
                    if(i==index){
                    alert("------");
                          document.body.style.backgroundColor = "#111111";
                    }
                    
                 });
             }
            //通过li的ID设置监听
            $(function(){
              var lis = $("#lnav li a");
              $.each( lis, function(i, n){
                $(this).bind("click", {index: i}, handler)
                });
            });*/
            
            function changeFrame(e){
            	debugger
            	document.getElementById("iframeId").src="web/myWorld/"+e;
            }
		</script>
	</head>

	<body>
		<div id="mainDiv">
			<div id="catalogueDiv">
				<ul>
					<li id="tag01">
						<input type="button" value="个人信息" onclick="changeFrame('myInfo.jsp')"/>
					</li>
					<li id="tag02">
						<input type="button" value="足迹" onclick="changeFrame('footprint.jsp')"/>
					</li>
					<li id="tag03">

					</li>

				</ul>
			</div>
			
			<div id="contextDiv">
				<iframe id="iframeId" width="100%" height="97%" src="web/myWorld/myInfo.jsp">
					
				</iframe>
			</div>
		</div>
	</body>
</html>
