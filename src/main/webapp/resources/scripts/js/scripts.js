$(document).ready(function(){

    $("#groupReportButton").click(function(){

        $("#groupChangesForAccount").show();
        $("#stateChangesForAccount").hide();
        $("#stateTableBody").empty();
    })

    $("#stateReportButton").click(function(){

        $("#groupChangesForAccount").hide();
        $("#stateChangesForAccount").show();
        $("#groupTableBody").empty();
    })

    if(window.location.href.indexOf("getGroupLogs") > -1){
        $("#groupChangesForAccount").show();
        $("#stateChangesForAccount").hide();
    }

    if(window.location.href.indexOf("getStateLogs") > -1){
        $("#groupChangesForAccount").hide();
        $("#stateChangesForAccount").show();
    }


})
