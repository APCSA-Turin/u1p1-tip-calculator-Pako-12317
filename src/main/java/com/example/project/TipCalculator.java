package com.example.project;

import java.text.DecimalFormat;

public class TipCalculator {
    
    public static String calculateTip(int people, int percent, double cost) { 
             
        StringBuilder result = new StringBuilder();
// I don't like decimal format.
        String pattern = "##.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        double perPersonCostNoTip = (cost/people);
        double totalTip = (cost*((double)percent/100));
        double costWithTip = (cost+totalTip);
        double perPersonWithTip = (costWithTip/people);
        double tipPerPerson = (totalTip/people);
        
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $"+decimalFormat.format(cost)+"\n"); 
        result.append("Total percentage: "+decimalFormat.format(percent)+"%"+"\n");
        result.append("Total tip: $"+decimalFormat.format(totalTip)+"\n");
        result.append("Total Bill with tip: $"+decimalFormat.format(cost+totalTip)+"\n");
        result.append("Per person cost before tip: $"+decimalFormat.format(perPersonCostNoTip)+"\n");
        result.append("Tip per person: $"+decimalFormat.format(tipPerPerson)+"\n");
        result.append("Total cost per person: $"+decimalFormat.format(perPersonWithTip)+"\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //Key to not rounding is decimal format at the end when appending results.
     public static void main(String[] args) {
       
        int people = 12;
        int percent = 15;
        double cost = 566.97;             
        System.out.println(calculateTip(people,percent,cost));
    }
}
   //All test cases work! Yay!     
