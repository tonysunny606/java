import java.util.*;
class StringMainp{
	public static void main(String[] args)
	{
	 char ch[]={'w','e','l','c','o','m','e'};
	 String newstr=new String(ch);
	 System.out.println("The new string operater is  :"+newstr);
	 byte ascii[]={65,66,67,68,69};
	 String newstr2=new String(ascii);
	 System.out.println("The byte  asciis :"+newstr);
	 String s1="GOOD";
	 String s2="MORNING";
	 System.out.println("LENGTH OF STRING S1 IS :"+s1.length());
	 System.out.println("LENGTH OF STRING S2 IS :"+s2.length());
           // LOWER CASE 
	 System.out.println("TO LOWER  CASE OF S1 IS:"+s1.toLowerCase());
	 System.out.println("TO LOWER CASE OF  S2 IS:"+s2.toLowerCase());
	 // UPPER CASE
	 System.out.println("TO UPPER CASE OF S1 IS:"+s1.toUpperCase());
	 System.out.println("TO UPPER CASE OF S2 IS:"+s2.toUpperCase());
	 
	 // concatination
	  System.out.println("\n-------------CONCATINATION----------\n");
	  System.out.println("CONCATENATION OF S1 AND S2 IS:"+s1.concat(s2));
	  System.out.println("USING '+' OPERATER :"+s1+s2);
	  //CHARACTER EXTRATION
	  System.out.println("\n-------------CHARACTER EXTRATION----------\n");
	  System.out.println("CHARACTER AT THE STRING 3 OF S1 :"+s1.charAt(3));
	  System.out.println("CHARACTER AT THE STRING 5 OF S2 :"+s2.charAt(5));
	   
	   //CHARACTER COMAPRISON
	   	  System.out.println("\n-------------CHARACTER COMPARISON----------\n");  
	   	  String x="welcome";
	   	  String y="WELCOME";
	   	  System.out.println("String 1 is:"+x);
	   	  System.out.println("String 2 is:"+y);   	 	 
	   	  System.out.println("Equal to" +y+ ":"+x.equals(y));
	   	  System.out.println("Equal to ignorecase" +y+ ":" +x.equalsIgnoreCase(y));
	   	  System.out.println("Compare to" +y+ ":" +x.compareTo(y));
	   	  System.out.println("Start with w:" +x.startsWith("w"));
                	   	  
	   	  //SUBSTRING
	   	 System.out.println("\n-------------SEARCH SUBSTRINGS----------\n");
	   	 String z="somone told me ,you have attractive eye";
	   	 System.out.println("String :"+z);
	   	 System.out.println("index of 'attractive' word:"+z.indexOf("attractive"));
	   	 System.out.println("substring :"+z.substring(16));
	   	 //STRING MODIFICTION
	   	System.out.println("\n-------------STRING MODIFICATION----------\n");
	   	System.out.println("Replace eye to 'smile':"+z.replace("eye","smile"));
	   	
	   	
	   	System.out.println("\n-------------using values----------\n");
	   	 float n=35.87f;
	   	 System.out.println("coverted to string "+String.valueOf(n));
	   	  }
	 }
	 
	 
	 
