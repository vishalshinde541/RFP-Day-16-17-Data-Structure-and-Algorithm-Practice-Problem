package com.bridgelabz.primeNumberAnagramAndPalindrome;

public class PrimeNumbersExample {
    public static void main(String[] args) {
        PrimeNumbersExample numbers=new PrimeNumbersExample();
        for (int i = 2; i < 1000; i++) {
            boolean isPrime=numbers.checkPime(i);
            if (isPrime){
                System.out.print(i+" ");
            }
        }
    }
    public boolean checkPime(int i){
        boolean isPrime=true;
        for (int j = 2; j <= i/2; j++) {
            if (i%j == 0){
                isPrime= false;
                break;
            }
        }
        return isPrime;
    }
}