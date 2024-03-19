import java.util.*;
class Arraysearch
{
	public static void main(String[] args)
	{
		System.out.println("Enter the size of an array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int result=-1;
		int arr[]=new int[size];
		System.out.println("Enter the elements array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
	        }
	        System.out.println("Enter the search element:");
		int number=sc.nextInt();
		Arraysearch as=new Arraysearch();
	        System.out.println("1.linerar search\n2.simple Binery search\n3.Recursive search\n4.Binery search");
	        System.out.println("select the option:");
	        int opt=sc.nextInt();
	        switch(opt)
	        {
	        	case 1:
	        		System.out.println("************Linear seach***********");
	     			result=as.Linearsearch(number,arr);
	        		break;
	        	case 2:
	        		System.out.println("****************Simple Binery search******");
	        		result=as.simBinery(number,arr);
	        
	        		break;
	               case 3:
	                       System.out.println("**************Recursive search***************");
	               		Arrays.sort(arr);
	               		result=as.RecursiveBinerySearch(arr,0,size-1,number);
	               		break;
	              case 4:
	               		System.out.println("***************Binery search*************");
	               		Arrays.sort(arr);
	        		int index=Arrays.binarySearch(arr,number);
	        		try{
	        			result=arr[index];
	        		    }
	        		    catch(ArrayIndexOutOfBoundsException e){
	        		    result=-1;
	        		    }
	        		    break;
	        }
	        if(result>0)
	        {
	        	System.out.println("Found........");
	       	}
	        else
	       	{
	      	 	System.out.println("not found");
	       	}
	}
	      
	//linerar search
	int Linearsearch(int n,int arr[])
	{
	        for(int i=0;i<arr.length;i++)
	        {
	        	if(arr[i]==n)
	        	{
				return 1;
			}
		}	
		return -1;
	}				
				
	//simple binery search
	int simBinery(int n,int arr[])
	{
		int first=0,mid,last=arr.length-1;
		mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]<n)
			{
				first=mid+1;
			}
			else if(arr[mid]>n)
			{
				last=mid-1;
			}
			else
			{
			return mid;
			}
			mid=(first+last)/2;
		}
		return -1;
	}

	
				

	//recursive binery search 
	int RecursiveBinerySearch(int [] arr,int first,int last,int n)
	{
		if(first<=last && first<=arr.length-1)
		{
			int mid=first+(last-first)/2;
			if(arr[mid]<n)
				{
					return RecursiveBinerySearch(arr,mid+1,last,n);
				}
				if(arr[mid]>n)
					{
					return RecursiveBinerySearch(arr,first,mid-1,n);
					}
					return mid;
					}
					return -1;
					}
					}
