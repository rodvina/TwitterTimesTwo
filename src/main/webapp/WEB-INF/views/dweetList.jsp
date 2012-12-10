<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<%@ page session="false" %>
<html>
<head>
    <title>Dweets</title>
    <link rel="stylesheet" href="<c:url value="/resources/style.css" />" type="text/css" media="screen" />
</head>
<body>

    <p>Say twice as much with Dweets!</p>
    
    <form method="POST">
        <textarea name="message" cols="70" rows="4" maxlength="280"></textarea>
        <br/>
        <input type="submit" value="Dweet it!" />
    </form>

    <div id="dweetList">
    <c:choose>
        <c:when test="${not empty dweetList}">
            <c:forEach items="${dweetList}" var="dweet">
                <p>
                    <c:out value="${dweet.message}"/><br/>
                    <small><c:out value="${dweet.timestamp}"/></small>
                </p>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <p>You don't have any dweets!</p>        
        </c:otherwise>
    </c:choose>
    </div>

</body>
</html>
