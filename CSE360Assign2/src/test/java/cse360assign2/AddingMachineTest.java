/* Tate Douglas
 * ID #: 1213755658
 * CSE 360
 * Assignment 2
 * 
 * This file contains the test class for the Adding Machine class.
 */

package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * This class contains the JUnit tests which determine whether or not 
 * the Adding Machine methods are properly functioning.
 * @author Tate Douglas
 * @version 1.0
 */
class AddingMachineTest {

	/**
	 * Determines if toString() properly functions when adding.
	 */
	@Test
	void addStringTest() {
		AddingMachine test = new AddingMachine();
		test.add(6);
		test.add(8);
		String ahistory = test.toString();
		String bhistory = "0 + 6 + 8";
		
		assertEquals(ahistory, bhistory);
	}

	/**
	 * Determines if toString() properly functions when subtracting.
	 */
	@Test
	void subStringTest() {
		AddingMachine test = new AddingMachine();
		test.subtract(6);
		test.subtract(8);
		String ahistory = test.toString();
		String bhistory = "0 - 6 - 8";
		
		assertEquals(ahistory, bhistory);
	}
	
	/**
	 * Determines if toString() properly functions when subtracting and
	 * adding.
	 */
	@Test
	void stringTest() {
		AddingMachine test = new AddingMachine();
		test.subtract(6);
		test.subtract(8);
		test.add(1000);
		test.subtract(84);
		test.subtract(900);
		String ahistory = test.toString();
		String bhistory = "0 - 6 - 8 + 1000 - 84 - 900";
		
		assertEquals(ahistory, bhistory);
	}
	
	/**
	 * Determines if getTotal() properly functions.
	 */
	@Test
	void getTotalTest() {
		AddingMachine test = new AddingMachine();
		test.subtract(6);
		test.subtract(8);
		test.add(30);
		test.subtract(100);
		int wantedTotal = -84;
		int realTotal = test.getTotal();
		
		assertEquals(wantedTotal, realTotal);
	}
	
	/**
	 * Determines if getTotal() properly functions.
	 */
	@Test
	void getTotalTest2() {
		AddingMachine test = new AddingMachine();
		test.add(1000);
		test.subtract(1);
		test.add(2000);
		test.subtract(2);
		test.add(3);
		int wantedTotal = 3000;
		int realTotal = test.getTotal();
		
		assertEquals(wantedTotal, realTotal);
	}
	
	/**
	 * Determines if clear() resets total to 0.
	 */
	@Test
	void clearTotalTest1() {
		AddingMachine test = new AddingMachine();
		test.add(1000);
		test.subtract(1);
		test.add(2000);
		test.subtract(2);
		test.add(3);
		test.clear();
		int wantedTotal = 0;
		int realTotal = test.getTotal();
		
		assertEquals(wantedTotal, realTotal);
	}
	
	/**
	 * Determines if the total is added to and subtracted 
	 * from properly after clear() resets the total to 0.
	 */
	@Test
	void clearTotalTest2() {
		AddingMachine test = new AddingMachine();
		test.add(1000);
		test.subtract(1);
		test.add(2000);
		test.subtract(2);
		test.add(3);
		test.clear();
		test.add(900);
		test.subtract(50);
		test.add(3);
		int wantedTotal = 853;
		int realTotal = test.getTotal();
		
		assertEquals(wantedTotal, realTotal);
	}
	
	/**
	 * Determines if the history is properly cleared
	 * when clear() is called.
	 */
	@Test
	void clearStringTest1() {
		AddingMachine test = new AddingMachine();
		test.add(1000);
		test.subtract(1);
		test.add(2000);
		test.subtract(2);
		test.add(3);
		test.clear();
		
		String ahistory = test.toString();
		String bhistory = "0";
		
		assertEquals(ahistory, bhistory);
	}
	
	/**
	 * Determines if the history is updated properly
	 * after clear() resets the string.
	 */
	@Test
	void clearStringTest2() {
		AddingMachine test = new AddingMachine();
		test.add(1000);
		test.subtract(1);
		test.add(2000);
		test.subtract(2);
		test.add(3);
		test.clear();
		test.add(900);
		test.subtract(600);
		test.add(1);
		
		String ahistory = test.toString();
		String bhistory = "0 + 900 - 600 + 1";
		
		assertEquals(ahistory, bhistory);
	}
	
	/**
	 * Determines if the history is updated properly
	 * after clear() resets the string.
	 */
	@Test
	void clearStringTest3() {
		AddingMachine test = new AddingMachine();
		test.add(1000);
		test.subtract(1);
		test.add(2000);
		test.subtract(2);
		test.add(3);
		test.clear();
		test.add(900);
		test.subtract(600);
		test.add(1);
		test.clear();
		test.add(1000);
		test.subtract(50);
		test.subtract(4);
		test.add(1000);
		
		String ahistory = test.toString();
		String bhistory = "0 + 1000 - 50 - 4 + 1000";
		
		assertEquals(ahistory, bhistory);
	}
}
