package org.example;

import java.util.Scanner;

public class Array extends Thread{
    int[]arr;
    public Array(int []arr){
        this.arr = arr;
    }

    public void findMax(){
        System.out.println(getName());
        int result = arr[0];
        for(int i:arr){
            if(i>result)
                result=i;
        }
        System.out.println("Maximum: " + result);
    }

    public void findMin(){
        System.out.println(getName());
        int res = arr[0];
        for(int i:arr){
            if(i<res)
                res = i;
        }
        System.out.println("Minimum: " + res);
    }

    public void findSum(){
        System.out.println(getName());
        int res=0;
        for(int i:arr)
            res+=i;
        System.out.println("Sum: " + res);
    }

    public void findAVG(){
        System.out.println(getName());
        int res=0;
        for(int i:arr)
            res+=i;
        res/=arr.length;
        System.out.println("AVG: " + res);
    }

    public void run(){
        if(getName().contains("Thread-0")){
            findMin();
        }
        else if(getName().contains("Thread-1"))
        {
            findMax();
        }
        else if(getName().contains("Thread-2"))
        {
            findSum();
        }
        else
        {
            findAVG();
        }
    }

}
