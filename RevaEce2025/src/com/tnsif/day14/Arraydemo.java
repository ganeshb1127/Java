package com.tnsif.day14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arraydemo {

	public static void main(String[] args) {
	int arr[] = {10,11,2,3,22,11,0};
	System.out.println("elements are"+Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println("sorted elements are"+Arrays.toString(arr));
	int key = 11;
	System.out.println("sorted elements are : "+Arrays.binarySearch(arr,1,7, key));

}
	}
