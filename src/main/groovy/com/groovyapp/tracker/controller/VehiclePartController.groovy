package com.groovyapp.tracker.controller

import com.groovyapp.tracker.DTO.VehiclePartDTO
import com.groovyapp.tracker.service.VehiclePartService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/app")
class VehiclePartController {

    @Autowired
    private final VehiclePartService service

    @GetMapping("/all")
    List<VehiclePartDTO> getAllParts() {
        service.getAllParts()
    }
}
