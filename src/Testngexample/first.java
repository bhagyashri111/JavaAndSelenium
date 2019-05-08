package Testngexample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class first {
	
  @Test
  
  public void Display() {
	  
	  String s1 = "Hello";
	  String s2 = "hello";
	  
	  Assert.assertEquals(s1, s2);
	  
  }
}
