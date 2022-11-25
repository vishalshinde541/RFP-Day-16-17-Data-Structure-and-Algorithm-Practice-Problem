package com.bridgelabz.binarySearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public int searchWord(String word[], String word1){
        int index=search_recursive(word,0,word.length,word1);
        return index;
    }
    int search_recursive(String word[],int l,int r, String word1){
        while (l <= r){
            int m=(l+r)/2;
            int result=word[m].compareToIgnoreCase(word1);
            if (result == 0){
                return m;
            } else if (result < 0) {
                l=m+1;
            } else if (result > 0) {
                r=m-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        BinarySearch binarySearch=new BinarySearch();
        Scanner scanner=new Scanner(System.in);

        String path=System.getProperty("user.dir");
        File file=new File(path+"/sample-word-list.csv");
        Scanner fileScan=new Scanner(file);
        String arr[]=fileScan.nextLine().split(",");
        Arrays.sort(arr);
        for (String s: arr) {
            System.out.print(s+", ");
        }
        System.out.println("\nEnter Word to Search: ");
        String word1=scanner.next();
        int index=binarySearch.searchWord(arr,word1);

        if (index != -1){
            System.out.println("word is present at index "+index);
        }else {
            System.out.println("word not found");
        }
    }
}