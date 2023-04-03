package com.staragile;
import junit.framework.Assert;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class CalculatorTest {
	@Test
	public void testSum() {
		Calculator cal = new Calculator();
		Assert.assertEquals(4, cal.sum(2,2));
	}
}