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
 * @version 1.0
 * @see #AddingMachine()
 * @see #getTotal()
 * @see #add(int)
 * @see #subtract(int)
 * @see #clear()
 */
public class AddingMachine {

	private int total;
	private String history = "0";
	
	/**
	 * Class constructor, creates an Adding Machine object that
	 * contains an integer value equal to 0.
	 */
	public AddingMachine () {
		total = 0;  //not needed - included for clarity
	}
	
	/**
	 * Returns the calculated total number.
	 * @return the calculated total number.
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds input to the total value, and updates history
	 * @param value number to be added to the total value.
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts input from the total value, and updates history.
	 * @param value number to be subtracted from the total value.
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * Shows history of calculations on the total value.
	 * @return history string that records performed calculations
	 * @see #add(int)
	 * @see #subtract(int)
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * Clears the history of calculations, and resets total value to 0.
	 */
	public void clear() {
		history = "0";
		total = 0;
	}
}
