package com.bridgelabz.sortingExamples;

import java.util.Scanner;

public class BubbleSort {
    public void bubbleSort(int[] ar){
        for (int i=0; i< ar.length; i++){
            for (int j = 0; j < ar.length-1; j++) {
                if (ar[j] > ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
    }

    public void printArray(int[] ar){
        System.out.print("{");
        for (int i : ar) {
            System.out.print(i + " ");
        }
        System.out.println("}");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BubbleSort sort=new BubbleSort();

        int[] array=new int[5];
        System.out.println("Enter 5 integer values");
        for (int i = 0; i < 5; i++) {
            array[i]=scanner.nextInt();
        }

        System.out.println("before sorting: ");
        sort.printArray(array);

        sort.bubbleSort(array);

        System.out.println("after sorting: ");
        sort.printArray(array);
    }
}