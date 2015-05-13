<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Trigger Reports</title>
        <meta http-equiv="Content-Type" content="text/html charset=UTF-8">
        <link rel= "stylesheet" type="text/css" href="<c:url value="/resources/css/styles.css" />"/>
    </head>
    <table border="1" class="main">
        <tbody>
            <tr>
                <td class="top" colspan="3" align="middle">top</td>
            </tr>
            <tr>
                <td class="CFD" align="middle"><a href="<c:out value="CFDreports"/>">CFD</a></td>
                <td class="FX" align="middle"><a href="<c:out value="FXreports"/>">FX</a></td>
                <td class="DMA" align="middle"><a href="<c:out value="DMAreports"/>">DMA</a></td>
            </tr>
            <tr>
                <td class="bottom" colspan="3" align="middle">bottom</td>
            </tr>
        </tbody>
    </table>
</html>
