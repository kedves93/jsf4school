$(document).ready(function() {
	$(".surveys-table-row").click(function() {
		var id = $(this).attr("id")
		$("#toggle_" + id).toggle("fast");
    });
	
	$("#user-icon").click(function() {
		$("#user-details-widget").toggle();
    });
});