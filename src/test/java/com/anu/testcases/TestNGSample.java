package com.anu.testcases;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSample {

/*	@BeforeSuite
	public static void BeforeFirstTestScenario()
	{
		System.out.print("Before FIRST TEST Suite\t");
	}

	@BeforeTest
	public static void BeforeFirstTest()
	{
		System.out.println("Before FIRST TEST\t");
	}

	
*/
/*	@BeforeMethod
	public void beforeMethod(Method m)
	{
		System.out.print("Before every method\t"+m.getName());
	}
*/
	@Test(priority=1, groups="P1")
	public void firstTestCase()
	{
		System.out.println("   Scenario 1: First test case\t");
		Assert.assertEquals("ABC", "ABC");
	}

	@Test(priority=2, dependsOnMethods="firstTestCase", groups="P1")
	public void secondTestCase()
	{
		System.out.println(" Scenario 1: Second test case\t");
//		Assert.assertEquals("ABC", "ABC1");
		//Assert.assertTrue(isElementPresent(driver.findELement(By.id(id))));
//		Assert.fail("asd");
	}

	@Test(priority=3,dependsOnMethods= {"firstTestCase","secondTestCase"}, groups="P1")
	public void thirdTestCase()
	{
		System.out.println(" Scenario 1: Third test case\t");
//		throw new SkipException("skipping test case");
	}

	@Test(priority=4, groups="P1")
	public void fourthTestCase()
	{
		System.out.println(" Scenario 1: Fourth test case\t");
		Assert.assertEquals("ABC", "ABC");
	}

	@Test(priority=5, groups="P2")
	public void fifthTestCase()
	{
		System.out.println(" Scenario 1: Fifth test case\t");
		Assert.assertEquals("ABC", "ABC");
	}

	@Test(priority=6, groups="P2")
	public void sixTestCase()
	{
		System.out.println(" Scenario 1: Sixth test case\t");
		Assert.assertEquals("ABC", "ABC");
	}

	@Test(priority=7, groups="P2")
	public void sevenTestCase()
	{
		System.out.println(" Scenario 1: Seventh test case\t");
		Assert.assertEquals("ABC", "ABC");
	}

	@Test(priority=8, groups="P3")
	public void eigthTestCase()
	{
		System.out.println(" Scenario 1: Eigth test case\t");
		Assert.assertEquals("ABC", "ABC");
	}

	@Test(priority=9, groups="P3")
	public void nineTestCase()
	{
		System.out.println(" Scenario 1: Ninth test case\t");
		Assert.assertEquals("ABC", "ABC");
	}
	@Test(priority=10, groups="P3")
	public void tenTestCase()
	{
		System.out.println(" Scenario 1: Tenth test case\t");
		Assert.assertEquals("ABC", "ABC");
	}



/*	@AfterMethod
	public void afterTestCase()
	{
		System.out.print("After every test case\n");
	}

	@AfterTest
	public static void afterFirstTestScenario()
	{
		System.out.print("\n After FIRST TEST SUITE\t");
	}


	@AfterSuite
	public static void afterFirstTestSuite()
	{
		System.out.println(" After FIRST TEST SUITE");
	}

*/
}
