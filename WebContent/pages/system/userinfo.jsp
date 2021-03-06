<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>用户管理</title>
<link rel="stylesheet" href="../../layui/css/layui.css">
</head>
<body>
<table id="demo" lay-filter="test"></table>
<script src="../../layui/layui.js"></script>
<script>
layui.use('table', function(){
	  var table = layui.table;
	  
	  
	  
	  //第一个实例
	  table.render({
	    elem: '#demo'
	    ,height: 315
	    ,url: '' //数据接口
	    ,even: true
	    ,page: true //开启分页
	    ,limits: [5, 7, 10]
	  	,limit: 5 //每页默认显示的数量
	    ,cols: [[ //标题栏
	              {type:'checkbox'}
	              ,{field: 'id', title: 'ID', width: 80, sort: true}
	              ,{field: 'username', title: '用户名', width: 120}
	              ,{field: 'email', title: '邮箱', minWidth: 150}
	              ,{field: 'sign', title: '签名', minWidth: 160}
	              ,{field: 'sex', title: '性别', width: 80}
	              ,{field: 'city', title: '城市', width: 100}
	              ,{field: 'experience', title: '积分', width: 80, sort: true}
	            ]]
	    ,data: [{
	        "id": "10001"
	        ,"username": "杜甫"
	        ,"email": "xianxin@layui.com"
	        ,"sex": "男"
	        ,"city": "浙江杭州"
	        ,"sign": "人生恰似一场修行"
	        ,"experience": "116"
	        ,"ip": "192.168.0.8"
	        ,"logins": "108"
	        ,"joinTime": "2016-10-14"
	      }, {
	        "id": "10002"
	        ,"username": "李白"
	        ,"email": "xianxin@layui.com"
	        ,"sex": "男"
	        ,"city": "浙江杭州"
	        ,"sign": "人生恰似一场修行"
	        ,"experience": "12"
	        ,"ip": "192.168.0.8"
	        ,"logins": "106"
	        ,"joinTime": "2016-10-14"
	        ,"LAY_CHECKED": true
	      }, {
	        "id": "10003"
	        ,"username": "王勃"
	        ,"email": "xianxin@layui.com"
	        ,"sex": "男"
	        ,"city": "浙江杭州"
	        ,"sign": "人生恰似一场修行"
	        ,"experience": "65"
	        ,"ip": "192.168.0.8"
	        ,"logins": "106"
	        ,"joinTime": "2016-10-14"
	      }, {
	        "id": "10004"
	        ,"username": "贤心"
	        ,"email": "xianxin@layui.com"
	        ,"sex": "男"
	        ,"city": "浙江杭州"
	        ,"sign": "人生恰似一场修行"
	        ,"experience": "666"
	        ,"ip": "192.168.0.8"
	        ,"logins": "106"
	        ,"joinTime": "2016-10-14"
	      }, {
	        "id": "10005"
	        ,"username": "贤心"
	        ,"email": "xianxin@layui.com"
	        ,"sex": "男"
	        ,"city": "浙江杭州"
	        ,"sign": "人生恰似一场修行"
	        ,"experience": "86"
	        ,"ip": "192.168.0.8"
	        ,"logins": "106"
	        ,"joinTime": "2016-10-14"
	      }, {
	        "id": "10006"
	        ,"username": "贤心"
	        ,"email": "xianxin@layui.com"
	        ,"sex": "男"
	        ,"city": "浙江杭州"
	        ,"sign": "人生恰似一场修行"
	        ,"experience": "12"
	        ,"ip": "192.168.0.8"
	        ,"logins": "106"
	        ,"joinTime": "2016-10-14"
	      }, {
	        "id": "10007"
	        ,"username": "贤心"
	        ,"email": "xianxin@layui.com"
	        ,"sex": "男"
	        ,"city": "浙江杭州"
	        ,"sign": "人生恰似一场修行"
	        ,"experience": "16"
	        ,"ip": "192.168.0.8"
	        ,"logins": "106"
	        ,"joinTime": "2016-10-14"
	      }, {
	        "id": "10008"
	        ,"username": "贤心"
	        ,"email": "xianxin@layui.com"
	        ,"sex": "男"
	        ,"city": "浙江杭州"
	        ,"sign": "人生恰似一场修行"
	        ,"experience": "106"
	        ,"ip": "192.168.0.8"
	        ,"logins": "106"
	        ,"joinTime": "2016-10-14"
	      }]
	  });
	  
	});
	</script>
</body>
</html>