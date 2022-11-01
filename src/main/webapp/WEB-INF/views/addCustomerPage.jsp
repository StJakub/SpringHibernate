<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style><%@include file="/WEB-INF/styles/styles.css"%></style>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Add a customer</h3>

<br>

<form:form method="POST"
           action="${pageContext.request.contextPath}/addCustomer" modelAttribute="customer">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="surname">Surname</form:label></td>
            <td><form:input path="surname"/></td>
        </tr>
        <tr>
            <td><form:label path="email">Email</form:label></td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
<br>
<button onclick="window.location.href='${pageContext.request.contextPath}/'">Back to main page</button>
</body>
</html>
