package Testngexample;

import org.testng.annotations.Test;

public class ParallelTC {
 
	@Test
	public void A() {
		 long id =  Thread.currentThread().getId();
		  System.out.println("A done..."+id);
	  }
	  
	  @Test
	  public void B() {
		  long id =  Thread.currentThread().getId();
		  System.out.println("B done..."+id);
	  }
	  
	  @Test
	  public void C() {
		  long id =  Thread.currentThread().getId();
		  System.out.println("C done..."+id);
	  }
	  
	  @Test
	  public void D() {
		  long id =  Thread.currentThread().getId();
		  System.out.println("D done..."+id);
	  }
	  
	  
}
