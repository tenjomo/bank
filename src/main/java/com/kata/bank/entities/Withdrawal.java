package com.kata.bank.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("W")
public class Withdrawal extends Operation{

    public Withdrawal(Date dateOperation, double amount) {
        super(dateOperation, amount);

    }

    public Withdrawal() {
        super();

    }

}
