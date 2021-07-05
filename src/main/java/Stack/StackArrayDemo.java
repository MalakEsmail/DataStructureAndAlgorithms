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
public class StackArrayDemo {

    public static void main(String[] args) {
        StackArray<Integer> sa = new StackArray<Integer>(5);
        sa.push(10);
        sa.push(12);
        sa.push(15);
        sa.push(19);
        sa.push(100);
        while(!sa.isEmpty())
        System.out.println(sa.pop());

    }
}
