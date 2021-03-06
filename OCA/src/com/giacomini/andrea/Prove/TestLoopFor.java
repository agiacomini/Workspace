package com.giacomini.andrea.Prove;

import java.util.ArrayList;
import java.util.List;

public class TestLoopFor {

	int i = 0;
	int[] arrayInt = {1,2,3};
	Integer[] arrayInteger = {111,222,333};

	public void testLoopFor(){
		
		for( ; i < arrayInt.length ; ){
			
			System.out.println(arrayInt[i]);
			i++;
		}
	}
	
	public void testLoopForEachWithArray(){
		
//		for (int item : arrayInt) {
//			System.out.println(item);
//		}
		
		for (Integer item : arrayInteger) {
			System.out.println(item);
		}
	}
	
	public void testLoopForEachWithList(){
		
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(11);
		listInteger.add(22);
		listInteger.add(33);
		
		for (int item : listInteger) {
			System.out.println(item);
		}
	}
	
	public static void main(String[] args){
		
		TestLoopFor test = new TestLoopFor();
//		test.testLoopFor();
		test.testLoopForEachWithArray();
//		test.testLoopForEachWithList();
	}
	
}
