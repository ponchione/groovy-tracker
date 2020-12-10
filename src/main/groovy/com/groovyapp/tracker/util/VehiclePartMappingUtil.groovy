package com.groovyapp.tracker.util

import com.groovyapp.tracker.DTO.VehiclePartDTO
import com.groovyapp.tracker.model.VehiclePart

//TODO make this more stream lined
class VehiclePartMappingUtil {

    static def mapToPartDTO(incoming) {
        newPartDTO(incoming)
    }

    static def mapToPart(incoming) {
        newPart(incoming)
    }

    static def mapToPartList(incoming) {
        List<VehiclePart> partList = new ArrayList<>()

        incoming.each {
            partList << newPart(it)
        }

        partList
    }

    static def mapToPartDtoList(incoming) {
        List<VehiclePartDTO> dtoList = new ArrayList<>()

        incoming.each {
            dtoList << newPartDTO(it)
        }

        dtoList
    }

    static def newPartDTO(part) {
        new VehiclePartDTO(
                id: part.id as long,
                vehicle: part.vehicle,
                partName: part.partName,
                partType: part.partType,
                price: new BigDecimal(part.price.toString()),
                url: part.url
        )
    }

    static def newPart(part) {
        new VehiclePart(
                vehicle: part.vehicle,
                partName: part.partName,
                partType: part.partType,
                price: new BigDecimal(part.price.toString()),
                url: part.url
        )
    }

}//END Trait