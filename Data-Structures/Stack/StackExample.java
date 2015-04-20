import java.util.*;
public class StackExample{
   public static void main(String [] args){
      Stack<Integer> st = new Stack();
      st.push(42); st.push(66); st.push(99);
	  st.pop(); st.pop(); st.pop();
   }
}
class Stack<T>{ // bounded

	private T[] seq; // the sequence
	private int size = 0; // size of sequence
	
	Stack(int n){// n>0
		seq = (T[])(new Object[n]);
	}

	Stack(){
		seq = (T[])(new Object[10000]);
	}

	boolean isEmpty(){return size==0;}

	boolean push(T t){
		if (size<seq.length) {
				seq[size] = t; size++; return true;
		}
		else return false;
	}
	
	T pop(){
		if (isEmpty()) return null;
		else {
			size--; return seq[size];
		}
	}
}
