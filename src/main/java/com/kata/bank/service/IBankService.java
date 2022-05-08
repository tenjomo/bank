package com.kata.bank.service;

import com.kata.bank.entities.Operation;

import java.util.List;

public interface IBankService {

    public void deposit(double amount);
    public void withdrawal(double amount);
    public List<Operation> listOperation();
    public void deleteOperations();
}