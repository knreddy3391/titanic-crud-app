package com.container.solutions.rest;

import java.io.Console;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.container.solutions.entity.Passenger;
import com.container.solutions.repository.PassengerRepository;

@RequestMapping("TitanicPassengers")
@RestController
public class PassengerRestController {
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@GetMapping(value="/getPassengers")
	public ResponseEntity<List<Passenger>> getPassengers(){
		List<Passenger> passengers=passengerRepository.findAll();
		return new ResponseEntity<>(passengers,HttpStatus.OK);
	}
	
	@PostMapping(value="/addPassenger",consumes="application/json")
	public ResponseEntity<HttpStatus> addPassenger(@RequestBody Passenger passenger){
		Integer i=(int) (passengerRepository.count()+1);
		passenger.setId(i);
		System.out.println(passenger);
		passengerRepository.save(passenger);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping(value="/updatePassenger",consumes="application/json")
	public ResponseEntity<HttpStatus> updatePassenger(@RequestBody Passenger passenger){
		
		passengerRepository.save(passenger);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	@DeleteMapping(value="/removePassenger",consumes="application/json")
	public ResponseEntity<HttpStatus> removePassenger(@RequestBody Integer id){
		passengerRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping(value="/getPassenger")
	public ResponseEntity<Passenger> getUserById(@RequestParam Integer id) {
		Optional<Passenger> p=passengerRepository.findById(id);
		Passenger passenger = null;
		if(p.isPresent()) {
			passenger=p.get();
		}
		return new ResponseEntity<>(passenger,HttpStatus.OK);
	}
	
}
