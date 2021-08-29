package com.loan.models;

public class Data {
    private int age;
    private String card;
    private String typeContract;
    private int month;
    private String typeProperty;
    private double value;
    private String contact;
    private double quota;
    private double amount;
    private int term;
    private double initial;
    private String typeCredit;
    private double income;
    private double expenses;
    private double paymant;
    private double capacity;
    private double capacityS;

    public Data(int age, String card, String typeContract, int month, String typeProperty, double value, String contact, double quota, double amount, int term, double initial, String typeCredit, double income, double expenses, double paymant, double capacity, double capacityS) {
        this.age = age;
        this.card = card;
        this.typeContract = typeContract;
        this.month = month;
        this.typeProperty = typeProperty;
        this.value = value;
        this.contact = contact;
        this.quota = quota;
        this.amount = amount;
        this.term = term;
        this.initial = initial;
        this.typeCredit = typeCredit;
        this.income = income;
        this.expenses = expenses;
        this.paymant = paymant;
        this.capacity = capacity;
        this.capacityS = capacityS;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getTypeContract() {
        return typeContract;
    }

    public void setTypeContract(String typeContract) {
        this.typeContract = typeContract;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getTypeProperty() {
        return typeProperty;
    }

    public void setTypeProperty(String typeProperty) {
        this.typeProperty = typeProperty;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getQuota() {
        return quota;
    }

    public void setQuota(double quota) {
        this.quota = quota;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double getInitial() {
        return initial;
    }

    public void setInitial(double initial) {
        this.initial = initial;
    }

    public String getTypeCredit() {
        return typeCredit;
    }

    public void setTypeCredit(String typeCredit) {
        this.typeCredit = typeCredit;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public double getPaymant() {
        return paymant;
    }

    public void setPaymant(double paymant) {
        this.paymant = paymant;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacityS() {
        return capacityS;
    }

    public void setCapacityS(double capacityS) {
        this.capacityS = capacityS;
    }
}
