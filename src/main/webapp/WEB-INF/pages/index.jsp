<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Trigger Reports</title>
        <meta http-equiv="Content-Type" content="text/html charset=UTF-8">
        <link rel= "stylesheet" type="text/css" href="<c:url value="/resources/css/styles.css" />"/>
    </head>
    <table class="main">
        <tbody>
            <tr>
                <td class="top" colspan="3" align="middle"><h2>Select Platform</h2></td>
            </tr>
            <tr>
                <td class="platformSelector" align="middle">
                    <input class="platformSelectorButton" type="button" onclick="self.location='${pageContext.request.contextPath}/CFDreports'" value="CFD"/>
                </td>
            </tr>
            <tr>
                <td class="platformSelector" align="middle">
                    <input class="platformSelectorButton" type="button" onclick="self.location='${pageContext.request.contextPath}/FXreports'" value="FX"/>
                </td>
            </tr>
            <tr>
                <td class="platformSelector" align="middle">
                    <input class="platformSelectorButton" type="button" onclick="self.location='${pageContext.request.contextPath}/DMAreports'" value="DMA"/>
                </td>
            </tr>
            <tr>
                <c:url value="/j_spring_security_logout" var="logoutUrl" />
                <form action="${logoutUrl}" method="post" id="logoutForm"/>
                <script>
                    function formSubmit() {
                        document.getElementById("logoutForm").submit();
                    }
                </script>
                <td class="logout" colspan="3" align="middle">
                    <input class="logoutButton" type="button" value="Logout" onclick="formSubmit()"/>
                </td>
            </tr>
            <tr>
                <td class="bottom" colspan="3" align="middle">
                </td>
            </tr>
        </tbody>
    </table>
</html>
