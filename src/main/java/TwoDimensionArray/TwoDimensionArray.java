/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoDimensionArray;

/**
 *
 * @author malak
 */
public class TwoDimensionArray {

    public static void main(String[] args) {
        int[][] data = new int[3][3];
        data[0][0] = 5;
        data[0][1] = 10;
        data[0][2] = 15;
        
        data[1][0] = 6;
        data[1][1] =12;
        data[1][2] = 55;
        
        data[2][0] = 0;
        data[2][1] =98;
        data[2][2] = 85;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(data[i][j]+ "\t");
            }
            System.out.println("\n");
        }
    }
}
