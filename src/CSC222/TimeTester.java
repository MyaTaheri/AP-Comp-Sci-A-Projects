package CSC222;

//Mya Taheri CSC 222 11/12/22
//Module 6: Coding Assignment 

public class TimeTester {

	public static void main(String[] args) 
	{
		//-----------------------------
		//Test Constructors
		//-----------------------------

		Time t1 = new Time();
		System.out.println("Method: time()");
		System.out.println("Expected: 0000 /n 00:00 am");	
		t1.getTime24();
		t1.getTime12();
					
		System.out.println("------");
		
		Time t2 = new Time(22, 45); //22:54  or 10:54 pm
		t2.getTime12();
		System.out.println("Method: time(int hour, int minute)");
		System.out.println("Expected: 2254 /n 10:45 pm");	
		t2.getTime24();
		t2.getTime12();
					
		System.out.println("------");
		
		Time t3 = new Time(11, 12, false); //23:12pm or 11:12 pm
		System.out.println("Method: time(int hour, int minute, isAm)");
		System.out.println("Expected: 2312 /n 11:12 pm");	
		t3.getTime24();
		t3.getTime12();
		
		System.out.println("------");

		
		Time t4 = new Time(29, 99); //invalid
		Time t5 = new Time(98, 102, true); //invalid
		Time t6 = new Time(98, 102, false); //invalid

		//-----------------------------
		//Test Methods
		//-----------------------------

		//Test getTime24()
		System.out.println("Method: getTime24()");
		System.out.println("Expected: 2312");	
		t3.getTime24();
										
		System.out.println("------");
		
		//Test getTime12()
		System.out.println("Method: getTime12()");
		System.out.println("Expected: 11:12pm");	
		t3.getTime12();
		
		System.out.println("------");
		

		//Test isValid()
		System.out.println("Method: isValid()");
		System.out.println("Expected: false");	
		System.out.println(t1.isValid(98, 102));
										
		System.out.println("------");
		
		
		//Test isValid()
		System.out.println("Method: isValid()");
		System.out.println("Expected: true");	
		System.out.println(t1.isValid(18, 12));
		
		System.out.println("------");
		
		//Test setTime(hour, minute) -> valid time
		System.out.println("Method: setTime(hour, minute)");
		System.out.println("Expected: 1827 /n  6:27 pm");	
		t4.setTime(18, 27);
		t4.getTime24();
		t4.getTime12();
												
		System.out.println("------");
		
		//Test setTime(hour, minute) -> invalid time
		System.out.println("Method: setTime(hour, minute)");
		System.out.println("Expected: old time:  1827 /n  6:27 pm");	
		t4.setTime(198, 270);
		t4.getTime24();
		t4.getTime12();
														
		System.out.println("------");
		
		//Test setTime(hour, minute, isAm) -> valid time && AM
		System.out.println("Method: setTime(hour, minute, isAm)");
		System.out.println("Expected: 1147 /n 11:47 am");	
		t4.setTime(11, 47, true);
		t4.getTime24();
		t4.getTime12();
														
		System.out.println("------");
		
		//Test setTime(hour, minute, isAm) -> valid time && PM
		System.out.println("Method: setTime(hour, minute, isAm)");
		System.out.println("Expected: 2347 /n 11:47 pm");	
		t4.setTime(11, 47, false);
		t4.getTime24();
		t4.getTime12();
		
		System.out.println("------");
				
		//Test setTime(hour, minute, isAm) -> invalid time
		System.out.println("Method: setTime(hour, minute, isAm)");
		System.out.println("Expected: 1200 /n 00:00 pm ");	
		t5.setTime(222, 111, false);
		t5.getTime24();
		t5.getTime12();
		
		System.out.println("------");
						
				
	}

}
