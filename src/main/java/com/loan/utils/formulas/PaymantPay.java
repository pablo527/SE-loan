package com.loan.utils.formulas;

import com.loan.models.Credit;
import java.text.DecimalFormat;
import java.util.ArrayList;


public  class  PaymantPay {

    public static ArrayList<Month> generetePaymantMethod (Credit data){
        double valueCredit = data.getAmount();
        int term = data.getTerm();
        double monthPay = (monthPay(valueCredit, term));

        ArrayList<Month> months = new ArrayList<>();
        double rent;
        double interest;
        double amortization;
        double balance;

        for (int i=0; i< term;i++){

            if (i ==0){
                rent = 0;
                interest= 0;
                amortization=0;
                balance = valueCredit;
            } else if (i==1){
                rent = monthPay;
                interest = valueCredit * 0.08;
                amortization = rent - interest;
                balance = valueCredit - amortization;
            } else {
                Month monthAux = months.get(i-1);

                rent = monthAux.getRent() + 1;
                interest = monthAux.getBalance() * 0.08;
                amortization = rent - interest;
                balance = monthAux.getBalance() - amortization;
            }
            Month month = new Month(rent,interest,amortization,balance);

            months.add(month);
        }

        return months;
    }

    public static double monthPay(double credit, int term){
        try {
            double aux1 = credit * 0.04;
            double aux2 = 1- (Math.pow(1+0.08,-term));
            double monthPay = aux1/aux2;
            DecimalFormat df = new DecimalFormat("###.##");
            return Math.round(monthPay);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0.0;
    }
}
