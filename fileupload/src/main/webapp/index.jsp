<%--
  Created by IntelliJ IDEA.
  User: zjk688889
  Date: 2021/2/11
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="/tt" method="post" enctype="multipart/form-data">
    文件:<input type="file" name="upload"/><br/>
    提交:<input type="submit" value="提交"/>
</form>
</body>
</html>
