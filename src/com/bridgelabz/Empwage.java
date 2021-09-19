package com.bridgelabz;

public class Empwage {
    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20 ;
        int FULL_TIME = 1;
        int PART_TIME = 2;
        int wageHrs;
        int empwage;
        double check = Math.floor(Math.random() * 10) % 3;
        if (check == FULL_TIME){
           wageHrs = 8;
        }
        else if(check == PART_TIME){
            wageHrs = 4;
        }
        else
        {
          wageHrs = 0;
        }
         empwage = WAGE_PER_HOUR*wageHrs;
        System.out.println("employee wage = " + empwage);
    }
}
