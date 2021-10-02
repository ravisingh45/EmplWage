package com.bridgelabz;

public class Empwage {
    public static final int WAGE_PER_HOUR = 20;
    public static final int MAX_DAY = 20;
    public static final int MAX_HRS = 100;

     void ComputeWage(String company, int wageHrs,int totalWorkingDays,int totalEmpHrs ) {
        while (totalWorkingDays < MAX_DAY && totalEmpHrs <= MAX_HRS) {
            totalWorkingDays++;
            int check = (int) Math.floor(Math.random() * 10) % 3;
            switch (check) {
                case 1:
                    wageHrs = 8;
                    break;
                case 2:
                    wageHrs = 4;
                    break;
                default:
                    wageHrs = 0;
            }
            totalEmpHrs += wageHrs;
            System.out.println("day:" + totalWorkingDays + " emp hrs: " + wageHrs);

        }
        int totalEmpWage = totalEmpHrs * WAGE_PER_HOUR;
        System.out.println("Total wage of the company "+ company + " is = "+totalEmpWage);
    }


    public static void main(String[] args) {
      Empwage Dmart = new Empwage();
        Dmart.ComputeWage("dmart",250,23,100);
        Empwage Vmart = new Empwage();
        Vmart.ComputeWage("vmart",500,23,98);
    }
}