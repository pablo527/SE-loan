package com.loan.utils.se;

import com.loan.utils.Constantes;

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
                                Constantes.MSG = "Rechazado: tu contrato no cumple con las condiciones del crédito";
                                return false;
                            } else{
                                if (age>=70){
                                    if (term < 120) {
                                        return true;
                                    } else {
                                        Constantes.MSG = "Rechazado: El periodo del crédito no esta soportado";
                                        return false;
                                    }
                                } else{
                                    return true;
                                }
                            }
                        } else {
                            Constantes.MSG = "Rechazado: debes de tener una inicial del 20% sobre el valor del inmueble";
                            return false;
                        }
                    } else{
                        if (initial >= amount*0.30){
                            if (typeContract.equals("1")){
                                Constantes.MSG = "Rechazado: tu contrato no cumple con las condiciones del crédito";
                                return false;
                            } else{
                                if (age>=70){
                                    if (term < 120) {
                                        return true;
                                    } else {
                                        Constantes.MSG = "Rechazado: El periodo del crédito no esta soportado";
                                        return false;
                                    }
                                } else{
                                    return true;
                                }
                            }
                        } else {
                            Constantes.MSG = "Rechazado: debes de tener una inicial del 30% sobre el valor del inmueble";
                            return false;
                        }
                    }
              case "2":
                  if (value >= amount * 0.5){
                      return true;
                  } else{
                      Constantes.MSG = "Rechazado: El valor de la propiedad no cumple con lo establecido para el crédito";
                      return false;
                  }
              case "3":
                    if (amount < 10000000){
                        if(income >= 1000000){
                            return true;
                        } else {
                            Constantes.MSG = "Rechazado: No tienes suficiente capacidad de endeudamiento para el crédito";
                            return false;
                        }
                    } else{
                        if (typeContract.equals("1")){
                            if (month >= term * 0.50){
                                if(income >= 2000000){
                                    return true;
                                } else {
                                    Constantes.MSG = "Rechazado: No tienes suficiente capacidad de endeudamiento para el crédito";
                                    return false;
                                }
                            } else{
                                Constantes.MSG = "Rechazado: Tú contrato no cumple con el periodo suficiente";
                                return false;
                            }
                        } else{
                            if(income >= 2000000){
                                return true;
                            } else {
                                Constantes.MSG = "Rechazado: No tienes suficiente capacidad de endeudamiento para el crédito";
                                return false;
                            }
                        }
                    }
              default:
                  break;
          }

        } else {
            switch (typeCredit){
                case "1":
                    Constantes.MSG = "Rechazado: No tienees la suficiente capacidad de endeudamiento";
                    return false;
                case "2":
                    if (value >= amount){
                        return true;
                    } else{
                        Constantes.MSG = "Rechazado: El valor de la propiedad no cumple con lo establecido para el crédito";
                        return false;
                    }
                case "3":
                    if(card.equals("1")){
                        if (capacityS >= paymant){
                            Constantes.MSG = "Aprobado: Tú credito ha sido aprobado bajo la condicion de cancelar tus tarjetas de crédito";
                            if (amount < 10000000){
                                if(income >= 1000000){
                                    return true;
                                } else {
                                    Constantes.MSG = "Rechazado: No tienes suficiente capacidad de endeudamiento para el crédito";
                                    return false;
                                }
                            } else{
                                if (typeContract.equals("1")){
                                    if (month >= term * 0.50){
                                        if(income >= 2000000){
                                            return true;
                                        } else {
                                            Constantes.MSG = "Rechazado: No tienes suficiente capacidad de endeudamiento para el crédito";
                                            return false;
                                        }
                                    } else{
                                        Constantes.MSG = "Rechazado: Tú contrato no cumple con el periodo suficiente";
                                        return false;
                                    }
                                } else{
                                    if(income >= 2000000){
                                        return true;
                                    } else {
                                        Constantes.MSG = "Rechazado: No tienes suficiente capacidad de endeudamiento para el crédito";
                                        return false;
                                    }
                                }
                            }
                        } else {
                            Constantes.MSG = "Rechazado: No tienees la suficiente capacidad de endeudamiento";
                            return false;
                        }
                    } else{
                        Constantes.MSG = "Rechazado: No tienees la suficiente capacidad de endeudamiento";
                        return false;
                    }
            }
        }
         Constantes.MSG = "Rechazado: No tienees la suficiente capacidad de endeudamiento";
         return false;
    }
}
