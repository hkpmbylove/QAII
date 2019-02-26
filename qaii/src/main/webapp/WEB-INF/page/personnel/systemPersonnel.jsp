<!DOCTYPE html>
<html>
<%@ page  contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <title>QAII智慧管理平台</title>
  <link rel="shortcut icon" type="image/x-icon" href="${basePath}/image/icon.ico" media="screen" />
  <link rel="stylesheet" href="${basePath}/commen/layui/css/layui.css" media="all">
  <link rel="stylesheet" href="${basePath}/css/layuiAdd.css">
   <link rel="stylesheet" href="${basePath}/commen/layui/css/style.css">
	<script src="${basePath}/js/jquery-3.3.1.min.js"></script>
	<script src="${basePath}/js/jquery.table2excel.js"></script>
  <style>
    body{margin: 10px;}
	.layui-form{border:none;}
	table th{display:none;}
	.systemTest{height:auto;}
	table{ border:none !important;}
	table tr,table td{border:none !important;}
	table tr:hover{background:rgba(0,0,0,0) !important;}
	.layui-table-header{border:none;}
	@media screen and (max-width: 1300px){
		.layui-table-cell {
		    line-height: 32px;
		    padding: 0 15px;
		    position: relative;
		    overflow: hidden;
		    text-overflow: ellipsis;
		    white-space: nowrap;
		    box-sizing: border-box;
		}
	}
	  .treefir{
		  min-width: 40%;
		  max-width: 60%;
		  overflow: hidden;
		  text-overflow: ellipsis;
		  white-space: nowrap;
		  display: inline-block;
		  height: 35px;
		  border: 1px #ededed solid;
		  line-height: 35px;
		  padding-left: 25px;
		  background: #f0f0f0;
		  color: #888;
		  font-size: 16px;
		  vertical-align: middle;
	  }
	  .treechild{
		  margin-left: 30px;
		  margin-top:5px;
	  }
	.terrchildc{
		margin-top:5px;
		padding-left:10px;
		color: #888;
		font-size: 14px;
		min-width: 40%;
		max-width: 60%;
		overflow: hidden;
		text-overflow: ellipsis;
		white-space: nowrap;
		display: inline-block;
		background: #f7f7f7;
		height:35px;
		line-height: 35px;
		vertical-align: middle;
	}
  </style>
</head>
<body id="bodyHei">
	<div class="tool">
		<div class="layui-btn-group demoTable">
		  <span class="limit">所有部门</span>
		</div>
        <div class="site-demo-button" id="layerDemo" style="float: right;margin-right: 115px;">
            <button data-method="offset" data-type="auto" class="layui-btn layui-btn-normal export" >
                添加部门
            </button>
        </div>
		<%--<button class="layui-btn btn export " >
			添加部门
		</button>--%>

	</div>
	<div class="systemBox">
		<ul id="demo">
			<%--<li name="fir">
				<div>
					<div class="treefir">研究院</div>
					<a class="layui-btn layui-btn-xs" style="margin-left:20px;"><i class="layui-icon layui-icon-edit"></i>编辑</a>
					<a class="layui-btn layui-btn-xs layui-btn-edit"><i class="layui-icon layui-icon-edit"></i>添加二级部门</a>
					<a class="layui-btn layui-btn-xs layui-btn-danger"><i class="layui-icon layui-icon-delete"></i>移除</a>
				</div>
				<ul class="treechild">
					<li name="child1">
						<div>
							<div class="terrchildc">研究院</div>
							<a class="layui-btn layui-btn-xs button" style="margin-left:20px;"><i class="layui-icon layui-icon-edit"></i>编辑</a>
							<a class="layui-btn layui-btn-xs button" ><i class="layui-icon layui-icon-delete"></i>移除</a>
						</div>
					</li>
					<li name="child2">
						<div>
							<div class="terrchildc">研究院</div>
							<a class="layui-btn layui-btn-xs button" style="margin-left:20px;"><i class="layui-icon layui-icon-edit"></i>编辑</a>
							<a class="layui-btn layui-btn-xs button" ><i class="layui-icon layui-icon-delete"></i>移除</a>
						</div>
					</li>
					<li name="child3">
						<div>
							<div class="terrchildc">研究院</div>
							<a class="layui-btn layui-btn-xs button" style="margin-left:20px;"><i class="layui-icon layui-icon-edit"></i>编辑</a>
							<a class="layui-btn layui-btn-xs button" ><i class="layui-icon layui-icon-delete"></i>移除</a>
						</div>
					</li>
					<li name="child4">
						<div>
							<div class="terrchildc">研究院</div>
							<a class="layui-btn layui-btn-xs button" style="margin-left:20px;"><i class="layui-icon layui-icon-edit"></i>编辑</a>
							<a class="layui-btn layui-btn-xs button" ><i class="layui-icon layui-icon-delete"></i>移除</a>
						</div>
					</li>
				</ul>
			</li>--%>
		</ul>
	</div>
	

<script src="${basePath}/commen/layui/layui.js"></script>
<script>
    $(document).ready(function(){
        let html="";
        html="<li name='fir' style='margin-bottom:15px'>" +

            "<div>" +
            "<div class='treefir'>研究院</div>" +
            "<a class='layui-btn layui-btn-xs fedit' style='margin-left:20px;'><i class='layui-icon layui-icon-edit'></i>编辑</a>" +
            "<a class='layui-btn layui-btn-xs layui-btn-edit fadd' ><i class='layui-icon layui-icon-edit'></i>添加二级部门</a>" +
            "<a class='layui-btn layui-btn-xs layui-btn-danger fdel'><i class='layui-icon layui-icon-delete'></i>移除</a>" +
            "</div>" +

            "<ul class='treechild'>" +

            "<li name='child1'>" +
            "<div>" +
            "<div class='terrchildc'>研究院</div>" +
            "<a class='layui-btn layui-btn-xs button sedit' style='margin-left:20px;'><i class='layui-icon layui-icon-edit'></i>编辑</a>" +
            "<a class='layui-btn layui-btn-xs button sdel' ><i class='layui-icon layui-icon-delete'></i>移除</a>" +
            "</div>" +
            "</li>" +

            "<li name='child2'>" +
            "<div>" +
            "<div class='terrchildc'>研究院</div>" +
            "<a class='layui-btn layui-btn-xs button sedit' style='margin-left:20px;'><i class='layui-icon layui-icon-edit'></i>编辑</a>" +
            "<a class='layui-btn layui-btn-xs button sdel' ><i class='layui-icon layui-icon-delete'></i>移除</a>" +
            "</div>" +
            "</li>" +

            "</ul>" +
            "</li>";
        html=html+html;
        $("#demo").append(html);
    });
	
//添加信息框	
	
layui.use('layer', function(){ //独立版的layer无需执行这一句
  var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
 
  //触发事件
  var active = {
    setTop: function(){
      var that = this; 
    }  
    ,offset: function(othis){
      var type = othis.data('type')
      ,text = othis.text();
      var addedit='<div class="layui-form-item" style="padding:15px;padding-bottom:0px;">'+
		'<label style="padding:9px 5px;">一级部门添加</label>'+
		'<input id="sys-add" name="interest" lay-filter="aihao" style="margin-left:10px;height:36px;width:120px;color:#888;border:1px solid #d7d7d7;border-radius:3px;">'+
		'</input>'+
		'</div>';
      layer.open({
        type: 1
        ,offset: type //具体配置参考：http://www.layui.com/doc/modules/layer.html#offset
        ,id: 'layerDemo'+type //防止重复弹出
        ,content: addedit
        ,btn: ['提交', '关闭']
	  	,yes: function(index, layero){
	    //提交修改按钮
		var role=$("#sys-add").val();
	    if(role==null){
	    	alert("请输入内容")
	    }else{
			$.post({
				url:"addDeptInfo.do",
				data:{
					deptName:role
				},
				success:function(data){
					if(data.data){
						alert("添加成功")
					}else{
						alert("添加失败")
					}
				}
			})
	    }
						
	    }
	    ,'关闭': function(index, layero){
	     //关闭按钮
	    }
      });
    }
  };
  
  $('#layerDemo .layui-btn').on('click', function(){
    var othis = $(this), method = othis.data('method');
    active[method] ? active[method].call(this, othis) : '';
  });
  
});

//点击事件
	/*一级修改*/
    $("#demo").on("click", ".fedit", function(){
        let id=$(this).parents("li").attr("name");
        let str='<div class="layui-form-item" style="padding:15px;padding-bottom:0px;">'+
        '<label style="padding:9px 5px;">一级部门修改</label>'+
        '<input id="sys-add" name="interest" lay-filter="aihao" style="margin-left:10px;height:36px;width:120px;color:#888;border:1px solid #d7d7d7;border-radius:3px;">'+
        '</input>'+
        '</div>';
        layer.open({
            type: 1
            ,content: str
            ,btn: ['提交', '关闭']
            ,yes: function(index, layero){
                //提交修改按钮
                var role=$("#sys-add").val();
                if(role==null){
                    alert("请输入内容")
                }else{
                    $.post({
                        url:"addDeptInfo.do",
                        data:{
                            deptName:role
                        },
                        success:function(data){
                            if(data.data){
                                alert("添加成功")
                            }else{
                                alert("添加失败")
                            }
                        }
                    })
                }

            }
            ,'关闭': function(index, layero){
                //关闭按钮
            }
        });
        /*alert("段落被点击了edit。"+id);*/
    });
    /*一级添加二级*/
    $("#demo").on("click", ".fadd", function(){
        let id=$(this).parents("li").attr("name");
        let str='<div class="layui-form-item" style="padding:15px;padding-bottom:0px;">'+
            '<label style="padding:9px 5px;">添加二级部门</label>'+
            '<input id="sys-add" name="interest" lay-filter="aihao" style="margin-left:10px;height:36px;width:120px;color:#888;border:1px solid #d7d7d7;border-radius:3px;">'+
            '</input>'+
            '</div>';
        layer.open({
            type: 1
            ,content: str
            ,btn: ['提交', '关闭']
            ,yes: function(index, layero){
                //提交修改按钮
                var role=$("#sys-add").val();
                if(role==null){
                    alert("请输入内容")
                }else{
                    $.post({
                        url:"addDeptInfo.do",
                        data:{
                            deptName:role
                        },
                        success:function(data){
                            if(data.data){
                                alert("添加成功")
                            }else{
                                alert("添加失败")
                            }
                        }
                    })
                }

            }
            ,'关闭': function(index, layero){
                //关闭按钮
            }
        });
        /*alert("段落被点击了add。"+id);*/
    });
    /*一级删除*/
    $("#demo").on("click", ".fdel", function(){
        let id=$(this).parents("li").attr("name");
        alert("段落被点击了del。"+id);
    });
    /*二级修改*/
    $("#demo").on("click", ".sedit", function(){
        let id=$(this).parents("li").attr("name");
        let str='<div class="layui-form-item" style="padding:15px;padding-bottom:0px;">'+
            '<label style="padding:9px 5px;">二级部门修改</label>'+
            '<input id="sys-add" name="interest" lay-filter="aihao" style="margin-left:10px;height:36px;width:120px;color:#888;border:1px solid #d7d7d7;border-radius:3px;">'+
            '</input>'+
            '</div>';
        layer.open({
            type: 1
            ,content: str
            ,btn: ['提交', '关闭']
            ,yes: function(index, layero){
                //提交修改按钮
                var role=$("#sys-add").val();
                if(role==null){
                    alert("请输入内容")
                }else{
                    $.post({
                        url:"addDeptInfo.do",
                        data:{
                            deptName:role
                        },
                        success:function(data){
                            if(data.data){
                                alert("添加成功")
                            }else{
                                alert("添加失败")
                            }
                        }
                    })
                }

            }
            ,'关闭': function(index, layero){
                //关闭按钮
            }
        });
        /*alert("段落被点击了sedit。"+id);*/
    });
    /*二级删除*/
    $("#demo").on("click", ".sdel", function(){
        let id=$(this).parents("li").attr("name");
       /* alert("段落被点击了sdel。"+id);*/
    });
</script>
</body>
</html>        
        