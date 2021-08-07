package com.example;

import java.util.Arrays;

public class SelectionSort {
	
	// i와 j의 위치 변경
	public static void swapElements(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	
	// start를 포함하여 start로부터 시작하는 최솟값의 위치를 찾고 배열의 마지막 위치로 감
	public static int indexLowest(int[] array, int start) {
		int lowIndex = start;
		for(int i = start; i < array.length; i++) {
			if(array[i] < array[lowIndex]) {
				lowIndex = i;
			}
		}
		
		return lowIndex;
	}
	
	// 선택 정렬을 사용하여 요소를 정렬
	public static void selectionSort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			int j = indexLowest(array, i);
			swapElements(array, i, j);
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 35, 10, 21, 11, 42};
		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}
}


/*
요소를 읽고 쓰는 것 - 상수 시간 연산
요소의 크기와 첫 번째 위치를 알고 있다면 한 번의 곱셈과 덧셈으로 어떤 요소의 위치라도 알 수 있다.
swapElements 메서드의 모든 연상이 상수 시간 이므로 전체 메서드는 상수 시간이 된다.

indexLowest 메서드는 일반적으로 비교횟수는 n - start가 되어 선형이 된다.

indexLowest 메서드가 처음 호출되면 n번 비교 연산을 한다.
두번째는 n-1번 비교 연산을 한다. 이렇게 했을때 총 비교 횟수는 n + n-1 + n-2 + ... + 1 + 0이다.
이 수열의 합은 n(n+1)/2이고 n^2에 비례하므로 selectionSort 메서드는 이차이다.

*/
