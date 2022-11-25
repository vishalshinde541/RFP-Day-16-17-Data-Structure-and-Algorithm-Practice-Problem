package com.bridgelabz.sortingExamples;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort sort=new MergeSort();
        String[] array=new String[]{"Bangladesh","Pakistan","USA","Iraq","Ukraine","Germany","Armenia","India","Japan","China","Australia","Austria","France"};

        sort.printArray(array);
        sort.mergeSort(array);
        sort.printArray(array);
    }
    public void mergeSort(String[] inputArray){
        int inputLength=inputArray.length;
        if (inputLength <= 1){
            return;
        }
        int midIndex=inputLength / 2;
        String[] leftHalf=new String[midIndex];
        String[] rightHalf=new String[inputLength-midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i]=inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i-midIndex]=inputArray[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray,leftHalf,rightHalf);
    }

    public void merge(String[] inputArray, String[] leftHalf, String[] rightHalf){
        int i=0, j=0, k=0;
        while (i < leftHalf.length && j < rightHalf.length)
        if (leftHalf[i].compareTo(rightHalf[j]) <= 0){
            inputArray[k++]=leftHalf[i++];
        }else {
            inputArray[k++]=rightHalf[j++];
        }
        while (i < leftHalf.length){
            inputArray[k++]=leftHalf[i++];
        }
        while (j < rightHalf.length){
            inputArray[k++]=rightHalf[j++];
        }
    }

    public void printArray(String[] ar){
        System.out.print("{ ");
        for (String a:ar) {
            System.out.print(a+" ");
        }
        System.out.println("}");
    }
}