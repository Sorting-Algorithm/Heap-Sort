package com.sorting.algorithm;

public class HeapSort {
	public static void main(String[] args) {
		int arr[] = { 12, 29, 27, 4, 8, 11, 32, 1 };
		heapSortAlgorithm(arr);
		for (int value : arr) {
			System.out.print(value + " ");
		}
	}

	private static void heapSortAlgorithm(int arr[]) {
		int length = arr.length;
		for (int i = length / 2 - 1; i >= 0; i--) {
			heapify(arr, length, i);
		}
		for (int i = length - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}

	private static void heapify(int arr[], int length, int i) {
		int parent = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (left < length && arr[left] > arr[parent]) {
			parent = left;
		}
		if (right < length && arr[right] > arr[parent]) {
			parent = right;
		}
		if (parent != i) {
			int temp = arr[i];
			arr[i] = arr[parent];
			arr[parent] = temp;
			heapify(arr, length, parent);
		}
	}
}
