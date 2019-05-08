package Testngexample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTc {
  
	@Test(priority = 1)
	  public void Login() {
		  
		  System.out.println("Login Done");
		  Assert.assertEquals("A", "A");
	  }
	  
	
	  @Test(dependsOnMethods=("Login"))
	  public void Compose() {
		  
		  System.out.println("Compose Done");
		  Assert.assertEquals("B", "b");
	  }
	  
	  @Test(dependsOnMethods= {"Login", "Compose"},alwaysRun = true)
	  public void Logout() {
		  
		  System.out.println("Logout Done");
		  Assert.assertEquals("C", "C");
	  }
}
