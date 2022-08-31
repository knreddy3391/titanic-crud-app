package com.container.solutions.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.container.solutions.entity.Passenger;


public interface PassengerRepository  extends JpaRepository < Passenger ,Integer>{

}
