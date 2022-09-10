package com.container.solutions;

import java.util.ArrayList;
import java.util.List;

import org.junit.gen5.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.container.solutions.entity.Passenger;
import com.container.solutions.rest.PassengerRestController;

@SpringBootTest
public class PassengerRestControllerTests {
	@Mock
	PassengerRestController passengerRestController;
	
	@Test
	void getPassengerTest_whenCalled_ReturnListOfPassengers() {
		List<Passenger> passengers=new ArrayList<>();
		Mockito.when(passengerRestController.getPassengers()).thenReturn(new ResponseEntity<>(passengers,HttpStatus.OK));
	} 
	
	@Test
	void addPassengerTest_whenCalled_ReturnHttpStatusOk() {
		Mockito.when(passengerRestController.addPassenger(null)).thenReturn(new ResponseEntity<>(HttpStatus.OK));
	}
	
}
