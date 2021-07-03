package com.mycompany.datastructureandalgorithms.onedimentionarray;

public class OneDimentionArray {

    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 55;
        nums[2] = 11;
        nums[3] = 90;
        nums[4] = 25;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        Student[] students = new Student[3];
        students[0] = new Student("malak", 5);
        students[1] = new Student("Ahmed", 12);
        students[2] = new Student("menna", 2);
        for(Student student :students ){
            System.out.println("name is "+student.name+ ",age is "+student.age);
        }

    }

}
