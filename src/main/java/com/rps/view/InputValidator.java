package com.rps.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * This class is a utility class. It accepts a number of inputs from the user in
 * different formats such as date, string, number, fraction, etc. and validates
 * the input. If the user fails to enter the correct value, the user is prompted
 * again and again until the user enters the value in the correct format.
 * 
 * @author Kinshuk Kale
 * 
 */
public class InputValidator {

	/**
	 * buffer to hold input from the console.
	 */
	private BufferedReader reader;

	/**
	 * Constructor to initialize the validator with a input stream.
	 * 
	 * @param in
	 *            input stream to be used by the validator to accept input
	 */
	public InputValidator(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
	}

	/**
	 * read and validate integer input by the user.
	 * 
	 * @return integer entered by the user
	 */
	public int readInt() {
		boolean isValid = false;
		int returnInt = 0;
		// keep prompting the user to enter a valid integer until a valid
		// integer is entered
		while (!isValid) {
			try {
				String strInt = reader.readLine();
				returnInt = Integer.parseInt(strInt);
				isValid = true;
			} catch (Exception e) {
				System.out.print("Please enter a valid number: ");
			}
		}
		return returnInt;
	}

	/**
	 * read a string input from the console.
	 * 
	 * @return valid string entered by the user
	 */
	public String readString() {
		boolean isValid = false;
		String strInput = "";
		while (!isValid) {
			try {
				strInput = reader.readLine();
			} catch (IOException e) {
				System.out.println("Error. Could not read the input.");
			}

			if (strInput == null || strInput.trim().equals("")) {
				System.out.print("Please enter a valid value: ");
				continue;
			}
			isValid = true;
		}
		return strInput;
	}

}
