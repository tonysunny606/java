import java.util.*;
class InvalidUserExcept extends Exception{                     //exception parent fectach on inavliduserexcept
public InvalidUserExcept(String msg){
super(msg);                                                    //parents invoking
}
}

class Authentication{
	
	 	public static void main(String[] args){
	 	
	 	       Scanner sc=new Scanner(System.in);
	 	       System.out.println("Enter the user name:");
	 	       String user=sc.next();
	 	       System.out.println("Enter the password:");
	 	       String pass=sc.next();
	 	       try
	 	       {
	 	       if(user.length()<8)
	 	       	throw new InvalidUserExcept("Invalid username,The user name shoud be graeter than 8");
	 	       	else if(!pass.equals("tony@154"))
	 	       	  throw new InvalidUserExcept("Invalid Password,Type the corrent psssword");
	 	       	  else
	 	       	  System.out.println("Login successfull......");
	 	       	  }
	 	       	  catch(InvalidUserExcept e)
	 	       	  {
	 	       	  e.printStackTrace();
	 	       	  }
	 	       	  }
	 	       	  }
	 	       	  
