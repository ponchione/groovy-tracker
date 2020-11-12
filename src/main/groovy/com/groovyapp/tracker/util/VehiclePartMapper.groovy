package com.groovyapp.tracker.util

import com.groovyapp.tracker.DTO.VehiclePartDTO
import com.groovyapp.tracker.model.VehiclePart

class VehiclePartMapper {

    static def mapToPartDto(VehiclePart part) {
        new VehiclePartDTO(
                id: part.id as long,
                vehicle: part.vehicle,
                partName: part.partName,
                partType: part.partType,
                price: new BigDecimal(part.price.toString()),
                url: part.url
        )
    }

    static def mapToPartDtoList(List<VehiclePart> parts) {
        List<VehiclePartDTO> dtoList = new ArrayList<>()

        for (part in parts) {
            dtoList << mapToPartDto(part)
        }

        parts
    }

}
