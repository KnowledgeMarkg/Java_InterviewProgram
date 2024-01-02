package com.AgiraTech;

import java.util.Stack;

public class CheckGivenStringIsWellFormedOrNot {

	public static void main(String[] args) {
		String str = "[{()]";
		Stack<Character> st = new Stack<>();
		for(int i =0 ;i<str.length(); i++) {
			char ch = str.charAt(i);
			if(st.isEmpty()) {
				st.push(ch);
			}else if(ch=='[' || ch=='{' || ch == '(') {
				st.push(ch);
			}else if(ch==']' && st.peek()=='[') {
				st.pop();
			}else if(ch=='}' && st.peek()=='{') {
				st.pop();
			}else if(ch==')' && st.peek()=='(') {
				st.pop();
			}
		}
		if(st.isEmpty()) {
			System.out.println("String "+str+" is well form String");
		}else {
			System.out.println("Not Well Form");
		}
	}

}
