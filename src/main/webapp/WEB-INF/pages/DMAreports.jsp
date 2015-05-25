<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="groupHistoryList" type="java.util.List"--%>
<%--@elvariable id="stateHistoryList" type="java.util.List"--%>
<%--@elvariable id="idHistoryList" type="java.util.List"--%>
<html>
<head>
    <title>DMA Report</title>
    <meta http-equiv="Content-Type" content="text/html charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel= "stylesheet" type="text/css" href="<c:url value="/resources/css/styles.css" />"/>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script src="http://malsup.github.com/jquery.form.js"></script>
    <script src="<c:url value="/resources/js/scripts.js"/>"></script>
</head>
<body>
<table border="1" class="reportMainFrame">
    <tbody>
    <tr>
        <td class="backToPlatforms" align="middle">
            <input class="backButton" type="button" onclick="self.location='/'" value="Back"/>
        </td>
        <td class="serverName" align="middle">
            <b>DMA Reports</b>
        </td>
    </tr>
    <tr>
        <td class="report1" align="middle">
            <input class="groupReportButton" type="button" id="groupReportButton" value="Group Change Log"/>
        </td>
        <td class="reportWindow" rowspan="4" align="middle">

            <form id="groupChangesForAccount" method="GET" action="/DMAreports/getGroupLogs" hidden>
                <table class="report1">
                    <tr>
                        <td class="enterNumber" colspan="2" align="left">
                            Enter account Number:
                        </td>
                    </tr>
                    <tr>
                        <td class="accountInputArea" align="left">
                            <input type="text" id="accountInputForGroup" name="accountInputForGroup"/>
                        </td>
                        <td class="submitButtonArea" align="left">
                            <input type="submit" id="accountSubmitButtonForGroup" value="Get groups">
                        </td>
                    </tr>
                    <tr>
                        <td class="outputArea" colspan="2" align="left">

                            <table class="groupOutput table-hover">
                                <thead>
                                <tr>
                                    <th class="accountCell">Account</th>
                                    <th class="changeTimeCell">Change time</th>
                                    <th class="groupCell">Group</th>
                                </tr>
                                </thead>
                                <tbody id="groupTableBody">
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


            <form id="stateChangesForAccount" method="GET" action="/DMAreports/getStateLogs" hidden>
                <table class="report1">
                    <tr>
                        <td class="enterNumber" colspan="2" align="left">
                            Enter account Number:
                        </td>
                    </tr>
                    <tr>
                        <td class="accountInputArea" align="left">
                            <input type="text" id="accountInputForState" name="accountInputForState"/>
                        </td>
                        <td class="submitButtonArea" align="left">
                            <input type="submit" id="accountSubmitButtonForState" value="Get state">
                        </td>
                    </tr>
                    <tr>
                        <td class="outputArea" colspan="2" align="left">

                            <table class="stateOutput table-hover">
                                <thead>
                                <tr>
                                    <th class="accountCell">Account</th>
                                    <th class="changeTimeCell">Change time</th>
                                    <th class="groupCell">State</th>
                                </tr>
                                </thead>
                                <tbody id="stateTableBody">
                                <tr align="middle">
                                    <td class="accountCell"><c:out value="${stateHistoryList[0].userLogin}"/></td>
                                    <td class="changeTimeCell"><c:out value="${stateHistoryList[0].dateTime}"/></td>
                                    <td class="groupCell"><c:out value="${stateHistoryList[0].oldUserState}"/></td>
                                </tr>
                                <c:forEach items="${stateHistoryList}" var="state">
                                    <tr align="middle">
                                        <td class="accountCell">${state.userLogin}</td>
                                        <td class="changeTimeCell">${state.dateTime}</td>
                                        <td class="groupCell">${state.newUserState}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>

                        </td>
                    </tr>
                </table>
            </form>

            <form id="idChangesForAccount" method="GET" action="/DMAreports/getIdLogs" hidden>
                <table class="report1">
                    <tr>
                        <td class="enterNumber" colspan="2" align="left">
                            Enter account Number:
                        </td>
                    </tr>
                    <tr>
                        <td class="accountInputArea" align="left">
                            <input type="text" id="accountInputForId" name="accountInputForId"/>
                        </td>
                        <td class="submitButtonArea" align="left">
                            <input type="submit" id="accountSubmitButtonForId" value="Get Id">
                        </td>
                    </tr>
                    <tr>
                        <td class="outputArea" colspan="2" align="left">

                            <table class="idOutput table-hover">
                                <thead>
                                <tr>
                                    <th class="accountCell">Account</th>
                                    <th class="changeTimeCell">Change time</th>
                                    <th class="groupCell">ID</th>
                                </tr>
                                </thead>
                                <tbody id="idTableBody">
                                <tr align="middle">
                                    <td class="accountCell"><c:out value="${idHistoryList[0].userLogin}"/></td>
                                    <td class="changeTimeCell"><c:out value="${idHistoryList[0].dateTime}"/></td>
                                    <td class="groupCell"><c:out value="${idHistoryList[0].oldUserID}"/></td>
                                </tr>
                                <c:forEach items="${idHistoryList}" var="id">
                                    <tr align="middle">
                                        <td class="accountCell">${id.userLogin}</td>
                                        <td class="changeTimeCell">${id.dateTime}</td>
                                        <td class="groupCell">${id.newUserID}</td>
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
            <input class="stateReportButton" type="button" id="stateReportButton" value="State Change Log"/>
        </td>
    </tr>
    <tr>
        <td class="report3" align="middle">
            <input class="idReportButton" type="button" id="idReportButton" value="ID Change Log"/>
        </td>
    </tr>
    <tr>
        <td class="reportEmpty" align="middle">
        </td>
    </tr>
    </tbody>
</table>
</body>
</html>
