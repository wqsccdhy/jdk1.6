package collection;

import java.util.Stack;
import java.util.Vector;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

/**
 * 测试文件
 * @author wq
 *
 */
public class Test {

	public static void main(String[] args) {
		//vectorTest();
		
		stackTest();
		
		stringStackTest();

	}

	private static void stringStackTest() {
		StringStack stringStack = new StringStack();
		stringStack.add(1);
	}

	private static void stackTest() {
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < 11; i++) {
			if (i==10) {
				System.out.println();
			}
			stack.add(String.valueOf(i));
		}
		
		//取出栈顶元素，并删除
		//String pop = stack.pop();
		
		//取出栈顶元素，但不删除
		String peek = stack.peek();
		
		//System.out.println(pop);
		System.out.println(peek);
		
		stack.isEmpty();
		stack.empty();
		stack.capacity();
		stack.ensureCapacity(30);
		stack.remove(1);
		stack.search("2");
	}

	private static void vectorTest() {
		int initialCapacity = 5;
		Vector<String> vector = new Vector<String>(initialCapacity);
		for (int i = 0; i < initialCapacity + 1; i++) {
			if (i == 5) {
				System.out.println();
			}
			vector.add(String.valueOf(i));
		}
		
		vector.set(2, "2a");
		
		vector.remove(2);
		vector.remove("2a");
		
		
	}

}
