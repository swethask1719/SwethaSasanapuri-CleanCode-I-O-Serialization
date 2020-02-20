package com.swetha.CostEstimator;

import java.io.PrintWriter;
import java.util.Scanner;

public class ClientApp {
    private static Scanner scanner;

    public static void main(String[] args) {
        double areaOfHouse, constructionCost;
        String materialStandard;
        String query;
        Calculator costCalculator = new Calculator();
        PrintWriter out = new PrintWriter(System.out);
        scanner = new Scanner(System.in);
        boolean automated=false;
        do {
            out.print("\nEnter cost of the house :");
            out.flush();
            areaOfHouse = scanner.nextDouble();
            out.print("\nEnter the material standard 1)Standard 2) aboveStandard 3)highStandard ] :");
            out.flush();
            materialStandard = scanner.next();
            out.print("\nEnter if it fully automated [y/n] :");
            out.flush();
            if(scanner.next().equals("y")) {
                automated=true;
            }
            constructionCost = costCalculator.getCost(materialStandard, areaOfHouse, automated);
            out.print("\nEstimated house construction cost :" + constructionCost);
            out.print("\nPress stop to exit or anything to continue : ");
            out.flush();
            query=scanner.next();
        }while(!query.equals("stop"));
        out.close();
    }
}
