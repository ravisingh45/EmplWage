package com.bridgelabz;

public class Empwage {
    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20 ;
        int FULL_TIME = 1;
        int PART_TIME = 2;
        int wageHrs;
        int empwage;
        int check = (int) Math.floor(Math.random() * 10) % 3;
        switch (check ){
            case 1 :
                wageHrs = 8;
                break;
            case 2 :
                wageHrs = 4;
                break;
            default:
                wageHrs = 0;
        }
         empwage = WAGE_PER_HOUR*wageHrs;
        System.out.println("employee wage = " + empwage);
    }
}
