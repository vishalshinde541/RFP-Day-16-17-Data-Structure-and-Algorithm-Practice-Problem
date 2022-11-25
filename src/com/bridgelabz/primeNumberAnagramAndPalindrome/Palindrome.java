package com.bridgelabz.primeNumberAnagramAndPalindrome;

public class Palindrome {
    boolean checkPalindrome(int inputNum){
        int i=inputNum;
        int rev=0;
        while (i > 0){
            int remainder=i%10;
            rev=rev*10+remainder;
            i=i/10;
        }
        if (inputNum == rev) {
            return true;
        }else
            return false;
    }
}