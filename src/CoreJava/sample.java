package CoreJava;

public class sample {

	public static void main(String[] args) {
		
		int a =0;
		int b =20;
		int c;
		
		try {
		c= b/a; 
		System.out.println(c);
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	

		finally {
			System.out.println(" finally done....");
		}
		
		System.out.println("done....");
	}
		
		
		
		

}
