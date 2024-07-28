package com.example.controller;


import com.example.entity.Bus;
import com.example.repository.BusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/buses")
public class BusController {

    private BusRepository busRepository;

    public BusController(BusRepository busRepository) {
        this.busRepository = busRepository;
    }
    @PostMapping
    public ResponseEntity<Bus> allocateBus(
            @RequestBody Bus bus){
        Bus savedbus = busRepository.save(bus);
        return new ResponseEntity<>(savedbus,HttpStatus.CREATED);

    }

}
