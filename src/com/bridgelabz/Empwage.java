package com.bridgelabz;

public class Empwage {
    public static void main(String[] args) {
        int PRESENT = 0;
        double check = Math.floor(Math.random() * 10) % 2;
        if (check == PRESENT){
            System.out.println("present");
        }
        else
        {
            System.out.println("absent");
        }
    }
}
