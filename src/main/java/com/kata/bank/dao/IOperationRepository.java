package com.kata.bank.dao;

import com.kata.bank.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IOperationRepository extends JpaRepository<Operation, Long> {

    @Query(" From Operation o order by o.dateOperation desc")
    public List<Operation> listOperation();

    @Modifying
    @Query("delete from Operation")
    public void deleteOperation();

}
