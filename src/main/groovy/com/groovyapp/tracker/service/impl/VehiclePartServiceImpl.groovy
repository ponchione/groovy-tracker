package com.groovyapp.tracker.service.impl

import com.groovyapp.tracker.DTO.VehiclePartDTO
import com.groovyapp.tracker.repository.VehiclePartRepository
import com.groovyapp.tracker.service.VehiclePartService
import com.groovyapp.tracker.util.VehiclePartMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class VehiclePartServiceImpl implements VehiclePartMapping, VehiclePartService {

//    def mapper = new VehiclePartMapper()

    @Autowired
    private VehiclePartRepository repository

    @Override
    List<VehiclePartDTO> getAllParts() {
//        mapper.mapToPartDtoList()
        map(repository.findAll())
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

    void addPart(VehiclePartDTO partDTO) {
//        mapper.mapToPart(repository.save(partDTO))
    }



}
