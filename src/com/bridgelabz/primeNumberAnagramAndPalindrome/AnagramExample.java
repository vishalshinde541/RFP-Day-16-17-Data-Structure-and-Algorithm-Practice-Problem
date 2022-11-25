package com.bridgelabz.primeNumberAnagramAndPalindrome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnagramExample {
    public static void main(String[] args) {
        AnagramExample anagramExample=new AnagramExample();

        String str1="earth";
        String str2="heart";

        boolean isAnagram=anagramExample.checkAnagram(str1,str2);

        if (isAnagram){
            System.out.println("Strings are Anagram");
        }else {
            System.out.println("Strings are not Anagram");
        }
    }
    public boolean checkAnagram(String str1,String str2){
        if (!(str1.length() == str2.length())){
            return false;
        }
        Boolean isAnagram=true;
        for (char c:str1.toCharArray()) {
            if (!str2.contains(String.valueOf(c))){
                isAnagram=false;
            }
        }
        return isAnagram;
    }
    public boolean checkAnagram(int num1,int num2){
        List<Integer> num1List=splitNumber(num1);
        List<Integer> num2List=splitNumber(num2);
        Collections.sort(num1List);
        Collections.sort(num2List);

        if ( !( num1List.size() == num2List.size() ) ){
            return false;
        }
        for (int i = 0; i < num1List.size(); i++) {
            if ( num1List.get(i) != num2List.get(i) ){
                return false;
            }
        }
        return true;
    }
    ArrayList<Integer> splitNumber(int num){
        ArrayList<Integer> numList=new ArrayList<>();
        while (num>0){
            int remainder=num%10;
            numList.add(remainder);
            num=num/10;
        }
        return numList;
    }
}