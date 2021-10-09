<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<a href="first/checkParams?username=bantang13&height=100">请求参数</a><br/>

<a href="first/checkRequestParam?username=比&age=100">请求参数 传参进业务代码</a><br/>

<a href="first/checkRequestParam1?name=bantang13&salary=99.9">请求参数 传参进业务代码</a><br/>

<form action="first/checkPojo" method="post" name="form2">
    username: <input type="text" name="username"/>
    <br>
    password: <input type="password" name="password"/>
    <br>
    email: <input type="text" name="email"/>
    <br>
    age: <input type="text" name="age"/>
    <br>
    province: <input type="text" name="address.province"/>
    <br>
    city: <label>
    <input type="text" name="address.city"/>
</label>

    <br>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
