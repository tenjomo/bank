package com.kata.bank.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("D")
public class DepositTransfer extends Operation{

    public DepositTransfer() {
        super();

    }

    public DepositTransfer(Date dateOperation, double amount) {
        super(dateOperation, amount);

    }



}