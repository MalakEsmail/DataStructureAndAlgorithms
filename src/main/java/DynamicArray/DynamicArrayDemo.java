/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicArray;

/**
 *
 * @author malak
 */
public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray<Integer> dArr = new DynamicArray<Integer>();
        dArr.put(11);
        System.out.println(dArr.getSize());
        dArr.put(12);
        System.out.println(dArr.getSize());
        dArr.put(16);
        System.out.println(dArr.getSize());
        dArr.put(58);
        System.out.println(dArr.getSize());
         dArr.put(88);
        System.out.println(dArr.getSize());
    }
}
