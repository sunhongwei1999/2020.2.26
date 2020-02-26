<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/index3.css" rel="stylesheet">
<script type="text/javascript"  src="<%=request.getContextPath() %>/js/jquery-1.8.3.min.js"></script>
</head>
<body>
	<form action="list" method="post">
		<input type="hidden" name="pageNum">
		种类:
		<select name="tid">
			<option label="请选择">
		</select>
		品牌:
		<select name="bid">
			<option label="请选择">
		</select>
		单价范围:
		<input type="text" name="p1" value="${gv.p1 }">至<input type="text" name="p2" value="${gv.p2 }">
		商品名称:
		<input type="text" name="name" value="${gv.name }">
		<button>查询</button>
		<input type="button" onclick="add()" value="添加">
	</form>
	<table>
		<tr>
			<td>编号</td>
			<td>商品名称</td>
			<td>英文名称</td>
			<td>商品品牌</td>
			<td>商品种类</td>
			<td>尺寸</td>
			<td>单价</td>
			<td>数量</td>
			<td>标签</td>
			<td>商品图片</td>
		</tr>
		<c:forEach items="${page.list }" var="g" varStatus="count">
			<tr>
				<td>${count.count+page.startRow-1 }</td>
				<td>${g.name }</td>
				<td>${g.ename }</td>
				<td>${g.brand.bname }</td>
				<td>${g.type.tname }</td>
				<td>${g.size }</td>
				<td>${g.price }</td>
				<td>${g.num }</td>
				<td>${g.biao }</td>
				<td>
					<img alt="失败" src="file/${g.imgurl }" style="height: 50px;width: 50px">
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="50">
				<button onclick="fenye(1)">首页</button>
				<button onclick="fenye(${page.prePage==0?1:page.prePage})">上一页</button>
				<button onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})">下一页</button>
				<button onclick="fenye(${page.pages})">尾页</button>
				第${page.pageNum }页/共${page.pages }页,一共${page.total }条数据
			</td>
		</tr>
	</table>
	
	<script type="text/javascript">
		$(function() {
			$.post(
				"selectType",
				function(arr) {
					//alert(JSON.stringify(arr));
					for ( var i in arr) {
						$("[name=tid]").append("<option label='"+arr[i].tname+"' value='"+arr[i].tid+"'>");
					}
				},
				"json"
			)
			$.post(
				"selectBrand",
				function(arr) {
					//alert(JSON.stringify(arr));
					for ( var i in arr) {
						$("[name=bid]").append("<option label='"+arr[i].bname+"' value='"+arr[i].bid+"'>");
					}
				},
				"json"
			)
		})
		
		function fenye(pageNum) {
			$("[name=pageNum]").val(pageNum);
			$("form").submit();
		}
		function add() {
			location="toAdd";
		}
	</script>
</body>
</html>