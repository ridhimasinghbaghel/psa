package com.example.controller;


import com.example.entity.Stop;
import com.example.repository.BusRepository;
import com.example.repository.StopRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/stops")
public class StopController {

    private StopRepository stopRepository;


    public StopController(StopRepository stopRepository) {
        this.stopRepository = stopRepository;

    }
    //http://localhost:8080/api/v1/stops
    @PostMapping
    public ResponseEntity<Stop> allocateStop(
            @RequestBody Stop stop

    ){
        Stop stop1 = stopRepository.save(stop);

            return new ResponseEntity<>(stop1, HttpStatus.CREATED);
    }
}
