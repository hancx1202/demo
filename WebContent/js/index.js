/**
  项目JS主入口
  以依赖layui的layer和form模块为例
**/    
layui.define(['element','layer', 'form'], function(exports){
  var layer = layui.layer
  ,form = layui.form
  element = layui.element; //注意：导航 依赖 element 模块，否则无法进行功能性操作
  
  layer.msg('Hello World');
  
  exports('index', {}); //注意，这里是模块输出的核心，模块名必须和use时的模块名一致
});    