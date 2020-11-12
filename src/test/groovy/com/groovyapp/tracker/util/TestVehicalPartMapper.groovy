package com.groovyapp.tracker.util


import com.groovyapp.tracker.model.VehiclePart
import org.junit.jupiter.api.Test

class TestVehiclePartMapper {

    def mapper = new VehiclePartMapper()


    static VehiclePart createPart() {
        new VehiclePart(
                id: 7,
                vehicle: "BMW",
                partName: "tire",
                partType: "repair",
                price: new BigDecimal(20.00),
                url: "www.google.com"
        )
    }

    //TODO finish these
    @Test
    void testMapToPartDto() {
        def part = createPart()
        mapper.mapToPartDto(part)
    }

    @Test
    void testMapToPartDtoList() {
        def parts = new ArrayList<>()

        3.times {
            parts << createPart()
        }

        def parts2 = mapper.mapToPartDtoList(parts as List)
    }

}
