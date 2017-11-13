package sort.quicksort;

import java.util.Arrays;

public class AbsQuickSortTset {

	public static void main(String[] args) {

		//int[] array = { 49, 38, 65, 97, 76, 13, 27, 49 };
		int[] array = {1,2,3,4,5,6,0,7,8,9,10,0};
		AbsQuickSort quickSort = new QuickSort();
		quickSort.sort(array);
		System.out.println(Arrays.toString(array));

	}

}
