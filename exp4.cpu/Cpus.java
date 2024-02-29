import java.util.Scanner;
class Cpu{
	int price=50000;
	class processor{
		int cores=9;
		String manufacturer="HP";
		void display(){
		System.out.println("No of cores:"+cores);
		System.out.println("Manufactures:"+manufacturer);
		}}
	void display(){
		System.out.println("price is :"+price);
		processor p=new processor();
		p.display();
		}
	static class Ram{
		int memory=10;
		String manufacturer="10bits";
		void display(){
				System.out.println("Memory is:"+memory);
				System.out.println("manufactures is :"+manufacturer);
			      }
		}
			}
			
class Cpus{
	public static void main(String[] args){
		Cpu c=new Cpu();
		c.display();
		Cpu.Ram r1=new Cpu.Ram();
		r1.display();
		}
		}
							
