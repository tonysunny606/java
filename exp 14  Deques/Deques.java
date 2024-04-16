import java.util.*;

class Deques{
	public static void main(String[] args)
	{
	Deque<String>deque=new ArrayDeque<String>();
	
	deque.add("a");
	deque.add("b");
	deque.add("c");
	deque.add("d");
	deque.add("e");
	
	System.out.print("The Queue insert the value :");
	for(String str:deque)
	{
		System.out.println(str+" ");
	}
        
        deque.addFirst("z");
	System.out.println("The Queue after inserting at first :");
        
        for(String str:deque)
        {
        	System.out.println(str+" ");
        }
                deque.remove();
         System.out.println("The Queue after inserting at first :");
        
        for(String str:deque)
        {
        	System.out.println(str+" ");
        }
        deque.addLast("x");
        System.out.println("The Queue after inserting Last :");
        
        for(String str:deque)
        {
        	System.out.println(str+" ");
        }
        	
    
        deque.clear();
	deque.add("k");
	System.out.println("The after clear and inserting a new element :");
	for(String str:deque){
	System.out.println(str+" ");
	}
	}
	}
