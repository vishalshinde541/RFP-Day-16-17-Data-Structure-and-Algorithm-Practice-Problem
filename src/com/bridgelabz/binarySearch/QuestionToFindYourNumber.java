package com.bridgelabz.binarySearch;

import java.util.Scanner;

public class QuestionToFindYourNumber {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        QuestionToFindYourNumber obj=new QuestionToFindYourNumber();

        System.out.print("think of a number between 0 and N-1\n"+
                "Enter number N= ");
        int maxNum=scanner.nextInt();

        int[] numList=new int[maxNum];
        int index=0;
        for (int j = 0; j < maxNum; j++) {
            numList[index++]=j;
        }
        obj.searchByQuestions(numList);
    }
    public void searchByQuestions(int[] numbers){
        int num=search_recursive(numbers,0,numbers.length);
        System.out.println("number is "+num);
    }
    int search_recursive(int[] numList,int l,int r){
        while (l < r){
            int m=(l+r)/2;
            System.out.println("Is number greater than "+m+" (y/n) :");
            String s=scanner.next();
            if (s.equals("y")) {
                l=m+1;
            } else{
                r=m;
            }
        }
        return numList[l];
    }
}