/**
 * Class: B.Sc. in Computing
 * Description: Models a Guest
 * Date: 05/10/2020
 * @author seun opebiyi
 * @version 1.0
**/
package ie.lyit.hotel;

public class Guest extends Person {// INHERITANCE - Customer IS-A Person
	// Customer has name & phoneNumber from Person
	private String emailAddress;    // AND emailAddress

	// Default Constructor
	// Called when a Guest object is created like this ==> 
	//   Guest g1 = new Guest();	
	public Guest() {
		super();	// Don't need to call super() explicitly.
		emailAddress="";
	}
	
	// Overloaded initialization constructor
	// Called when a Guest object is created like this ==>
	//    Name name=new Name("Mr", "Joe", "Bloggs");
	//    Guest g2 = new Guest(name, "087 1234567", "joe@gmail.com");
	public Guest(Name name, String phoneNumber, String emailAddress) {
		super(name,phoneNumber);
		this.emailAddress=emailAddress;
	}

	// OVERRIDING the Person toString() method!
	// Calling Persons toString() method, and adding emailAddress
	@Override
	public String toString() {
		return super.toString() + "\t" + emailAddress + ".";
	}
	
	// no equals() method because the super class equals() is sufficient
	// We can compare two Guest objects using their name and phoneNumber only
	// if(g1.equals(g2))
	//    given that there is no equals method in Guest it will call Persons equals
	//    and compare g1's name and phoneNumber with g2's name and phoneNumber
	
	// set() and get() methods
	public String getEmailAddress(){
	   return emailAddress;
	}	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress=emailAddress;
	}
}
