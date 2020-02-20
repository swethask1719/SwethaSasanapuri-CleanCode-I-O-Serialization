package com.swetha.interestCalculator;

public interface calculation {
    public abstract double calculateSimpleInterest(double principleAmount, double time, double rateOfInterest);

    public abstract double calculateCompoundInterest(double principleAmount, double time, double rateOfInterest);
}