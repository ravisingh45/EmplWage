package com.bridgelabz;

public class Empwage {
    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20 ;
        int FULL_DAY = 1 ;
        int wageHrs;
        int empwage;
        double check = Math.floor(Math.random() * 10) % 2;
        if (check == FULL_DAY){
           wageHrs = 8;
        }
        else
        {
          wageHrs = 0;
        }
         empwage = WAGE_PER_HOUR*wageHrs;
        System.out.println("employee wage = " + empwage);
    }
}
