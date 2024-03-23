class Shapes{
	class Area{
	
		
		int area(int a)
		{
			return a*a;
		}
		int area(int l,int b)
		{
			return l*b;
		}
		
		int area(int l,int b,int h)
		{
			return((2*l*b)+(2*l*h)+(2*b*h));
		}}
		public static void main(String[] args)
		{
			int ar;
			Shapes s=new Shapes();
			Shapes.Area a=s.new Area();
			ar=a.area(5);
			System.out.println("Area of square :"+ar);
			ar=a.area(4,3);
			System.out.println("Area of Rectangle :"+ar);
			ar=a.area(4,3,5);
			System.out.println("Area of cuboid :"+ar);
			}
			
			
		}
