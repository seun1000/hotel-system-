/**
 * Class: B.Sc. in Computing
 * Description: Payable Interface
 * Date: 12/10/2020
 * @author seun opebiyi
 * @version 1.0
**/
package ie.lyit.hotel;

public interface Payable {
    public final double MAX_SALARY = 150000.00;	
	
    public abstract double calculatePay(double taxPercentage);
	// Don't have to put in public abstract
	double incrementSalary(double incrementAmount);
}

// A Java interface can contain only abstract 
// methods, i.e. methods without a body and constants.