package CoreJava;

public class overload {
	 
	public void add() {
		
		System.out.println("no parameters");
	}
	
	public void add(int p) {
		
		System.out.println("int parameters :"+  p);
		
		
	}
	
public void add(float q, int r) {
		
		System.out.println("two parameters :"+  q);
		
		
	}
	
	
	public static void main(String[] args) {
		
		overload o1= new overload();
		o1.add();
		o1.add(10);
		o1.add(10.0f, 10);
		

	}

}
