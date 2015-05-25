$(document).ready(function(){

    $("#groupReportButton").click(function(){

        $("#groupChangesForAccount").show();
        $("#stateChangesForAccount").hide();
        $("#idChangesForAccount").hide();
        $("#stateTableBody").empty();
        $("#idTableBody").empty();
    });

    $("#stateReportButton").click(function(){

        $("#groupChangesForAccount").hide();
        $("#stateChangesForAccount").show();
        $("#idChangesForAccount").hide();
        $("#groupTableBody").empty();
        $("#idTableBody").empty();
    });

    $("#idReportButton").click(function(){

        $("#groupChangesForAccount").hide();
        $("#stateChangesForAccount").hide();
        $("#idChangesForAccount").show();
        $("#groupTableBody").empty();
        $("#stateTableBody").empty();
    });

    if(window.location.href.indexOf("getGroupLogs") > -1){
        $("#groupChangesForAccount").show();
        $("#stateChangesForAccount").hide();
        $("#idChangesForAccount").hide();
    }

    if(window.location.href.indexOf("getStateLogs") > -1){
        $("#groupChangesForAccount").hide();
        $("#stateChangesForAccount").show();
        $("#idChangesForAccount").hide();
    }

    if(window.location.href.indexOf("getIdLogs") > -1){
        $("#groupChangesForAccount").hide();
        $("#stateChangesForAccount").hide();
        $("#idChangesForAccount").show();
    }

    $("#groupChangesForAccount").submit(function(){
        if ($.trim($("#accountInputForGroup").val()) === ""){
            alert ('input field is empty');
            return false;
        }
    });

    $("#stateChangesForAccount").submit(function(){
        if ($.trim($("#accountInputForState").val()) === ""){
            alert ('input field is empty');
            return false;
        }
    });

    $("#idChangesForAccount").submit(function(){
        if ($.trim($("#accountInputForId").val()) === ""){
            alert ('input field is empty');
            return false;
        }
    });

    $("#accountInputForGroup").keydown(function(e) {
        if ($.inArray(e.keyCode, [46, 8, 9, 27, 13, 110, 190]) !== -1 ||
            (e.keyCode == 65 && e.ctrlKey === true) ||
            (e.keyCode == 67 && e.ctrlKey === true) ||
            (e.keyCode == 86 && e.ctrlKey === true) ||
            (e.keyCode == 88 && e.ctrlKey === true) ||
            (e.keyCode >= 35 && e.keyCode <= 39)){
            return;
        }
        if ((e.shiftKey || (e.keyCode < 48 || e.keyCode > 57)) && (e.keyCode < 96 || e.keyCode > 105)) {
            e.preventDefault();
        }
    });

    $("#accountInputForState").keydown(function(e) {
        if ($.inArray(e.keyCode, [46, 8, 9, 27, 13, 110, 190]) !== -1 ||
            (e.keyCode == 65 && e.ctrlKey === true) ||
            (e.keyCode == 67 && e.ctrlKey === true) ||
            (e.keyCode == 86 && e.ctrlKey === true) ||
            (e.keyCode == 88 && e.ctrlKey === true) ||
            (e.keyCode >= 35 && e.keyCode <= 39)){
            return;
        }
        if ((e.shiftKey || (e.keyCode < 48 || e.keyCode > 57)) && (e.keyCode < 96 || e.keyCode > 105)) {
            e.preventDefault();
        }
    });

    $("#idInputForState").keydown(function(e) {
        if ($.inArray(e.keyCode, [46, 8, 9, 27, 13, 110, 190]) !== -1 ||
            (e.keyCode == 65 && e.ctrlKey === true) ||
            (e.keyCode == 67 && e.ctrlKey === true) ||
            (e.keyCode == 86 && e.ctrlKey === true) ||
            (e.keyCode == 88 && e.ctrlKey === true) ||
            (e.keyCode >= 35 && e.keyCode <= 39)){
            return;
        }
        if ((e.shiftKey || (e.keyCode < 48 || e.keyCode > 57)) && (e.keyCode < 96 || e.keyCode > 105)) {
            e.preventDefault();
        }
    });
});
