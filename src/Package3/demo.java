package Package3;

public class demo extends Example {

	public static void main(String[] args) {
		
		//Example e1= new Example();
		
		demo d1= new demo();
		d1.add();
		d1.sub();
				
	}

	@Override
	public void sub() {
		System.out.println("child sub");
		
	}

}
