package com.groovyapp.tracker.service.impl

import com.groovyapp.tracker.DTO.VehiclePartDTO
import com.groovyapp.tracker.repository.VehiclePartRepository
import com.groovyapp.tracker.service.VehiclePartService
import com.groovyapp.tracker.util.VehiclePartMappingUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class VehiclePartServiceImpl implements VehiclePartService {

    private static mapper = new VehiclePartMappingUtil()

    @Autowired
    private VehiclePartRepository repository

    @Override
    List<VehiclePartDTO> getAllParts() {
        mapper.map(repository.findAll()) as List<VehiclePartDTO>
    }

    @Override
    VehiclePartDTO getPartByID(long id) {
        mapper.map(repository.findById(id)) as VehiclePartDTO
    }

    @Override
    void addPart(VehiclePartDTO partDTO) {
        repository.save(mapper.mapToPart(partDTO))
    }

    @Override
    void addParts(List<VehiclePartDTO> parts) {
        repository.saveAll(mapper.mapToPartList(parts))
    }

}
