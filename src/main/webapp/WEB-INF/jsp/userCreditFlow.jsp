<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/3/15
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CHUANGJIN smsInfo show ...</title>

    <style type="text/css">
        table {
            width: 80%;
            border: 1px solid #ccc;
            margin-left: 10%;
            text-align: center;
        }
        table thead tr{
            border: 1px solid #ccc;
            background: yellow;
            height: 30px;
        }
        table tbody td{
            border: 1px solid #ccc;
            height: 25px;
        }
    </style>
</head>
<body>
<br />
<h1 style="text-align: center;width:100%;">SSM_DEMO By Advance</h1>
<br />
<br />
<hr />
<br />
<br />
<br />
<table>
    <thead>
    <tr>
        <td>sId</td>
        <td>sName</td>
        <td>sText</td>
        <td>sAge</td>
    </tr>
    </thead>
    <c:forEach items="${bean}" var="bean">
        <tbody>
        <tr>
            <td>${bean}</td>
            <%--<td>${bean.sName }</td>--%>
            <%--<td>${bean.sText }</td>--%>
            <%--<td>${bean.sAge }</td>--%>

        </tr>
        </tbody>
    </c:forEach>
</table>
</body>
</html>
