import java.util.Scanner;
class product{
int pCode,price;
String pName;
product (int pCode,String pName,int price)
{
this.pCode=pCode;
this.pName=pName;
this.price=price;
}}
class products{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter product code:");
int pCode=sc.nextInt();
System.out.print("Enter produt name:");
String pName=sc.next();
System.out.print("Enter product price:");
int price=sc.nextInt();
product[] ps=new product[3];
ps[0]=new product(pCode,pName,price);
ps[1]=new product(134,"Notebook",10);
ps[2]=new product(143,"card Bord",13);
int minprice=ps[0].price;
System.out.println("==================");
System.out.println("code \t product Name\tprice");
System.out.println("-----\t ------------\t-----");
for(product p:ps){
System.out.println(p.pCode+"\t"+p.pName+"\t"+p.price);
if(minprice>p.price){
minprice=p.price;
}}
System.out.println("==================");
System.out.println("******************************");
System.out.println("LOWEST COST PRODUCT");
System.out.println("code\tprodcut\tName\tprice");
 
for(product p:ps){
if(minprice==p.price){
System.out.println(p.pCode+"\t"+p.pName+"\t"+p.price);
}}
}}	
	

