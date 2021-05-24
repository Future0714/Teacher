<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <%
        //获取Cookie
        Cookie[] cookies = request.getCookies();
        //遍历获取cookies
        if (cookies != null){
            for (Cookie co:cookies) {
                if ("username".equals(co.getName())){
                    pageContext.setAttribute("username",co.getValue());
                }
                if ("password".equals(co.getName())){
                    pageContext.setAttribute("password",co.getValue());
                }
            }
        }
    %>
    <form action="loginServlet" method="post">
        账号:<input type="text" name="username" value="${username}"><br>
        密码:<input type="password" name="password" value="${password}"><br>
        <input type="checkbox" name="remember" value="ok" ${empty username? "":checked}>记住密码<br>
        <input type="submit" value="登录">
    </form>
</body>
</html>
