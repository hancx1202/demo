/**
  ��ĿJS�����
  ������layui��layer��formģ��Ϊ��
**/    
layui.define(['element','layer', 'form'], function(exports){
  var layer = layui.layer
  ,form = layui.form
  element = layui.element; //ע�⣺���� ���� element ģ�飬�����޷����й����Բ���
  
  layer.msg('Hello World');
  
  exports('index', {}); //ע�⣬������ģ������ĺ��ģ�ģ���������useʱ��ģ����һ��
});    