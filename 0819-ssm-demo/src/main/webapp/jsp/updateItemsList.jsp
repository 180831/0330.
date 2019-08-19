<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">

</head>
<body>

<form action="queryitemsbyname.action" name="userinfoForm" method="post">
    <table border="0" align="right">
        <tr>
            <td>
                <input type="button" name="addbtn" value="新增" onclick="window.location.href='./jsp/addItems.jsp'" class="btn"/>
                <input type="button" name="modbtn" value="修改" onclick="operateData('checkboxupdate')" class="btn"/>
                <input type="button" name="delbtn" value="批量修改" onclick="operateData('checkboxupdateall')" class="btn"/>
                <input type="button" name="delbtn" value="删除" onclick="operateData('delete')" class="btn"/>
                <input type="button" name="delbtn" value="查询" onclick="window.location.href='queryitemsbyname.action'" class="btn"/>
            </td>
        </tr>
    </table>
    商品列表
    <table width="100%" border="1">
        <tr>
            <td>
                查询条件
                <input type="text" name="itemsCustom.name">
                <input type="submit" value="名称查询">
                <input type="submit" value="修改完成">
                <%--<input type="submit" value="提交修改">--%>
            </td>
        </tr>
    </table>
    <table width="100%" border="1">
        <tr>
            <td>
                <input type="checkbox"  name="chooseAll" onclick="checkall();"/>
            </td>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>生产日期</td>
            <td>商品描述</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${itemsListKey}" var="items">
            <tr>
                <td>
                    <input type="checkbox" name="selItem" value="${items.id }">
                </td>
                <td><input name="xxx" value="${items.name}"></td>
                <td><input name="xxx" value="${items.price}"></td>
                <td><input name="xxx" value="<fmt:formatDate value="${items.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>"></td>
                <td><input name="xxx" value="${items.detail}"></td>

            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
