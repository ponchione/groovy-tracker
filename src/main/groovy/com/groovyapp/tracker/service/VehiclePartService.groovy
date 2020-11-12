package com.groovyapp.tracker.service

import com.groovyapp.tracker.DTO.VehiclePartDTO

interface VehiclePartService {
    List<VehiclePartDTO> getAllParts()
    VehiclePartDTO getPartByID(long id)
}