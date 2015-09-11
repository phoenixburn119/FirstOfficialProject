package input.controller;

import java.util.Scanner;

public class InputController
{
	//Declaration section
	//All class data members are declared private
	
	private Scanner myInput;
	
	//Constructors go here
	
	public InputController()
	{
		myInput = new Scanner(System.in);
	}
	
	public void start()
	{
		questions();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
	}
	
	private void questions()
	{
		System.out.println("Hey, what is your name");
		String input;
		input = myInput.next();
		myInput.nextLine();
		System.out.println("Your name is " + input + ", that's cool cool");
		System.out.println("oops did I miss your full name? Please type it again.");
		String fullName = myInput.nextLine();
		System.out.println("Your full name is " + fullName);
		System.out.println("Your age if you do not mind my good sir?");
		int myAge = myInput.nextInt();
		System.out.println("Wow " + input + " you are " + myAge + " years old!");
	}
	
}