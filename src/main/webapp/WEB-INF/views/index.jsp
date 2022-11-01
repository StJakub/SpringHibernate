<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style><%@include file="/WEB-INF/styles/styles.css"%></style>

<html>
<header>

</header>
<body>
<h2>Hello World!</h2>
<h3>Persons List</h3>

<button onclick="window.location.href='showCustomerForm'">Go to customer page</button>


<c:if test="${!empty customerList}">
  <table class="superTable">
    <tr class="superTable">
      <th> ID </th>
      <th> NAME </th>
      <th> SURNAME </th>
      <th> EMAIL </th>
    </tr>
    <c:forEach items="${customerList}" var="customer">
      <tr>
        <td>${customer.id}</td>
        <td>${customer.name}</td>
        <td>${customer.surname}</td>
        <td>${customer.email}</td>
        </a> Update </td>
      </tr>
    </c:forEach>
  </table>
</c:if>


</body>
</html>