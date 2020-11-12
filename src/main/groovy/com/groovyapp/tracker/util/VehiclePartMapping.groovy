package com.groovyapp.tracker.util

import com.groovyapp.tracker.DTO.VehiclePartDTO
import com.groovyapp.tracker.model.VehiclePart

//TODO make this more stream lined
trait VehiclePartMapping {
    //Generic method to accept either incoming and calls appropriate method
    static def map(def incoming) {
        if (incoming instanceof VehiclePartDTO || incoming instanceof VehiclePart) {
            mapSingle(incoming)
        } else {
            mapList(incoming)
        }
    }

    static def mapSingle(part) {
        if (part instanceof VehiclePartDTO) {
            toPart(part)
        } else {
            toPartDto(part)
        }
    }

    static def mapList(parts) {
        if (parts instanceof List<VehiclePartDTO>) {
            toPartList(parts)
        } else {
            toPartDtoList(parts)
        }
    }

    static def toPart(part) {
        newPart(part) as VehiclePart
    }

    static def toPartDto(part) {
        newPart(part) as VehiclePartDTO
    }

    static def toPartList(parts) {
        List<VehiclePart> partList = new ArrayList<>()

        parts.each {
            partList << (newPart(it) as VehiclePart)
        }

        partList
    }

    static def toPartDtoList(parts) {
        List<VehiclePartDTO> dtoList = new ArrayList<>()

        parts.each {
            dtoList << newPart(it)
        }

        dtoList
    }

    static def newPart(part) {
        new VehiclePartDTO(
                id: part.id as long,
                vehicle: part.vehicle,
                partName: part.partName,
                partType: part.partType,
                price: new BigDecimal(part.price.toString()),
                url: part.url
        )
    }

}//END Trait