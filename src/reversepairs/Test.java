package reversepairs;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int[] array = { 2, 4, 1, 3, 5 };
		
		List<String> list = new ArrayList<String>();
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					StringBuffer buffer = new StringBuffer();
					buffer.append(String.valueOf(array[i]));
					buffer.append(",");
					buffer.append(String.valueOf(array[j]));
					list.add(buffer.toString());
					count++;
				}
			}
		}
		
		System.out.println(count);
		for (String string : list) {
			System.out.println(string);
		}

	}

}
