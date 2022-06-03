/**
 * Class: B.Sc. in Computing
 * Description: Models an Employee
 * Date: 05/10/2020
 * @author seun opebiyi
 * @version 1.0
**/
package ie.lyit.hotel;

public class Employee extends Person implements Payable {
	private Date dob;			// Employee has a name & phoneNumber from Person 
	private Date startDate;	// AND dob, startDate, salary, & number
	private double salary;
	private int number;
    
	private static int nextNumber=10000;
 
	// Default Constructor
	// Called when object is created like this ==> 
	//    Employee e1 = new Employee();	
	public Employee() {
		super();	// NOTE:Don't have to put this in, it will be called anyway
		dob=new Date();
		startDate=new Date();
		salary=0.0;
		// Set number to static nextNumber before incrementing nextNumber
		number=nextNumber++;
	}

   // Overloaded Initialization Constructor
	// Called when object is created like this ==>
	//	  Name name = Name("Mr","Joe","Doe");
	//    Employee e2 = new Employee(name,"087 1234567",
   //								         new Date(25,12,1970),new Date(10,11,2009),55000);
	public Employee(Name name, String phoneNumber, Date dob, Date startDate, double salary) {
	    // Call super class constructor, passing fields required by Person
		super(name, phoneNumber);
		this.dob=dob;
		this.startDate=startDate;
		this.salary=salary;
		this.number=nextNumber++;		
	}
	
	// OVERRIDING the Person toString() method
	// to make it more specific to Employee
	//   10001 Mr Joe Doe		087 1234567		€36000.00
	@Override
	public String toString() {
		return number + " " + super.toString() + "\t€" + salary;
	}
	
	// equals() method
	// ==> Called when comparing one Employee with another
	//     if(e1.equals(e2))
	// Because Employee has a unique number then it is sufficient to compare the number field
	@Override
	public boolean equals(Object obj) {
		Employee eObj;
		if(obj instanceof Employee)
			eObj = (Employee)obj;
		else 
		   return false;
		
		return (this.number==eObj.number);
	}
	
	// set() and get() methods
	public void setDOB(Date dob){
		this.dob=dob;
	}
	public Date getDOB(){
		return dob;
	}
	public void setStartDate(Date startDate){
		this.startDate=startDate;
	}
	public Date getStartDate(){
		return startDate;
	}	
	public void setSalary(double salary){
		this.salary=salary;
	}
	public double getSalary(){
		return salary;
	}
	// You shouldn't be able to setNumber() as it is unique, 
	// so don't provide a setNumber() method
	public int getNumber(){
		return number;
	}			
	
	@Override
	public double calculatePay(double taxPercentage) {
		// return the monthly pay as salary/12 less taxPercentage
		double pay=salary/12;
		pay -= (pay * (taxPercentage/100));
		return pay;
	}

	@Override
	public double incrementSalary(double incrementAmount) {
		// add incrementAmount to, and return the new salary
		// salary should not go over a maximum salary of €150,000
		salary += incrementAmount;
			
		if(salary > MAX_SALARY)
			salary = MAX_SALARY;
			
		return salary;
	}
}