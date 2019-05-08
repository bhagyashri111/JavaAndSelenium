package Testngexample;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dataProvider {
	
	
  @Test(dataProvider = "data")
  public void Login(Integer n, String s) {
	  
	  System.out.println(n+" +s");
  }

  @DataProvider(name="data")
  public Object[][] Display() {
	  
    return new Object[][] {
    	
      { 1, "a" },
      { 2, "b" },
      { 3, "c" },
    };
  }
}
