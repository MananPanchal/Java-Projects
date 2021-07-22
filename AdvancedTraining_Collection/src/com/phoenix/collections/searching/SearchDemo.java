package com.phoenix.collections.searching;

import java.util.Arrays;

public class SearchDemo {

	public static void main(String[] args) {
		
		int arr[] = {50,20,80,40,10,90};
		
		Arrays.sort(arr);
		
		System.out.println("Sorted Array: ");
		Arrays.stream(arr).forEach(System.out::println);
		
		int searchIdx = Arrays.binarySearch(arr, 60);
		System.out.println("Element is found at index index no: " + searchIdx);

	}

}
