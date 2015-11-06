package data.structure.java;

import java.util.Stack;

public class StackApp {
	
	private static Stack<Integer> st = new Stack<Integer>();
	
	public static void checkStack() {
		Stack<Integer> st = StackApp.st;
		System.out.println(st.add(5)); // Adds item to the bottom.
		System.out.println(st.push(10)); // Adds item to the top.
		System.out.println(st.pop()); // Removes the top and returns it.
		System.out.println(st.peek()); // Returns the top without removing it.
		// Same as pop but throws exception.
		System.out.println(st.remove(20)); // Removes the first occurrence of the element.
	}
	
	public static void main(String[] args) {
		StackApp.checkStack();
	}

}
