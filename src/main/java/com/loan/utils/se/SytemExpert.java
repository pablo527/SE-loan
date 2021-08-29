package com.loan.utils.se;

public  class SytemExpert {
    public static  boolean approved(int age, String card, String typeContract, int month, String typeProperty, double value, String contact, double quota, double amount, int term, double initial, String typeCredit, double income,double paymant, double capacity, double capacityS)
     {
        if (capacity >= paymant) {
            boolean vis = amount <= 145000000;

          switch (typeCredit){
              case "1":
                    if (vis){
                        if (initial >= amount*0.20){
                            if (typeContract.equals("1")){
                                return false;
                            } else{
                                if (age>=70){
                                    return term < 120;
                                } else{
                                    return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    } else{
                        if (initial >= amount*0.30){
                            if (typeContract.equals("1")){
                                return false;
                            } else{
                                if (age>=70){
                                    return term < 120;
                                } else{
                                    return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
              case "2":
                  return value >= amount * 0.5;
              case "3":
                    if (amount < 10000000){
                        return income >= 1000000;
                    } else{
                        if (typeContract.equals("1")){
                            if (month >= term * 0.50){
                                return income > 2000000;
                            } else{
                                return false;
                            }
                        } else{
                            return income > 2000000;
                        }
                    }
              default:
                  break;
          }

        } else {
            switch (typeCredit){
                case "1":
                    return false;
                case "2":
                    return value >= amount;
                case "3":
                    if(card.equals("1")){
                        if (capacityS >= paymant){
                            if (amount < 10000000){
                                return income >= 1000000;
                            } else{
                                if (typeContract.equals("1")){
                                    if (month >= term * 0.50){
                                        return income > 2000000;
                                    } else{
                                        return false;
                                    }
                                } else{
                                    return income > 2000000;
                                }
                            }
                        } else {
                            return false;
                        }
                    } else{
                        return false;
                    }
            }
        }
        return false;
    }
}
