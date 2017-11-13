package sort.quicksort;

/**
 * 快速排序
 * 
 * @author wq
 *
 */
public class QuickSort extends AbsQuickSort {

	@Override
	public void quickSort(int[] array, int start, int end) {

		if (start > end) {
			return;
		}

		int startIndex = start;
		int endIndex = end;
		int key = array[start];

		while (startIndex < endIndex) {// 从表的两端交替向中间扫描
			while ((startIndex < endIndex) && (array[endIndex] >= key)) {
				endIndex--;
			}

			// 用比基准小的记录替换低位记录
			if (startIndex < endIndex) {
				array[startIndex++] = array[endIndex];
			}

			while ((startIndex < endIndex) && (array[startIndex] <= key)) {
				startIndex++;
			}

			// 用比基准大的记录替换高位记录
			if (startIndex < endIndex) {
				array[endIndex--] = array[startIndex];
			}

		}

		// 将基准数值替换回 a[i]
		array[startIndex] = key;
		// 对低子表进行递归排序
		quickSort(array, start, startIndex - 1);
		// 对高子表进行递归排序
		quickSort(array, startIndex + 1, end);

	}

}
