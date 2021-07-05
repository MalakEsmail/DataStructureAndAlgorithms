/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedList;

/**
 *
 * @author malak
 */
public class DoubleLinkedListDemo {

    public static void main(String[] args) {
        TheDoubleLinkedList<String> ls = new TheDoubleLinkedList<String>();
        ls.add("malak");
        ls.add("yara");
        ls.add("laila");
        ls.add("sara");
        System.out.println("before delete : ");
        ls.display();
        System.out.println("after delete : ");
        ls.delete();
        ls.display();
    }
}
