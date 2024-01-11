import java.util.Scanner;
public class CurrencyConverter 
{
	private String currency;
	private double number;
	private String convert;
	
	//constants
	double EuroToUSD = 0.85;
	double YenToUSD = 109.93;
	double CanadaToUSD = 1.28;
	
	public static void main (String[] args)
	{
		CurrencyConverter ca = new CurrencyConverter();

		System.out.println("Made 5 Septemeber 2021");
		System.out.println("----------------------");
		
	
		ca.ask();
		ca.converting();
		
	}
	
	public void converting()
	{
		CurrencyConverter ma = new CurrencyConverter();
		double number = this.number;
		
		if (this.currency.equals("EURO"))
		{
			number = number / this.EuroToUSD;
		}
		else if (this.currency.equals("YEN"))
		{
			number = number / this.YenToUSD;
		}
		else if (this.currency.equals("CANADA"))
		{
			number = number / this.CanadaToUSD;
		}
		else if (this.currency.equals("USD"))
		{
			
		}
		else
		{
			System.out.println("");
			System.out.println("Sorry, you mistyped a currency.  Please try again");
			System.out.println("");
			ma.ask();
		}
		

		
		if (this.convert.equals("EURO"))
		{
			number = number * this.EuroToUSD;
		}
		else if (this.convert.equals("YEN"))
		{
			number = number * this.YenToUSD;
		}
		else if (this.convert.equals("CANADA"))
		{
			number = number * this.CanadaToUSD;
		}
		else
		{
			
		}
		System.out.println(this.number + " " + currency + " is " + number + " " + convert);
	}
	
	public void ask ()
	{
		Scanner input = new Scanner (System.in);

		System.out.println ("Instructions: ALL CAPS for any string answer");
		System.out.println("Choose Currency (Euro, Yen, Canada, USD): ");
		this.currency = input.next();
		System.out.println("Number of previous Currency: ");
		this.number = input.nextDouble();
		System.out.println("Choose Currency to Convert Into (Euro, Yen, Canada, USD): ");
		this.convert = input.next();

	}

}
