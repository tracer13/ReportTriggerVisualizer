<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="totalWithdrawal" type="String"--%>
<%--@elvariable id="withdrawalsList" type="java.util.List"--%>
<%--@elvariable id="transfersList" type="java.util.List"--%>
<%--@elvariable id="totalTransfer" type="Double"--%>
<html>
<head>
    <title>Private Cabinet Reports</title>
    <meta http-equiv="Content-Type" content="text/html charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel= "stylesheet" type="text/css" href="<c:url value="/resources/css/styles.css" />"/>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script src="<c:url value="/resources/js/scripts.js"/>"></script>
</head>
<body>
    <table border="1" class="reportMainFrame">
        <tbody>
            <tr>
                <td class="backToPlatforms" align="middle">
                    <input class="backButton" type="button" onclick="self.location='${pageContext.request.contextPath}/'" value="Back"/>
                </td>
                <td class="serverName" align="middle">
                    <b>Private Cabinet Reports</b>
                </td>
            </tr>
            <tr>
                <td class="report1" align="middle">
                    <input class="groupReportButton" type="button" id="withdrawalReportButton" value="IB withdrawals report"/>
                </td>
                <td class="reportWindow" rowspan="4" align="middle">

                    <form id="withdrawalReportForIB" method="GET" action="${pageContext.request.contextPath}/PCreports/getWithdrawals" hidden>
                        <table class="report1">
                            <tr>
                                <td class="enterNumber" colspan="2" align="left">
                                    Enter IB Code:
                                </td>
                            </tr>
                            <tr>
                                <td class="accountInputArea" align="left">
                                    <input type="text" id="ibCodeInputForWithdrawals" name="ibCodeInputForWithdrawals"/>
                                </td>
                                <td class="submitButtonArea" align="left">
                                    <input type="submit" id="codeSubmitButtonForTransfer" value="Get withdrawals">
                                </td>
                            </tr>
                            <tr>
                                <td class="outputArea" colspan="2" align="left">

                                    <table class="groupOutput table-hover">
                                        <thead>
                                            <tr>
                                                <th class="mongoTimeCell">Date</th>
                                                <th class="accountCell">Amount</th>
                                            </tr>
                                        </thead>
                                        <tbody id="withdrawalsTableBody">
                                            <c:forEach items="${withdrawalsList}" var="withdrawals">
                                                <tr align="middle">
                                                    <td class="mongoTimeCell">${withdrawals.date}</td>
                                                    <td class="accountCell">${withdrawals.amount}</td>
                                                </tr>
                                            </c:forEach>
                                            <tr>
                                                <td/>
                                                <td style="font-weight: bold" class="accountCell">${totalWithdrawal}</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </td>
                            </tr>
                        </table>
                    </form>

                    <form id="transfersReportForIB" method="GET" action="${pageContext.request.contextPath}/PCreports/getTransfers" hidden>
                        <table class="report1">
                            <tr>
                                <td class="enterNumber" colspan="2" align="left">
                                    Enter IB Code:
                                </td>
                            </tr>
                            <tr>
                                <td class="accountInputArea" align="left">
                                    <input type="text" id="ibCodeInputForTransfers" name="ibCodeInputForTransfers"/>
                                </td>
                                <td class="submitButtonArea" align="left">
                                    <input type="submit" id="codeSubmitButtonForWD" value="Get withdrawals">
                                </td>
                            </tr>
                            <tr>
                                <td class="outputArea" colspan="2" align="left">
                                    <table class="transfersOutput table-hover">
                                        <thead>
                                            <tr>
                                                <th class="mongoTimeCell">Date</th>
                                                <th class="newGroupCell">Transfer From IB</th>
                                                <th class="newGroupCell">Transfer To</th>
                                                <th class="newGroupCell">Amount</th>
                                            </tr>
                                        </thead>
                                            <tbody id="fromTransfersTableBody">
                                                <c:forEach items="${transfersList}" var="transfer">
                                                    <tr align="middle">
                                                        <td class="mongoTimeCell">${transfer.date}</td>
                                                        <td class="newGroupCell">${transfer.ibCode}</td>
                                                        <td class="newGroupCell">${transfer.account}</td>
                                                        <td class="newGroupCell">${transfer.amount}</td>
                                                    </tr>
                                                </c:forEach>
                                                <tr>
                                                    <td/>
                                                    <td/>
                                                    <td/>
                                                    <td style="font-weight: bold" class="accountCell">${totalTransfer}</td>
                                                </tr>
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
                    <input class="stateReportButton" type="button" id="transfersReportButton" value="IB transfers report"/>
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
