/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import LinkedList.Node;

public class StackLinkedList<T> {

    Node top;

    public StackLinkedList() {
        top = null;
    }

    public void push(Object value) {
        Node newNode = new Node(value, null);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public T pop() {
        if (top == null) {
            System.out.println("stack is emplty");
            return null;
        }
        T value = (T) top.value;
        top = top.next;
        return value;
    }

}
