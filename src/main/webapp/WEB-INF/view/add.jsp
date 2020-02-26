<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/index3.css" rel="stylesheet">
<script type="text/javascript"  src="<%=request.getContextPath() %>/js/jquery-1.8.3.min.js"></script>
</head>
<body>
	添加页面
	<form:form action="/add" method="post"  enctype="multipart/form-data" modelAttribute="goods" >
		<table>
			<tr>
				<td>商品名称</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>英文名称</td>
				<td><form:input path="ename"/></td>
			</tr>
			<tr>
				<td>商品品牌</td>
				<td>
					<form:checkboxes items="${bs }" path="bid" itemValue="bid" itemLabel="bname"/>
				</td>
			</tr>
			<tr>
				<td>商品种类</td>
				<td>
					<form:checkboxes items="${ts }" path="tid" itemValue="tid" itemLabel="tname"/>
				</td>
			</tr>
			<tr>
				<td>尺寸</td>
				<td><form:input path="size"/></td>
			</tr>
			<tr>
				<td>单价</td>
				<td><form:input path="price"/></td>
			</tr>
			<tr>
				<td>数量</td>
				<td><form:input path="num"/></td>
			</tr>
			<tr>
				<td>标签</td>
				<td><form:input path="biao"/></td>
			</tr>
			<tr>
				<td>商品图片</td>
				<td>
					<input type="file" name="myFile">
				</td>
			</tr>
			<tr>
				<td colspan="10">
					<form:button>提交</form:button>
				</td>
			</tr>
		</table>
	</form:form>
	<script type="text/javascript">
	/* $(function() {
		$.post(
			"selectType",
			function(arr) {
				//alert(JSON.stringify(arr));
				for ( var i in arr) {
					$("[name=type]").append("<option label='"+arr[i].tname+"' value='"+arr[i].tid+"'>");
				}
			},
			"json"
		)
		$.post(
			"selectBrand",
			function(arr) {
				//alert(JSON.stringify(arr));
				for ( var i in arr) {
					$("[name=brand]").append("<option label='"+arr[i].bname+"' value='"+arr[i].bid+"'>");
				}
			},
			"json"
		)
	}) */
	</script>
</body>
</html>