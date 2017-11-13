package sort.quicksort;

import sort.ISort;

/**
 * 快速排序
 * 
 * @author wq
 *
 */
public abstract class AbsQuickSort implements ISort {

	@Override
	public void sort(int[] array) {
		this.quickSort(array, 0, array.length - 1);

	}

	public abstract void quickSort(int[] array, int start, int end);

}
