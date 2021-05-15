/**
 * 
 */

package com.revature;
import com.revature.beans.*;

/**
 * @author Ronsard Malonda
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		BankAccount myBank = new BankAccount(5.5);
		
		System.out.println(myBank.toString());
		
		Person jordan = new Person("Jordan","Malonda") ;
		
		System.out.println(jordan.toString());		
		


	}

}
