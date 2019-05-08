package Testngexample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class validation {
	
  @Test
  public void Display() {
	  
	  String s1 = "Hello";
	  String s2 = "hello";
	  
	  //Assert.assertEquals(s1, s2);
	  
	  //Assert.assertTrue(12<10, "Please check the values");
	  //Assert.assertTrue(s1 == s2, "Please check the values");
	  Assert.fail("please check");
	  
	  
  }
}
