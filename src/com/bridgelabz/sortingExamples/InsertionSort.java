package com.bridgelabz.sortingExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InsertionSort {
    public void printArray(String[] arr){
        System.out.print("array{ ");
        for (String value:arr) {
            System.out.print(value+", ");
        }
        System.out.println("}");
    }
    public void insertionSort(String[] arr){
        for (int i = 1 ; i < arr.length; i++) {
            String currentValue=arr[i];
            int j=i-1;
            while (j >= 0 && arr[j].compareTo(currentValue) > 0){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=currentValue;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        InsertionSort sort=new InsertionSort();

        String path=System.getProperty("user.dir");
        File file=new File(path+"/sample-word-list.csv");
        Scanner fileScan=new Scanner(file);
        String[] wordList=fileScan.nextLine().split(",");

        System.out.println("before insertionSort :");
        sort.printArray(wordList);

        sort.insertionSort(wordList);

        System.out.println("after sorting :");
        sort.printArray(wordList);

    }
}