/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author malak
 */
public class StackLinkedListDemo {

	public static void main(String[] args) {
		StackLinkedList<String> st=
				new StackLinkedList<String>();
		st.pop();
		st.push("Hussein");
		st.push("Jena");
		
		System.out.println(st.pop());
		System.out.println(st.pop());
	}}
