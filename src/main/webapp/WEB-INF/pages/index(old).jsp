<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<title>
		Version 0.0.1
	</title>
	<head>
		<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
	</head>
	<body>
	<table border="1"><td>
		<form id="accountsInGroupTable" method="GET" action="/getAccounts" hidden="true">
			Enter group name:
			<br><input type="text" id="groupInput" name="groupInput"/></br>
			<br><input id="button" value="Show accounts" type="submit"></br>
			<table class="data" align="left" border="1">
				<br>Accounts:</br>
				<c:forEach items="${accountList}" var="account">
					<tr>
						<td>${account.mt4UserLogin}</td>
					</tr>
				</c:forEach>
			</table>
		</form></td>
		<td>
			<form id="logsForAction" method="GET" action="/getLogs">
				Enter action:
				<br><input type="text" id="actionInput" name="actionInput"/></br>
				<br><input id="button2" value="Show logs" type="submit"></br>
				<table class="data" align="left" border="1">
					<br>Accounts:</br>
					<c:forEach items="${logsList}" var="log">
						<tr>
							<td>${log.changes}</td>
						</tr>
					</c:forEach>
				</table>
			</form></td>
	</table>
	</body>
</html>