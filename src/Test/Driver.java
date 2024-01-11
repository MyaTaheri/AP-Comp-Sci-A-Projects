package Test;

public class Driver extends Parent {
	   public void PrintInformation() {
	      System.out.println("In Child Class Principal");
	  }
	   public static void main(String args[]) {
	      Parent tim;
	      tim = new Parent();
	      tim.PrintInfo();
	   }
	}