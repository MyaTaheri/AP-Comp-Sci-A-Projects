package CSC222;

//Mya Taheri CSC 222 10/27/22
//Module 5: Coding Assignment Counter

public class CounterTest 
{
	public static void main (String[] args)
	{
		Counter counter = new Counter();
			
		
		
		//Test printCount();
		System.out.println("Method: printCount()");
		System.out.println("Expected: 0");
		counter.printCount();
								
		System.out.println("------");
		
		//Test getCount();
		System.out.println("Method: getCount()");
		System.out.println("Expected: 0");
		System.out.println(counter.getCount());
						
		System.out.println("------");
		
		//Test decreaseCount();
		System.out.println("Method: decreaseCound()");
		System.out.println("Expected: 0");
		counter.decreaseCount();
		System.out.println(counter.getCount());
				
		System.out.println("------");
		
		//Test increaseCount();
		System.out.println("Method: increaseCount()");
		System.out.println("Expected: 1");
		counter.increaseCount();
		System.out.println(counter.getCount());
				
		System.out.println("------");
		
		//Test decreaseCount();
		System.out.println("Method: decreaseCound()");
		System.out.println("Expected: 0");
		counter.decreaseCount();
		System.out.println(counter.getCount());
						
		System.out.println("------");
		
		counter.increaseCount();
		counter.increaseCount();
		counter.increaseCount();
		//counter should equal 3:
		System.out.println(counter.getCount());
		
		System.out.println("------");
		
		//Test setCounterZero();
		System.out.println("Method: setCounterZero()");
		System.out.println("Expected: 0");
		counter.setCounterZero();
		System.out.println(counter.getCount());
		
		System.out.println("------");
	}
}
