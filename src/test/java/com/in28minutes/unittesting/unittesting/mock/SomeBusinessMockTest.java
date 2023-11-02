package com.in28minutes.unittesting.unittesting.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import com.in28minutes.unittesting.unittesting.business.SomeBusinessImpl;
import com.in28minutes.unittesting.unittesting.data.SomeDataService;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockTest {

//	@Mock
//	SomeDataService dataServiceMock;
//	
//	@InjectMocks
//	SomeBusinessImpl business;
//	
//	@Test
//	public void calculateSumUsingDataService_basic() {
//				
//		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
//		
//		assertEquals(6, business.calculateSumUsingDataService());
//	}
	
	@InjectMocks
	SomeBusinessImpl business;
	
	@Mock
	SomeDataService dataServiceMock;
	
	
	@Test
	public void testCalculateumUsingDataService_basic() {		
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
		
		assertEquals(6, business.calculateSumUsingDataService());
	}
}



























