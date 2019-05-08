package package1;

public class Methods {
	
	int x = 20;
	int y = 10;
	int z;
	
	 protected void add() {
		
		z= x+y;
		System.out.println("add........" + z);
		
		
		
	}
	 
	 public static void main(String args[]) {
		 
		 Methods o1 = new Methods();
		 o1.add();
	 }

	 
}
