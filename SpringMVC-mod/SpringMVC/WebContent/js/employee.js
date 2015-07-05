var Employee = function(){
	$this = this;
	this.employeeName = "Default Name";
	this.employeeID = "Default ID";
	this.employeeDetails = function(){
		return "This Employee's Name is " + this.employeeName + " And has ID " + this.employeeID;
	};
};