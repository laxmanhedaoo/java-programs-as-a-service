/**
* <h1>Factorial!</h1>
* The Factorial program calculate the factorial of a given integer number.
* <p>
* The objective of this class is to provide factorial service.
* 
* This class having following services
* 1) Get factorial of one integer number
* 2) Get factorial of more than one integer numbers
* 3) get factorial of one integer number along with keyboard input
* </p>
* 
* <p> We are trying to expose this clas as a Service for calculating factorial of integer number(s).</p>
* 
* @author  Laxman Hedaoo
* @version 1.0
* @since   2015-11-25 
*/
 package com.java.service.factorial;

import com.java.service.IService;
  
public class FactorialService implements IService{

	/**
	 * Gets the factorial.
	 *
	 * @param number - integer number
	 * @return the factorial
	 */
	public static long getFactorial(int number) {
		long fact = number;
		for (int i = (number - 1); i > 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	/**
	 * Gets the factorial.
	 *
	 * @param numbers the numbers
	 * @return the factorial
	 * @throws Exception the exception
	 */
	public static long[] getFactorial(int[] numbers) throws Exception {
		int size = numbers.length;
		if (size > 0) {
			long[] factorials = new long[size];
			for (int index = 0; index < size; index++) {
				factorials[index] = getFactorial(numbers[index]);
			}
			return factorials;
		}
		throw new Exception("No Input is provided.");
	}
}
