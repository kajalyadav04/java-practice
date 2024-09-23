package com.masai.demo;

import java.util.Arrays;

import com.mysql.cj.protocol.x.ContinuousOutputStream;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class SortArrayUsingSortFun {
	public static void sortArray(int[] array) {
//		int largest=1000000;
//		for(int i=0;i<array.length;i++) {
//
//
//		}
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 29, 198, 4, 1, 65, 32 };
		sortArray(arr);
	}

}
