package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationHierachyExample {
  @Test
  public void test() {
	  System.out.println("I'm test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I'm beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I'm afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I'm beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I'm afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I'm beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I'm afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I'm beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I'm afterSuite");
  }
  
  @Test
  public void test2() {
	  System.out.println("I'm test2");
  }

}
