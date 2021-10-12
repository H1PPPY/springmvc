<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="static/js/jquery-1.8.3.js"></script>
</head>
<body>
<h1>测试AJAX JSON 传参</h1>
<script type="text/javascript">
    $().ready(
        function () {
            $('#b1').click(
                function () {
                    //第一个业务处理
                    $.ajax(
                        {
                            url: "json/checkJsonObjectParam",
                            cache: false,
                            type: "GET",
                            dataType: "json",
                            async: true,
                            data: {username: $("#usernameid").val(), password: $("#passwordid").val()},  //获取前端数据
                            success: function (msg) {
                                $("#div1").html(msg.username + "   " + msg.password + "   " + msg.age + "  " + msg.address.province);
                                //在页面显示数据
                            },
                            error: function (errordata) {
                                alert("wrong!!" + errordata);
                            }
                        }
                    )
                }
            );
            $("#b2").click(
                function () {
                    //真实场景下的ajax调用
                    $.ajax(
                        {
                            url: "json/checkJsonListObjectParam",
                            cache: false,
                            type: "GET",
                            dataType: "json",
                            async: false,
                            data: {username: $("#usernameid").val(), password: $("#passwordid").val()},
                            //带参数就要这个 ，key是类中属性名
                            success: function (msg) {
                                var str = "";
                                $.each(msg, function (index, value) {
                                        str = str + value.username + "   " + value.age + "  "
                                            + value.address.province + "<br/>";
                                        //同样可以用这个集合的值取更新当前页面的组件
                                    }
                                );
                                $("#div2").html(str);//在页面显示数据
                            },
                            error: function (errordata) {
                                alert("wrong!!" + errordata);
                            }
                        }
                    );
                }
            )
        }
    )
</script>
<div>
    用户名:
    <input type="text" name="username" id="usernameid"><br/>
    密码:
    <input type="password" name="password" id="passwordid"><br/>
</div>
<input type="button" value="获取单个对象" id="b1"/>

<div id="div1"></div>

<input type="button" value="获取多个对象" id="b2"/>
<div id="div2"></div>
</body>
</html>
