package testNG;

import org.testng.annotations.Test;

public class Drive_a_car {
	
	@Test(priority = 0)
	public void startCar() {
		System.out.println("Car started");
	}
	
	@Test(priority = 1)
	public void putFirstGear() {
		System.out.println("1st gear is put");
	}
	
	@Test(priority = 2)
	public void putSecondGearr() {
		System.out.println("2nd gear is put");
	}
	
	@Test(priority = 3)
	public void putThirdGear() {
		System.out.println("3rd gear is put");
	}
	
	@Test(priority = 4)
	public void putFourthGear() {
		System.out.println("4th gear is put");
	}
	

}
