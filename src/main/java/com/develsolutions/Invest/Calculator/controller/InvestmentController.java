package com.develsolutions.Invest.Calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.develsolutions.Invest.Calculator.service.InvestmentService;

@RestController
@RequestMapping("/api")
public class InvestmentController {

    @GetMapping("/calculate")
    public double yearSimlation(
            @RequestParam() double  initialValue,
            @RequestParam() double  contributionValue,
            @RequestParam() double rate,
            @RequestParam() int time
    ) {
        InvestmentService investing = new InvestmentService(initialValue, contributionValue, rate, time);
        investing.simulate();
        return investing.getEnd();
    }

}
