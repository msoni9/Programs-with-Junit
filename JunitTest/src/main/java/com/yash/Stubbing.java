package com.yash;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;


public class Stubbing {
	@Test(expected = RuntimeException.class)
	public void m1test(){

		ArrayList mockedList = mock(ArrayList.class);
		//Stubbing
		when(mockedList.get(0)).thenReturn("first");
		when(mockedList.get(1)).thenThrow(new RuntimeException());
		
		System.out.println(mockedList.get(0));
		System.out.println(mockedList.get(1));
	}

	
}

