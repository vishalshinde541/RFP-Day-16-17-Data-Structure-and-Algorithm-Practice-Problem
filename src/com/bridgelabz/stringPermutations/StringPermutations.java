package com.bridgelabz.stringPermutations;

public class StringPermutations {
    public static void main(String[] args) {
        generatePermutations("ABC");
    }
    static void generatePermutations(String str){
        StringPermutations stringPermutations=new StringPermutations();
        stringPermutations.getPermutations_recursive(str,0 ,str.length());
    }
    void getPermutations_recursive(String str, int start, int end){
        if (start == end-1){
            System.out.println(str);
        }else{
            for (int i = start ; i < end; i++) {
                str=swapString(str,start,i);
                getPermutations_recursive(str,start+1,end);
                str=swapString(str,start,i);
            }
        }
    }
    public static String swapString(String str, int i, int j){
        char[] chars=str.toCharArray();
        char temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
        return String.valueOf(chars);
    }
}