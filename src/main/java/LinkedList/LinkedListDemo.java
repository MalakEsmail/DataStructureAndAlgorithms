/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        TheLinkedList<String> ls = new TheLinkedList<String>();
        ls.add("Malak");
        ls.add("passant");
        ls.add("aya");
        ls.add("manar");
        System.out.println("Before deleting :");
        ls.display();
        ls.delete();
        System.out.println("After deleting :");
        ls.display();

    }
}
