package com.lti.junitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {
@Test
public void testCompanyName()
{
	Product p=new Product(101,"charger",10000.00,"Dmart");
	Assertions.assertEquals("Dmart", p.getCompanyName());
}

}
