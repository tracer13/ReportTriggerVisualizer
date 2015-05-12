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
        <td class="top" colspan="3">top</td>
      </tr>
      <tr>
        <td class="CFD"><a href="CFDreports.jsp">CFD</a></td>
        <td class="FX"><a href="FXreports.jsp">FX</a></td>
        <td class="DMA"><a href="DMAreports.jsp">DMA</a></td>
      </tr>
      <tr>
        <td class="bottom" colspan="3">bottom</td>
      </tr>
    </tbody>
  </table>
</html>
