import java.util.Scanner;
import java.util.Arrays;
class sort
{
public static void main(String[] args)
	{
		System.out.println("Enter the string Size:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String[] arr=new String[size];
		System.out.println("string is :");
		for(int i=0;i<size;i++){
		
		arr[i]=sc.next();
		}
	System.out.println("1.bult method\n2.user defined method\n");
	System.out.println("Select any option:");
	int opt=sc.nextInt();
	switch(opt)
	{
	case 1:
		Arrays.sort(arr);
		System.out.println("Sort is :"+arr);
		break;
	case 2:
		String temp;
		for(int i=0;i<size-1;i++)
		for(int j=i+1;j<size;j++)
		{
			if(arr[i].compareTo(arr[j])>0)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
				}
	break;			
      default:System.out.println("\n****************************invalid choice***********\n");
      break;
		}         System.out.println("\n");
		          System.out.println("*****************************\n");
      			for(int a=0;a<size;a++)
				{
			System.out.println(arr[a]+"");
			}		}}
