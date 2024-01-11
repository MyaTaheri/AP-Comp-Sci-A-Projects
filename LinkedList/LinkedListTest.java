
public class LinkedListTest 
{
	public static void main(String[] args)
	{
		Node list1 = new Node();
		list1.value = 5;
		
		Node first = new Node();
		first.value = 8;
		
		list1.next = first;
		
		
		Node list2 = new Node();
		list2.value = 12;
		
		list1.next.next = list2;
		
		
		
	}
}
