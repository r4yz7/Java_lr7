package org.example;

import java.io.*;
import java.util.ArrayList;

public class SecondTask extends Thread{
    String path;
    ArrayList<Integer> arr;
    public SecondTask(String filepath){
        path = filepath;
        arr = new ArrayList<>();
    }
    void readFile(){
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine())!=null){
                int n = Integer.parseInt(line);
                arr.add(n);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    void writeEven(){
        int count=0;

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("evenNumbers.txt"))){
            for (int i:arr){
                if(i%2==0)
                {
                    writer.write(Integer.toString(i));
                    writer.newLine();
                    count++;
                }
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Even: " + count);
    }
    void writeOdd(){
        int count=0;
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("oddNumbers.txt"))){
            for (int i:arr){
                if(i%2!=0)
                {
                    writer.write(Integer.toString(i));
                    writer.newLine();
                    count++;
                }
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Odd: " + count);

    }
    public void run(){
        readFile();
        if(getName().contains("even")){
            writeEven();
        }
        else if(getName().contains("odd")){
            writeOdd();
        }
    }

}
