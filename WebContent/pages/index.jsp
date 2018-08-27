<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>首页</title>
<link rel="stylesheet" href="../layui/css/layui.css">
<link rel="stylesheet" href="../layui/style/admin.css">
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<!-- 头部区域（可配合layui已有的水平导航） -->
			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item layadmin-flexible" lay-unselect><a
					href="javascript:;" layadmin-event="flexible" title="侧边伸缩"> <i
						class="layui-icon layui-icon-shrink-right" id="LAY_app_flexible"></i>
				</a></li>
				<li class="layui-nav-item"><a href="">控制台<span
						class="layui-badge">9</span></a></li>
				<li class="layui-nav-item"><a href="">商品管理<span
						class="layui-badge-dot"></span></a></li>
				<li class="layui-nav-item"><a href="">用户</a></li>
				<li class="layui-nav-item"><a href="javascript:;">其它系统</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">邮件管理</a>
						</dd>
						<dd>
							<a href="">消息管理</a>
						</dd>
						<dd>
							<a href="">授权管理</a>
						</dd>
					</dl></li>
			</ul>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="javascript:;"> <img
						src="http://t.cn/RCzsdCq" class="layui-nav-img"> 贤心
				</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">基本资料</a>
						</dd>
						<dd>
							<a href="">安全设置</a>
						</dd>
					</dl></li>
				<li class="layui-nav-item"><a href="">退了</a></li>
			</ul>
		</div>

		<div class="layui-side layui-bg-black layui-side-menu">
			<div class="layui-side-scroll">
				<div class="layui-logo">
					<span>layui 后台布局</span>
				</div>
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree" lay-shrink="all"
					lay-filter="test">
					<li class="layui-nav-item layui-nav-itemed"><a class=""
						href="javascript:;">所有商品</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;">列表一</a>
								<dl class="layui-nav-child">
									<dd>
										<a href="javascript:;">列表一01</a>
									</dd>
								</dl>
							</dd>
							<dd>
								<a href="javascript:;">列表二</a>
								<dl class="layui-nav-child">
									<dd>
										<a href="javascript:;">列表二01</a>
									</dd>
								</dl>
							</dd>
							<dd>
								<a href="javascript:;">列表三</a>
							</dd>
							<dd>
								<a href="">超链接</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;">解决方案</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;">列表一</a>
							</dd>
							<dd>
								<a href="javascript:;">列表二</a>
							</dd>
							<dd>
								<a href="">超链接</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="">云市场</a></li>
					<li class="layui-nav-item"><a href="">发布商品</a></li>
				</ul>
			</div>
		</div>
		
		<!-- 页面标签 -->
      <div class="layadmin-pagetabs" id="LAY_app_tabs">
        <div class="layui-icon layadmin-tabs-control layui-icon-prev" layadmin-event="leftPage"></div>
        <div class="layui-icon layadmin-tabs-control layui-icon-next" layadmin-event="rightPage"></div>
        <div class="layui-icon layadmin-tabs-control layui-icon-down">
          <ul class="layui-nav layadmin-tabs-select" lay-filter="layadmin-pagetabs-nav">
            <li class="layui-nav-item" lay-unselect>
              <a href="javascript:;"></a>
              <dl class="layui-nav-child layui-anim-fadein">
                <dd layadmin-event="closeThisTabs"><a href="javascript:;">关闭当前标签页</a></dd>
                <dd layadmin-event="closeOtherTabs"><a href="javascript:;">关闭其它标签页</a></dd>
                <dd layadmin-event="closeAllTabs"><a href="javascript:;">关闭全部标签页</a></dd>
              </dl>
            </li>
          </ul>
        </div>
        <div class="layui-tab" lay-unauto lay-allowClose="true" lay-filter="layadmin-layout-tabs">
          <ul class="layui-tab-title" id="LAY_app_tabsheader">
            <li lay-id="home/console.html" lay-attr="home/console.html" class="layui-this"><i class="layui-icon layui-icon-home"></i></li>
          </ul>
        </div>
      </div>

		<div class="layui-body" style="background-color: #e2e2e2">
			<div class="layui-tab" lay-allowclose="true">
				<ul class="layui-tab-title  layui-bg-gray">
					<li class="layui-this">首页</li>
					<li class="layui-this">用户管理</li>
					<li class="layui-this">菜单管理</li>
					<li class="layui-this">角色管理</li>
				</ul>
				<div class="layui-tab-content">
					<div class="layui-tab-item layui-show">
						<div class="layui-fluid">
							<div class="layui-row layui-col-space15">
								<div class="layui-col-md4">
									<div class="layui-card">
										<div class="layui-card-header">卡片面板</div>
										<div class="layui-card-body">
											卡片式面板面板通常用于非白色背景色的主体内<br> 从而映衬出边框投影<i
												class="layui-icon layui-icon-username"></i>
										</div>
									</div>
								</div>
								<div class="layui-col-md4">
									<div class="layui-card">
										<div class="layui-card-header">卡片面板</div>
										<div class="layui-card-body">
											卡片式面板面板通常用于非白色背景色的主体内<br> 从而映衬出边框投影<i
												class="layui-icon layui-icon-username"></i>
										</div>
									</div>
								</div>
								<div class="layui-col-md4">
									<div class="layui-card">
										<div class="layui-card-header">卡片面板</div>
										<div class="layui-card-body">
											卡片式面板面板通常用于非白色背景色的主体内<br> 从而映衬出边框投影<i
												class="layui-icon layui-icon-username"
												style="font-size: 30px; color: #1E9FFF;"></i>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="layui-tab-item">
						<table class="layui-table">
							<colgroup>
								<col width="150">
								<col width="200">
								<col>
							</colgroup>
							<thead>
								<tr>
									<th>昵称</th>
									<th>加入时间</th>
									<th>签名</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>贤心</td>
									<td>2016-11-29</td>
									<td>人生就像是一场修行</td>
								</tr>
								<tr>
									<td>许闲心</td>
									<td>2016-11-28</td>
									<td>于千万人之中遇见你所遇见的人，于千万年之中，时间的无涯的荒野里…</td>
								</tr>
								<tr>
									<td>wagn闲心</td>
									<td>2016-11-28</td>
									<td>于千万人之中遇见你所遇见的人，于千万年之中，时间的无涯的荒野里…</td>
								</tr>
							</tbody>
						</table>

						<table class="layui-table" lay-even>
							<colgroup>
								<col width="150">
								<col width="200">
								<col>
							</colgroup>
							<thead>
								<tr>
									<th>昵称</th>
									<th>加入时间</th>
									<th>签名</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>贤心</td>
									<td>2016-11-29</td>
									<td>人生就像是一场修行</td>
								</tr>
								<tr>
									<td>许闲心</td>
									<td>2016-11-28</td>
									<td>于千万人之中遇见你所遇见的人，于千万年之中，时间的无涯的荒野里…</td>
								</tr>
								<tr>
									<td>wagn闲心</td>
									<td>2016-11-28</td>
									<td>于千万人之中遇见你所遇见的人，于千万年之中，时间的无涯的荒野里…</td>
								</tr>
							</tbody>
						</table>


						<table class="layui-table" lay-even lay-skin="nob">
							<colgroup>
								<col width="150">
								<col width="200">
								<col>
							</colgroup>
							<thead>
								<tr>
									<th>昵称</th>
									<th>加入时间</th>
									<th>签名</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>贤心</td>
									<td>2016-11-29</td>
									<td>人生就像是一场修行</td>
								</tr>
								<tr>
									<td>许闲心</td>
									<td>2016-11-28</td>
									<td>于千万人之中遇见你所遇见的人，于千万年之中，时间的无涯的荒野里…</td>
								</tr>
								<tr>
									<td>wagn闲心</td>
									<td>2016-11-28</td>
									<td>于千万人之中遇见你所遇见的人，于千万年之中，时间的无涯的荒野里…</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="layui-tab-item">3</div>
					<div class="layui-tab-item">4</div>
				</div>
			</div>

			<div class="layui-breadcrumb">
				<a href="">首页</a> <a href="">国际新闻</a> <a href="">亚太地区</a> <a><cite>正文</cite></a>
			</div>

			<div class="layui-breadcrumb" lay-separator="-">
				<a href="">首页</a> <a href="">国际新闻</a> <a href="">亚太地区</a> <a><cite>正文</cite></a>
			</div>

			<div class="layui-breadcrumb" lay-separator="|">
				<a href="">娱乐</a> <a href="">八卦</a> <a href="">体育</a> <a href="">搞笑</a>
				<a href="">视频</a> <a href="">游戏</a> <a href="">综艺</a>
			</div>
			<!-- 内容主体区域 -->
			<div style="padding: 15px;">内容主体区域</div>
		</div>

		<div class="layui-footer">
			<!-- 底部固定区域 -->
			© layui.com - 底部固定区域
		</div>
	</div>


	<!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
	<!--[if lt IE 9]>
  <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
  <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
	<script src="../layui/layui.js"></script>
	<script>
		layui.config({
			base : '../js/' //你存放新模块的目录，注意，不是layui的模块目录
		}).use('index'); //加载入口
	</script>
</body>
</html>