package OOPS_Chapter_2;
import java.util.Stack;
public class Stack_Java_Is_Empty {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.isEmpty());
	}
}
