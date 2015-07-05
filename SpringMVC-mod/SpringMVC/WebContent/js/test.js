$(document).ready(function(){
	console.log("Hi from console...............SOPA WEBSERVICE");

	
	$('#add').click(function(){
		console.log(this.id);
		showAddPage();
	});
	
	
	$( "#target" ).submit(function( event ) {
		  alert( "Handler for .submit() called." );
		  event.preventDefault();
		});
});

function showAddPage(){
	
	$.ajax({
		   //url: "https://localhost:8181/MyRestFulWebServiceProject/rest/kk/ws",
		   url: "http://localhost:8080/SpringMVC/add",
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