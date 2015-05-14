<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="groupHistoryList" type="java.util.List"--%>
<html>
<head>
    <title>CFD Report</title>
    <meta http-equiv="Content-Type" content="text/html charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel= "stylesheet" type="text/css" href="<c:url value="/resources/css/styles.css" />"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
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
                    <input class="groupReportButton" type="button" id="groupReportButton" value="Group Change Log"/>
                </td>
                <td class="reportWindow" rowspan="5" align="middle">

                    <form id="groupChangesForAccount" method="GET" action="/CFDreports/getLogs">
                        <table border="1" class="report1">
                            <tr>
                                <td class="enterNumber" colspan="2" align="left">
                                    Enter account Number:
                                </td>
                            </tr>
                            <tr>
                                <td class="accountInputArea" align="left">
                                    <input type="text" id="accountInput" name="accountInput"/>
                                </td>
                                <td class="submitButtonArea" align="left">
                                    <input type="submit" id="accountSubmitButton" value="Get groups">
                                </td>
                            </tr>
                            <tr>
                                <td class="outputArea" colspan="2" align="left">
                                    <table class="groupOutput table-hover">
                                        <thead>
                                            <tr align="middle">
                                                <th class="accountCell">Account</th>
                                                <th class="changeTimeCell">Change time</th>
                                                <th class="groupCell">Group</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr align="middle">
                                                <td class="accountCell"><c:out value="${groupHistoryList[0].userLogin}"/></td>
                                                <td class="changeTimeCell"><c:out value="${groupHistoryList[0].dateTime}"/></td>
                                                <td class="groupCell"><c:out value="${groupHistoryList[0].oldUserGroup}"/></td>
                                            </tr>
                                            <c:forEach items="${groupHistoryList}" var="group">
                                                <tr align="middle">
                                                    <td class="accountCell">${group.userLogin}</td>
                                                    <td class="changeTimeCell">${group.dateTime}</td>
                                                    <td class="groupCell">${group.newUserGroup}</td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </td>
                            </tr>
                        </table>
                    </form>

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
</body>
</html>
