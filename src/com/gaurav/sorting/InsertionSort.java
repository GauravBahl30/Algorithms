package com.gaurav.sorting;

public class InsertionSort {

	
	public static void main(String[] args) {
		
		int[] inp = {4,3,2,1,9};
		int[] sortArray = insertionSort(inp);
		for(int k=0;k<sortArray.length;k++) {
			System.out.print(inp[k]+ " ");
		}
		
	}
	
	
	public static int[] insertionSort(int[] input) {
		
		for(int i=1;i<input.length;i++) {
			for(int j=i;j>0;j--) {
				int a = input[j];
				int b = input[j-1];
				if(a<b) {
					int temp = a;
					a = b;
					b = temp;
					input[j] = a;
					input[j-1] = b;
				}
			}
		}
		
		return input;
	}
	
}
 