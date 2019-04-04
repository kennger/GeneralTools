<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/3/15
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
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

         .table{
             width:100%;
             max-width: 100%;
         }
        .table>thead>tr{
            background: #edf7ff;
        }
        .table>thead>tr>th {
            white-space: nowrap;
            padding: 8px;
            line-height: 1.42857143;
        }

        .table>tbody>tr:nth-child(odd){
            background: #fff;
        }
        .table>tbody>tr:nth-child(even){
            background: #f7f7f7;
        }
        .table>tbody>tr:hover{
            background: #e3ecfc;
        }
        .table-cont{
            /**make table can scroll**/
            max-height: 500px;
            overflow: auto;
            /** add some style**/
            /*padding: 2px;*/
            background: #ddd;
            margin: 20px 10px;
            border: 1px solid #ddd;
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
    <tbody>
    <c:forEach items="${bean}" var="beanItem">

        <tr>
            <td>${beanItem}</td>
            <%--<td>${bean.sName }</td>--%>
            <%--<td>${bean.sText }</td>--%>
            <%--<td>${bean.sAge }</td>--%>

        </tr>

    </c:forEach>
    </tbody>
</table>
</body>
</html>
