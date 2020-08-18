package test;

import org.testng.annotations.Test;

import testng.calculator;

public class testng {

	@Test
	public void res()
	{
	calculator cal = new calculator();
	int sum = cal.calc(10,20);
	System.out.println(sum);
	
	}
}
