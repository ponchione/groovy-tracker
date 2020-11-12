package com.groovyapp.tracker.service.impl

import com.groovyapp.tracker.DTO.VehiclePartDTO
import com.groovyapp.tracker.repository.VehiclePartRepository
import com.groovyapp.tracker.service.VehiclePartService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class VehiclePartServiceImpl implements VehiclePartService{

    @Autowired
    private final VehiclePartRepository repository

    @Override
    List<VehiclePartDTO> getAllParts() {
        repository.findAll()
    }
}
