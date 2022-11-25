package com.bridgelabz.orderedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;




public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        OrderedList<String> orderedList=new OrderedList();
        Scanner scanner=new Scanner(System.in);

        //Read from file
        String path=System.getProperty("user.dir");
        File file=new File(path+"/sample-word-list.csv");
        Scanner fileScan=new Scanner(file);
        String arr[]=fileScan.nextLine().split(",");
        Arrays.sort(arr);

        for (String key: arr) {
            orderedList.append(key);
        }

        System.out.println("Ordered List:");
        System.out.println(orderedList);
        System.out.println("Enter Country Name :");
        String name=scanner.nextLine();
        Node node=orderedList.search(name);
        if (node != null){
            String data= (String) node.getData();
            System.out.println("found: "+data);
            orderedList.delete(data);
            System.out.println("Deleted: "+data );
        }else {
            System.out.println(name+" not found");
            orderedList.insert(name);
            System.out.println("Added: "+name);
        }
        System.out.println(orderedList);
    }
}