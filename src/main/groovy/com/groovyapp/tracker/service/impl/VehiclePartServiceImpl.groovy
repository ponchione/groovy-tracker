package com.groovyapp.tracker.service.impl

import com.groovyapp.tracker.DTO.VehiclePartDTO
import com.groovyapp.tracker.model.VehiclePart
import com.groovyapp.tracker.repository.VehiclePartRepository
import com.groovyapp.tracker.service.VehiclePartService
import com.groovyapp.tracker.util.VehiclePartMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class VehiclePartServiceImpl implements VehiclePartMapping, VehiclePartService {

    @Autowired
    private VehiclePartRepository repository

    @Override
    List<VehiclePartDTO> getAllParts() {
        map(repository.findAll()) as List<VehiclePartDTO>
    }

    @Override
    VehiclePartDTO getPartByID(long id) {
        map(repository.findById(id)
                .orElseThrow(
                { ->
                    PartNotFoundException("Part could not be found for ID: " + id)
                }
            )
        ) as VehiclePartDTO
    }

    @Override
    void addPart(VehiclePartDTO partDTO) {
        repository.save(map(partDTO) as VehiclePart)
    }

    @Override
    void addParts(List<VehiclePartDTO> parts) {
        repository.saveAll(map(parts) as List<VehiclePart>)
    }


    //TODO not sure why I have to cast everything after it comes out of the mapper...

}
