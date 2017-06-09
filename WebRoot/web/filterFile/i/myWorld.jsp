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

		<title>My JSP 'myWorld.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="css/world.css">

	</head>

	<body>
		<div class="hc_lnav jslist">
			<div class="allbtn">
				<h2>
					<a href="#"><strong>&nbsp;</strong>全部商品分类<i>&nbsp;</i>
					</a>
				</h2>
				<ul style="width: 190px" class="jspop box">
					<li class=a1>
						<div class=tx>
							<a href="#"><i>&nbsp;</i>各地名优茶</a>
						</div>
						<dl>
							<dt>
								热门
							</dt>
							<dd>
								<a href="#">西湖龙井</a>
								<a href="#">金骏眉</a>
								<a href="#">大红袍</a>
								<a href="#">铁观音</a>
							</dd>
						</dl>
						<dl>
							<dt>
								名茶
							</dt>
							<dd>
								<a href="#">红茶</a>
								<a href="#">绿茶</a>
								<a href="#">乌龙茶</a>
								<a href="#">黑茶</a>
								<a href="#">白茶 </a>
							</dd>
						</dl>
						<div class=pop>
							<h3>
								<a href="#">各地名优茶</a>
							</h3>
							<dl>
								<dl>
									<dt>
										绿茶
									</dt>
									<dd>
										<a class="ui-link" href="#">西湖龙井</a>
										<a class="ui-link" href="#">龙井</a>
										<a class="ui-link" href="#">黄山毛峰</a>
										<a class="ui-link" href="#">安吉白茶</a>
										<a class="ui-link" href="#">其他绿茶</a>
									</dd>
								</dl>
								<dl>
									<dt>
										乌龙茶
									</dt>
									<dd>
										<a class="ui-link" href="">铁观音</a>
										<a class="ui-link" href="">大红袍</a>
										<a class="ui-link" href="">水仙</a>
										<a class="ui-link" href="">肉桂</a>
										<a class="ui-link" href="">台湾乌龙</a>
										<a class="ui-link" href="">其他乌龙茶</a>
									</dd>
								</dl>
								<dl>
									<dt>
										红茶
									</dt>
									<dd>
										<a class="ui-link" href="">金骏眉</a>
										<a class="ui-link" href="">正山小种</a>
										<a class="ui-link" href="">祁门红茶</a>
										<a class="ui-link" href="">坦洋工夫</a>
										<a class="ui-link" href="javascript:;">其他红茶</a>
										<a class="un ui-link" href="">政和工夫</a>
										<a class="ui-link" href="">滇红工夫</a>
									</dd>
								</dl>
								<dl>
									<dt>
										黑茶
									</dt>
									<dd>
										<a class="ui-link" href="">白沙溪黑茶</a>
										<a class="ui-link" href="">普洱茶饼</a>
										<a class="ui-link" href="">普洱沱茶</a>
										<a class="ui-link" href="">普洱茶砖</a>
										<a class="ui-link" href="">普洱散茶</a>
										<a class="ui-link" href="">其他黑茶</a>
									</dd>
								</dl>
								<dl>
									<dt>
										白茶
									</dt>
									<dd>
										<a class="ui-link" href="#">白牡丹</a>
										<a class="ui-link" href="">白毫银针</a>
										<a class="ui-link" href="">寿眉</a>
										<a class="ui-link" href="">其他白茶</a>
									</dd>
								</dl>
							</dl>
							<dl>
								<dt>
									品牌
								</dt>
								<dd>
									<a href="">滋恩</a>
									<a href="">远荣</a>
									<a href="">顶峰</a>
									<a href="">公泰</a>
									<a href="">一品堂</a>
									<a href="">好吉</a>
									<a href="">绿雪芽</a>
									<a href="">台湾梅山制茶</a>
									<a href="">白沙溪</a>
									<a href="">联兴茶叶</a>
								</dd>
							</dl>
							<dl>
								<dt>
									价格
								</dt>
								<dd>
									<a href="">100元及以下</a>
									<a href="">100-300元</a>
									<a href="">300元及以上</a>
								</dd>
							</dl>
							<dl>
								<dt>
									净含量
								</dt>
								<dd>
									<a href="">50g及以下</a>
									<a href="">51-100g</a>
									<a href="">101-250g</a>
									<a href="">250g以上</a>
								</dd>
							</dl>
							<dl>
								<dt>
									包装
								</dt>
								<dd>
									<a href="">经济自饮装</a>
									<a href="">精美礼品装</a>
								</dd>
							</dl>
							<div class=clr></div>
							<div class=act>
								<a href=""><img src="images/20150518092317.jpg" />
								</a>
							</div>
						</div>
					</li>
					<li class=a2>
						<div class=tx>
							<a href=""><i>&nbsp;</i>花草保健茶</a>
						</div>
						<dl>
							<dt>
								推荐
							</dt>
							<dd>
								<a href="">大麦茶</a>
								<a href="">苦荞茶</a>
								<a href="">玫瑰花茶</a>
								<a href="">雪菊</a>
								<a href="">蜂蜜木瓜粉</a>
							</dd>
						</dl>
						<div class=pop>
							<h3>
								<a href="">花草保健茶</a>
							</h3>
							<dl>
								<dl>
									<dt>
										瘦身
									</dt>
									<dd>
										<a class="ui-link" href="">玫瑰荷叶茶</a>
										<a class="ui-link" href="">玄米茶</a>
										<a class="ui-link" href="">兰香子</a>
										<a class="ui-link" href="">纤维泡腾片</a>
										<a class="ui-link" href="">青梅苹果酸</a>
										<a class="ui-link" href="">三草茶</a>
									</dd>
								</dl>
								<dl>
									<dt>
										美容
									</dt>
									<dd>
										<a class="ui-link" href="">法兰西玫瑰</a>
										<a class="ui-link" href="">冻干柠檬片</a>
										<a class="un ui-link" href="">果粒茶</a>
										<a class="ui-link" href="">大麦茶</a>
										<a class="ui-link" href="">蜂蜜抹茶粉</a>
									</dd>
								</dl>
								<dl>
									<dt>
										丰胸
									</dt>
									<dd>
										<a class="ui-link" href="">木瓜葛根粉</a>
										<a class="ui-link" href="">蜂蜜木瓜粉</a>
										<a class="ui-link" href="">红酒木瓜丽人饮</a>
									</dd>
								</dl>
							</dl>
							<dl>
								<dt>
									品牌
								</dt>
								<dd>
									<a href="">与花香</a>
									<a href="">美丽快攻</a>
									<a href="">顶峰</a>
								</dd>
							</dl>
							<dl>
								<dt>
									价格
								</dt>
								<dd>
									<a href="">100元及以下</a>
									<a href="">100-300元</a>
									<a href="">300元及以上</a>
								</dd>
							</dl>
							<dl>
								<dt>
									净含量
								</dt>
								<dd>
									<a href="">50g及以下</a>
									<a href="">51-100g</a>
									<a href="">101-250g</a>
									<a href="">250g以上</a>
								</dd>
							</dl>
							<dl>
								<dt>
									包装
								</dt>
								<dd>
									<a href="">经济自饮装</a>
									<a href="">精美礼品装</a>
								</dd>
							</dl>
							<div class=clr></div>
							<div class=act>
								<a href=""><img src="images/20150518092236.jpg" />
								</a>
							</div>
						</div>
					</li>
					<li class=a3>
						<div class=tx>
							<a href=""><i>&nbsp;</i>精选茶具</a>
						</div>
						<dl>
							<dt>
								推荐
							</dt>
							<dd>
								<a href="">功夫茶具</a>
								<a href="">个人杯</a>
								<a href="">茶宠</a>
								<a href="">茶叶罐</a>
							</dd>
						</dl>
						<div class=pop>
							<h3>
								<a href="">精选茶具</a>
							</h3>
							<dl>
								<dl>
									<dt>
										陶瓷
									</dt>
									<dd>
										<a class="ui-link" href="">茶叶罐</a>
										<a class="ui-link" href="">功夫茶具</a>
										<a class="ui-link" href="">茶壶</a>
										<a class="ui-link" href="">茶宠</a>
										<a class="ui-link" href="">茶杯</a>
										<a class="ui-link" href="">茶具礼盒</a>
									</dd>
								</dl>
							</dl>
							<dl>
								<dt>
									品牌
								</dt>
								<dd>
									<a href="">恒越</a>
									<a href="">卓越</a>
									<a href="">国尊陶瓷</a>
									<a href="">宏远达</a>
									<a href="">福万利</a>
								</dd>
							</dl>
							<dl>
								<dt>
									价格
								</dt>
								<dd>
									<a href="">100元及以下</a>
									<a href="">100-300元</a>
									<a href="">300元及以上</a>
								</dd>
							</dl>
							<dl>
								<dt>
									包装
								</dt>
								<dd>
									<a href="">经济自饮装</a>
									<a href="">精美礼品装</a>
								</dd>
							</dl>
							<div class=clr></div>
							<div class=act>
								<a href=""><img src="images/20150518092152.jpg" />
								</a>
							</div>
						</div>
					</li>
					<li class=a4>
						<div class=tx>
							<a href=""><i>&nbsp;</i>可口茶食</a>
						</div>
						<dl>
							<dt>
								推荐
							</dt>
							<dd>
								<a href="">橄榄</a>
								<a href="">冰糖杨梅</a>
								<a href="">酸甜梅</a>
							</dd>
						</dl>
						<div class=pop>
							<h3>
								<a href="">可口茶食</a>
							</h3>
							<dl>
								<dl>
									<dt>
										干果
									</dt>
									<dd>
										<a class="ui-link" href="">杏仁</a>
										<a class="ui-link" href="">瓜子</a>
										<a class="un ui-link" href="">开心果</a>
									</dd>
								</dl>
								<dl>
									<dt>
										零食
									</dt>
									<dd>
										<a class="ui-link" href="">水晶柠檬片</a>
										<a class="ui-link" href="">方块酥</a>
										<a class="ui-link" href="javascript:;">凤梨酥</a>
										<a class="ui-link" href="">燕麦巧克力</a>
									</dd>
								</dl>
							</dl>
							<dl>
								<dt>
									品牌
								</dt>
								<dd>
									<a href="">赛园</a>
									<a href="">新味</a>
								</dd>
							</dl>
							<dl>
								<dt>
									价格
								</dt>
								<dd>
									<a href="">100元及以下</a>
									<a href="">100-300元</a>
									<a href="">300元及以上</a>
								</dd>
							</dl>
							<dl>
								<dt>
									净含量
								</dt>
								<dd>
									<a href="">50g及以下</a>
									<a href="">51-100g</a>
									<a href="">101-250g</a>
									<a href="">250g以上</a>
								</dd>
							</dl>
							<dl>
								<dt>
									包装
								</dt>
								<dd>
									<a href="">经济自饮装</a>
									<a href="">精美礼品装</a>
								</dd>
							</dl>
							<div class=clr></div>
							<div class=act>
								<a href=""><img src="images/20150518092213.jpg" />
								</a>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</div>
		<div style="text-align: center;">
			<p>
				来源:
				<a href="http://www.mycodes.net/" target="_blank">源码之家</a>
			</p>
		</div>
		<!--<form action="<%=basePath%>doRegister">
    	
    	<table>
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
    		
    		
    		
    		<tr><td><input type="submit" value="提交"/></td></tr>
    	</table>
    </form>
  -->
	</body>
</html>
