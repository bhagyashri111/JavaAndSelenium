package Testngexample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class moretC {
	
  @Test
  public void Login() {
	  
	  System.out.println("Login Done");
	  Assert.assertEquals("A", "A");
  }
  
  @Test
  public void Compose() {
	  
	  System.out.println("Compose Done");
	  Assert.assertEquals("B", "B");
  }
  
  @Test
  public void Logout() {
	  
	  System.out.println("Logout Done");
	  Assert.assertEquals("C", "C");
  }
  
  
  
}
