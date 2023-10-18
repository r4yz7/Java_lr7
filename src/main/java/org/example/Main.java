package org.example;

import java.net.SecureCacheResponse;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter size array: ");
//        int[]arr = new int[scanner.nextInt()];
//        for (int i=0;i<arr.length;i++){
//            System.out.print("Enter " + (i+1) + " number: ");
//            arr[i] = scanner.nextInt();
//        }
//
//
//        Array findMax = new Array(arr);
//        Array findMin = new Array(arr);
//        Array findSum = new Array(arr);
//        Array findAVG = new Array(arr);
//        findMin.start();
//        findMax.start();
//        findSum.start();
//        findAVG.start();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String path = scanner.nextLine();
        SecondTask evenNumber = new SecondTask(path);
        SecondTask oddNumber = new SecondTask(path);
        evenNumber.setName("even");
        oddNumber.setName("odd");
        evenNumber.start();
        oddNumber.start();
    }
}