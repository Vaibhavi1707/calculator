package calculator;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

	private static Logger logger;
	
	public Calculator() {
		logger = LogManager.getLogger(Calculator.class);
	}
	
	public double findSquareRoot(double x) {
		return Math.sqrt(x);
	}
	

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		System.out.println("Logger" + logger);
		System.out.println("Welcome! Please entire your choice for scientiic calculator");
		System.out.println("1. Find square root");
		System.out.println("2. Find factorial");
		System.out.println("3. Find natural log");
		System.out.println("4. Find power");
		System.out.println("Press 0 to exit");
		
		int ch = sc.nextInt();
		while (ch != 0)
		{
			switch(ch)
			{	
				case 1: 
				{
					System.out.println("Enter number whose square root has to be found");
					double x = sc.nextDouble();
					logger.info("[INFO] Finding square root of - " + x);
					System.out.println("The square root of the number is " + Double.toString(calc.findSquareRoot(x)));
				}
				break;
			}
			
			System.out.println("Press 0 if you want to exit");
			ch = sc.nextInt();
		}
		
		logger.info("[INFO] Exiting");
		System.out.println("Thank you");
		sc.close();
	}
}
