<%@ page import="java.util.List" %>
<%@ page import="interfaces.PO.ClientPO" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: echerkas
  Date: 26.11.2015
  Time: 1:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All clients</title>
</head>
<body>
<%--<jsp:useBean id="clientList" scope="request" type="interfaces.GenericDAOImpl"/>--%>


<c:forEach var="client" items="${clientList}">

    <c:out value="${client}" />

</c:forEach>
<%--<table>--%>
<%--<% List <ClientPO> clients = (List <ClientPO>) request.getAttribute("clients");--%>
<%--%>--%>
<%--<c:forEach var="clients" items="${requestScope.clients}">--%>
<%--<tr>--%>
    <%--<td><c:out value="${clients.name} + ${clients.id}" /></td>--%>
<%--</tr>--%>
<%--</c:forEach>--%>
<%--</table>--%>
<%--<%= request.getAttribute("clients") %>--%>
</body>
</html>
