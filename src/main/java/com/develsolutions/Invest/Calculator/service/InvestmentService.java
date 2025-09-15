package com.develsolutions.Invest.Calculator.service;

import org.springframework.stereotype.Service;

public class InvestmentService {
    private double initialValue, contributionValue, rate, end;
    private int time;

    public InvestmentService(double initialValue, double contributionValue, double rate, int time) {
        this.initialValue      = initialValue;
        this.contributionValue = contributionValue;
        this.rate              = rate;
        this.time              = time;
    }

    public void simulate() {
        int months = this.time * 12;
        double monthlyRate = Math.pow(1 + this.rate, 1.0 / 12.0) - 1;

        this.end = this.initialValue * Math.pow((1 + monthlyRate), months)
                + (this.contributionValue * (Math.pow((1 + monthlyRate), months) - 1) / monthlyRate);
    }

    public double getEnd() {
        return end;
    }

}

