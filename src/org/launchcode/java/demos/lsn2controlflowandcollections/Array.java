package org.launchcode.java.demos.lsn2controlflowandcollections;



public class Array {
    public static void main(String[] args){
        //Array Declaration
       int[] array;
        //Array Initialization
       array = new int[]{1, 1, 2, 3, 5, 8};
        System.out.print("Odd Numbers from 1 to "+array+" are: ");
        //Printing the elements of array
        for(int i =1; i <= array.length; i++)
        {
            if (i % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
