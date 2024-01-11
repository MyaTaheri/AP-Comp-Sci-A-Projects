package Assignment4;
import java.util.Scanner;


public class Assignment_3 
{

	public static void main(String[] args) 
	{
		/*
		 * Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour)
		 * the National Weather Service defines the wind chill to be:
		 *  w = 35.74 + 0.6215 t + (0.4275 t - 35.75) v0.16 .
		 *  Create a program that takes in two double command-line arguments t and v and
		 *  prints the wind chill. 
		 */
		
		Scanner input = new Scanner(System.in);


		System.out.println("Wind Chill Calculator");
		System.out.println("______________________");
		
		System.out.println ("Enter in temperature:");
		double temp = input.nextDouble();

		System.out.println("Enter in wind speed");
		double windSpeed = input.nextDouble();
		
		double windChill = 35.74 + (0.6215 * temp) + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
		System.out.println(temp + " degrees with " + windSpeed + " mph feels like " + windChill);
		
	}

}
