package com.example.project;

import java.text.DecimalFormat;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();

        String pattern = "##.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        double perPersonCostNoTip = (cost/people);
        double totalTip = (cost*((double)percent/100));
        double costWithTip = (cost+totalTip);
        // double perPersonWithTip = Math.round((costWithTip/people)*100.0)/100.0;
        double perPersonWithTip = (costWithTip/people);
        double tipPerPerson = (totalTip/people);
        
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $"+decimalFormat.format(cost)+"\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: "+decimalFormat.format(percent)+"%"+"\n");
        result.append("Total tip: $"+decimalFormat.format(totalTip)+"\n");
        result.append("Total Bill with tip: $"+decimalFormat.format(cost+totalTip)+"\n");
        result.append("Per person cost before tip: $"+decimalFormat.format(perPersonCostNoTip)+"\n");
        result.append("Tip per person: $"+decimalFormat.format(tipPerPerson)+"\n");
        result.append("Total cost per person: $"+decimalFormat.format(perPersonWithTip)+"\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12;
        int percent = 15;
        double cost = 566.97;             
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
