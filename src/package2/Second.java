package package2;

public class Second {
	
		int x = 20;
		int y = 10;
		static int z;

		void add() {
			
			int x = 55;
			
			
			System.out.println("Addition");
			z = x+y;
			System.out.println(z);
			
			
		}
		
		void sub() {
			
			System.out.println("subtraction");
			z=x-y;
			System.out.println(z);
			
			
		}
	public static void main(String[] args) {
		
		Second s1 = new Second(); 
		s1.add();
		s1.sub();
		s1.mul();
		System.out.println(s1.x);
		System.out.println(s1.y);
		System.out.println("The value of z is :" + s1.z); 
		System.out.println(Second.z);
	}
	
	
		void mul() {
			
			System.out.println("Multiplication");
			z =x*y;
			System.out.println(z);
		}

}
