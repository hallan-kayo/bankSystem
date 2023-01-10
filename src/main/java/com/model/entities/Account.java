package com.model.entities;

import com.model.exceptions.AccountExceptions;

public class Account{
    
    private Integer number; //número da conta
    private String holder; //Titular da conta
    private Double balance; // Saldo da conta
    private Double withDrawLimit; // Limite de saque

    public Account(Integer number, String holder, Double balance, Double withDrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void setWithDrawLimit(Double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }
    
    public void deposit(Double amount){ //depositar valor
        this.balance += amount;
    }
    
    public void withDraw( Double amount) throws AccountExceptions{ //sacar valor
        
        if(amount > this.balance){
            //acionar exceção
            throw new AccountExceptions("insufficient funds.");
        }
        
        if(amount > this.withDrawLimit){
            throw new AccountExceptions("insufficient withdrawal limit.");
        }
        
        this.balance -= amount;
        
    }
}