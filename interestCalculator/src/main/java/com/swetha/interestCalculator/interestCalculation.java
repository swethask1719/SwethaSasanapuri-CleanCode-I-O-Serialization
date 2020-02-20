package com.swetha.interestCalculator;

public class interestCalculation implements calculation {
    public double calculateSimpleInterest(double principleAmount, double time, double rateOfInterest) {

        return (principleAmount * time * rateOfInterest) / 100.0;
    }

    public double calculateCompoundInterest(double principleAmount, double time, double rateOfInterest) {

        return principleAmount * Math.pow((1+rateOfInterest/100), time);
    }
}
