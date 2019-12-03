package com.yash;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MockStaticMethodExample.class)
public class MockStaticMethodTest {
	
	@Test
	public void testStaticMockMethod (){
		PowerMockito.mockStatic(MockStaticMethodExample.class);
		
		when(MockStaticMethodExample.print("Hello")).thenReturn(true);
		when(MockStaticMethodExample.print("Wrong Message")).thenReturn(false);
		
		assertTrue(MockStaticMethodExample.print("Hello"));
		assertFalse(MockStaticMethodExample.print("Wrong Message"));
		
//		PowerMockito.verifyStatic(MockStaticMethodExample.class);
//		MockStaticMethodExample.print("Hello");
//		PowerMockito.verifyStatic(MockStaticMethodExample.class, times(2));
//		MockStaticMethodExample.print(anyString());
		
	}

}
