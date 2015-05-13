<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>CFD Report</title>
    <meta http-equiv="Content-Type" content="text/html charset=UTF-8">
    <link rel= "stylesheet" type="text/css" href="<c:url value="/resources/css/styles.css" />"/>
</head>
    <table border="1" class="reportMainFrame">
        <tbody>
            <tr>
                <td class="backToPlatforms" align="middle">
                    <a href="<c:out value="/"/>">Back</a>
                </td>
                <td class="serverName" align="middle">
                    <h2>CFD Reports</h2>
                </td>
            </tr>
            <tr>
                <td class="report1" align="middle">
                    Report 1
                </td>
                <td class="reportWindow" rowspan="5" align="middle">


                    <table border="1" class="report1">
                        <tr>
                            <td class="enterNumber" colspan="2" align="left">
                                Enter account Number
                            </td>
                        </tr>
                        <tr>
                            <td class="accountInputArea" align="middle">
                                Input field
                            </td>
                            <td class="submitButtonArea" align="middle">
                                Button
                            </td>
                        </tr>
                        <tr>
                            <td class="outputArea" colspan="2" align="middle">
                                Output
                            </td>
                        </tr>
                    </table>


                </td>
            </tr>
            <tr>
                <td class="report2" align="middle">
                    Report 2
                </td>
            </tr>
            <tr>
                <td class="report3" align="middle">
                    Report 3
                </td>
            </tr>
            <tr>
                <td class="report4" align="middle">
                    Report 4
                </td>
            </tr>
            <tr>
                <td class="reportEmpty" align="middle">
                    Empty
                </td>
            </tr>
        </tbody>
    </table>
</html>
