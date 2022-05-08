package com.kata.bank.service;

import com.kata.bank.dao.IOperationRepository;
import com.kata.bank.entities.DepositTransfer;
import com.kata.bank.entities.Operation;
import com.kata.bank.entities.Withdrawal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

@Service
@Transactional
public class BankServiceImpl implements IBankService{

    @Autowired
    private IOperationRepository operationRepository;




    @Override
    public void deposit(double amount) {
        DepositTransfer v = new DepositTransfer(new Date(), amount);
        operationRepository.save(v);
    }

    @Override
    public void withdrawal(double amount) {
        Withdrawal r = new Withdrawal(new Date(), amount);
        operationRepository.save(r);

    }

    @Override
    public List<Operation> listOperation() {

        return operationRepository.listOperation();
    }

    @Override
    public void deleteOperations() {

        operationRepository.deleteOperation();
    }

}