/* Tate Douglas
 * ID #: 1213755658
 * CSE 360
 * Assignment 2
 * 
 * This file contains the Adding Machine class.
 */

package cse360assign2;

/**
 * This class allows a user to create an AddingMachine object, where
 * a number can be added to or subtracted from a total, the total can
 * be returned, the history of calculations can be given and the history
 * can be cleared, with the total reset to 0.
 * 
 * @author Tate Douglas
 * @version 0.1
 * @see #AddingMachine()
 * @see #getTotal()
 * @see #add(int)
 * @see #subtract(int)
 * @see #clear()
 */
public class AddingMachine {

	private int total;
	
	/**
	 * Class constructor, creates an Adding Machine object that
	 * contains an integer value equal to 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the calculated total number.
	 * @return the integer value 0
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Adds number to the total value. (Currently unfinished)
	 * @param value number to be added to the total value.
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Subtracts number from the total value. (Currently unfinished)
	 * @param value number to be subtracted from the total value.
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Shows history of calculations on the total value.
	 * @return string that contains the history of calculations (empty)
	 */
	public String toString () {
		return "";
	}
	
	/**
	 * Clears the history of calculations, and resets total value to 0.
	 * (Currently unfinished)
	 */
	public void clear() {
	
	}
}
