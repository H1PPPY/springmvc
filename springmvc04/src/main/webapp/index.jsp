<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="hello/checkSessionAttributes">checkSessionAttributes 设置session值</a><br/>

<a href="hello/check1">验证session值</a><br/>

<a href="hello/check2">servlet中 设置session</a><br/>

<a href="hello/check3">验证session值</a><br/>

<a href="hello/check4">清除session值</a><br/>


<a href="hello/checkRedirect">重定向jsp页面</a>
<br/>

<a href="hello/checkForward">转化jsp页面</a>
<br/>

<a href="hello/checkRedirectAction">重定向 处理器 页面</a>
<br/>

<a href="hello/checkForwardAction">转化 处理器 页面</a>
<br/>

<%--
<a href="hello/checkRestful/ww">测试checkRestful/ww</a><br/>
--%>

<a href="hello/checkRestful/1">测试checkRestful/1 :查询</a><br/>

<form action="hello/checkRestful" method="post">
    <input type="submit" value="测试Restful POST :添加">
</form>

<form action="restfulAction/checkRestful/1" method="post">
    <input type="hidden" name="_method" value="PUT"/>
    <input type="submit" value="测试Restful PUT 修改"/>
</form>
<br>

<form action="restfulAction/checkRestful/1" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
    <input type="submit" value="测试Restful DELETE 删除"/>
</form>



<a href="antAction/abc/createstudent">测试ant风格1</a><br/>
<a href="antAction/xyz/createstudent">测试ant风格1a</a>
<br>


<a href="antAction/abc/createstudent1">测试ant风格2</a>
<br/>
<a href="antAction/xyz/abc/createstudent1">测试ant风格2a</a>
<br/>
<a href="antAction/createstudent1">测试ant风格2b</a>
<br>



<a href="antAction/createstudent2ab">测试ant风格3</a>
<br/>
<a href="antAction/createstudent2xy">测试ant风格3a</a>
<br/>
<a href="antAction/createstudent2xyz">测试ant风格3b</a>
<%--//??只能够接两个字符,所以报错--%>
<br>

</body>
</html>

