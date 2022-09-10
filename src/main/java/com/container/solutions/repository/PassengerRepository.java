package com.container.solutions.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.container.solutions.entity.Passenger;


@Repository
public interface PassengerRepository  extends JpaRepository < Passenger ,Integer>{

}
