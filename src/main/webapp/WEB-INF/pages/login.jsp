<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
    <meta http-equiv="Content-Type" content="text/html charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel= "stylesheet" type="text/css" href="<c:url value="/resources/css/styles.css" />"/>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script src="<c:url value="/resources/js/scripts.js"/>"></script>
</head>

<body onload='document.loginForm.username.focus();'>

<div id="login-box">

    <h3 align="middle">Report trigger visualizer</h3>

    <c:if test="${not empty error}">
        <div class="error">${error}</div>
    </c:if>
    <c:if test="${not empty msg}">
        <div class="msg">${msg}</div>
    </c:if>

    <form name='loginForm' action="<c:url value='j_spring_security_check' />" method='POST'>

        <table class="loginTable">
            <tr>
                <td>User:</td>
                <td>
                    <input type='text' name='username' value=''>
                </td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type='password' name='password' /></td>
            </tr>
            <tr>
                <td class="loginTd" colspan='2' align="middle">
                    <input class="submitLogin" name="submit" type="submit" value="Login" />
                </td>
            </tr>
        </table>

    </form>
</div>

</body>
</html>
