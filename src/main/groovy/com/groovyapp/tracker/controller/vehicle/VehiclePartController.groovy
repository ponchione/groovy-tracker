package com.groovyapp.tracker.controller.vehicle

import com.groovyapp.tracker.DTO.VehiclePartDTO
import com.groovyapp.tracker.controller.BaseController
import com.groovyapp.tracker.service.VehiclePartService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class VehiclePartController extends BaseController {

    @Autowired
    private final VehiclePartService service

    @GetMapping("/all")
    List<VehiclePartDTO> getAllParts() {
        service.allParts //property? what?
    }

    @GetMapping("part/{id}")
    VehiclePartDTO getPartByID(@PathVariable long id){
        service.getPartByID(id)
    }

    @GetMapping("parts/{vehicle}")
    List<VehiclePartDTO> getPartsByVehicle(@PathVariable String vehicle) {
        service.getPartsByVehicle(vehicle)
    }

    @PostMapping("/add")
    void addPart(@RequestBody VehiclePartDTO partDTO) {
        service.addPart(partDTO)
    }

    @PostMapping("/add/bulk")
    void addParts(@RequestBody List<VehiclePartDTO> dtoList) {
       service.addParts(dtoList)
    }
}
