<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Twitter Times Two</title>
    <link rel="stylesheet" href="<c:url value="/resources/style.css" />" type="text/css" media="screen" />
</head>
<body>
<h1>
	Twitter Times Two!
</h1>

<p>Feeling constrained by Twitter's 140 character limit? Break free with Twitter Times Two. Twitter Times Two gives
you <b>Double the Tweet</b>, or <i>Dweet</i> as we like to call it.</p>

<p>Stop being cut short and <a href="<c:url value="/dweets" />"/>start dweeting</a> now!</p>

</body>
</html>
