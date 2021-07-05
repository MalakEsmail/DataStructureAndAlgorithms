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
public class StackDArrayDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StackDArray<Integer> st
                = new StackDArray<Integer>(2);
        st.push(12);
        st.push(12);
        System.out.println("Size stack:" + st.getSize());
        st.push(12);
        System.out.println("Size stack:" + st.getSize());
    }

}
