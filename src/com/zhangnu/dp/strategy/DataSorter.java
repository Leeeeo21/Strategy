package com.zhangnu.dp.strategy;

public class DataSorter {
	public static void sort(int[] a) {
		for (int i = a.length; i > 0; i--) {
			for(int j = 0 ;j<i-1;j++){
				if (a[j]>a[j+1]) {
					swap(a,j,j+1);
				}
			}
		}
		
	}
	
	private static void swap(int[] a, int j, int i) {
		int temp = a[j];
		a[j]= a[i];
		a[i] = temp;
	}
	

	public static void p(int[] a) {
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
