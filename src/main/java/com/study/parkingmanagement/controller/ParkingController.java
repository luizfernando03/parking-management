package com.study.parkingmanagement.controller;

import com.study.parkingmanagement.repository.ParkingRepository;
import com.study.parkingmanagement.service.ParkingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/parking")
public class ParkingController {

    final ParkingService parkingService;

    
}
