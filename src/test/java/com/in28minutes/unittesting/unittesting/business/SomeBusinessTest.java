package com.in28minutes.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;

public class SomeBusinessTest {
	
	
	SomeDataService someDataService;
	

	int data[] = {2,3,1,5};

	SomeBusinessImpl someBusinessImpl;
	
	@Test
	public void testCalculateSum() {
		
		int result = someBusinessImpl.calculateSum(data);
		
		assertEquals(11, result);
	}
	
	@Test
	public void testCalculateSum_emptyArray() {
		int data[] = {};
		int result = someBusinessImpl.calculateSum(data);
		
		assertEquals(0, result);
	}
	
	
}


















