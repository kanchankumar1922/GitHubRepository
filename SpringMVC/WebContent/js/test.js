var ajaxURLS = {
		addPage    : "http://localhost:8080/SpringMVC/add",
		searchPage : "http://localhost:8080/SpringMVC/search",
		updatePage : "http://localhost:8080/SpringMVC/update",
		deletePage : "http://localhost:8080/SpringMVC/delete",
		searchEmployee : "http://localhost:8080/SpringMVC/searchEmployee",
		searchEmployeeByID : "http://localhost:8080/SpringMVC/searchEmployeeByID",
};

$(document).ready(function(){
	//console.log("Hi from console...............SOPA WEBSERVICE");

	
	$('#add').click(function(){
		showPage(ajaxURLS.addPage);
	});
	
	$('#search').click(function(){
		showPage(ajaxURLS.searchPage);
	});
	
	$('#update').click(function(){
		showPage(ajaxURLS.updatePage);
	});
	
	$('#delete').click(function(){
		showPage(ajaxURLS.deletePage);
	});
	
	$('#searchById').click(function(e){
		e.preventDefault();
		//$("#searchFormActionID").attr("action" , ajaxURLS.searchEmployeeByID + "?employeeID=" + $("#employeeID").val());
		showPage(ajaxURLS.searchEmployeeByID + "?employeeID=" + $("#employeeID").val());
	});
	
	$('#searchAllData').click(function(e){
		e.preventDefault();
		$("#searchFormActionID").attr("action" , ajaxURLS.searchEmployee);
		showPage(ajaxURLS.searchEmployee);
		//e.preventDefault();
	});
	
	
	/*$( "#target" ).submit(function( event ) {
		  console.log( "Handler for .submit() called." );
		  event.preventDefault();
		});*/
});

function showPage(varUrl){
	
	$.ajax({
		   //url: "https://localhost:8181/MyRestFulWebServiceProject/rest/kk/ws",
		   url: varUrl,
		  context: document.body
		}).done(function(elem) {
			
			//console.log("hi " + elem);
			$('#webcontent').html(elem);
			
		   /*console.log("Elem returned :: -->> " , JSON.stringify(elem));
		   
		   var listOfEmployees = new Array();
		   
		   for (var i = 0 ; i < elem.length ; i++){
			   console.log("Element :: " , elem[i]);
			   var employee = new Employee();
			   $.extend(employee , elem[i]);
			   listOfEmployees.push(employee);			   
		   }
		   
		   for (var i = 0 ; i < listOfEmployees.length ; i++){
			   console.log("Employee :: " , listOfEmployees[i].employeeDetails() );
		   }
		   //var nameObject = JSON.parse(elem);
		   //console.log(nameObject);
		   
		   console.log("Length of the elements :: " + elem.length);*/
		});
}