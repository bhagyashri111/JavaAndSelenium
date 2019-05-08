package Testngexample;

import org.testng.annotations.Test;

public class GroupsTC {
	
  @Test(groups= {"Fun"})
  public void A() {
	  
	  System.out.println("A done....");
  }
  
  @Test(groups= {"smoke"})
  public void B() {
	  
	  System.out.println("B done....");
  }
  
  @Test(groups= {"Reg","Fun"})
  public void C() {
	  System.out.println("C done....");
  }
  
  @Test(groups= {"smoke","Fun"})
  public void D() {
	  System.out.println("D done....");
  }
  
  @Test(groups= {"smoke"})
  public void E() {
	  System.out.println("E done....");
  }
  
}
