package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class BeforeAfterTest {

	Calculator c =new Calculator();
	int sum;
	
@BeforeAll
public static void testDbConn() {
	System.out.println("db coonn up");
}	
	
	
	
	
	@BeforeEach
	public void testStartUp() {
		sum=0;
		System.out.println("sum = 0");
	}
	@Test
public void	testAdd()
{
		int r =c.add(100,200);
	Assertions.assertEquals(300,r, "checked add method");
		
}
	@AfterEach
	public void testShutDown() {
		sum=0;
		System.out.println("shut down sum = 0");
	}
}
