package com.bridgelabz.primeNumberAnagramAndPalindrome;

import java.util.ArrayList;
import java.util.List;

public class PrimeWithAnagramAndPalindromeExample {
    static List<Integer> primeNumberList=new ArrayList<>();
    static List<Integer> primePalindromeNumberList=new ArrayList<>();

    public static void main(String[] args) {
        PrimeNumbersExample primeNumbersObj=new PrimeNumbersExample();
        AnagramExample anagramExampleObj=new AnagramExample();
        Palindrome palindromeObj=new Palindrome();

        System.out.println("Prime numbers: ");
        for (int i = 2; i < 100000; i++) {
            boolean isPrime=primeNumbersObj.checkPime(i);
            if (isPrime){
                primeNumberList.add(i);
            }
        }
        System.out.println(primeNumberList);

        System.out.println("\nprime numbers that are Anagram: ");
        for (int i = 0; i < primeNumberList.size(); i++) {
            int num=primeNumberList.get(i);
            boolean isPalindrome=palindromeObj.checkPalindrome(num);
            if (isPalindrome){
                primePalindromeNumberList.add(num);
            }
        }
        System.out.println(primePalindromeNumberList);

        System.out.println("\nprime numbers that are Anagram and Palindrome: ");

        for (int i = 0; i < primePalindromeNumberList.size()-1; i++) {
            for (int j = i+1; j < primePalindromeNumberList.size(); j++) {
                int num1=primePalindromeNumberList.get(i);
                int num2=primePalindromeNumberList.get(j);
                boolean isAnagram = anagramExampleObj.checkAnagram(num1, num2);
                if (isAnagram){
                    System.out.print(num1+"-"+num2+", ");
                }
            }
        }
    }
}