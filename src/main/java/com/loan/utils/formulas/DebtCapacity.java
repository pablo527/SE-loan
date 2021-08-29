package com.loan.utils.formulas;

import com.loan.models.Credit;
import com.loan.models.Data;
import com.loan.utils.se.SytemExpert;

import java.util.Objects;

public class DebtCapacity {
    public static double calculateCapacity (double salary,double debt,double creditCards ){
        double capacity = (salary * 0.30) - debt;
        double totalDebt=0;
        if(creditCards != 0){
            totalDebt = creditCards/18;
        }
        capacity = Math.round(capacity - totalDebt);
        System.out.println(capacity);
        return capacity;

    }

    public static boolean createData (Credit credit){
        int age = credit.getAge();
        String card = credit.getCard();
        String typeContract = credit.getTypeContract();
        int  month = credit.getMonth();
        String typeProperty = credit.getTypeCredit();
        double value = credit.getValue();
        String contact = credit.getTypeContract();
        double quota = credit.getQuota();
        double amount = credit.getAmount();
        int term = credit.getTerm();
        double initial = credit.getInitial();
        String typeCredit =  credit.getTypeCredit();
        double income = credit.getIncome();
        double expenses = credit.getExpenses();
        double paymant = PaymantPay.monthPay(amount, term);
        double capacity = calculateCapacity(income,expenses,quota);
        double capacityS = calculateCapacity(income,expenses,0);
        return SytemExpert.approved(age,  card,  typeContract,  month,  typeProperty,  value,  contact,  quota,  amount,  term,  initial,  typeCredit,  income,  paymant,  capacity, capacityS);
    }
}
