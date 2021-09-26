package com.bridgelabz;

public class Empwage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int MAX_DAY = 20;
    public static final int MAX_HRS = 100;

    static void ComputeWage() {
        int wageHrs;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
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
        System.out.println("total wage = " + totalEmpWage);
    }


    public static void main(String[] args) {
      Empwage empwage = new Empwage();
      empwage.ComputeWage();
    }
}