package com.groovyapp.tracker.DTO

import com.fasterxml.jackson.annotation.JsonProperty

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Positive


class VehiclePartDTO {

//    @NotEmpty
//    @NotBlank
    @JsonProperty(required = false)
    long id

    @NotEmpty
    @NotBlank
    @JsonProperty(required = true)
    String vehicle

    @NotEmpty
    @NotBlank
    @JsonProperty(required = true)
    String partName

    @NotEmpty
    @NotBlank
    @JsonProperty(required = true)
    String partType

    @NotEmpty
    @NotBlank
    @Positive
    @JsonProperty(required = true)
    BigDecimal price

    @NotEmpty
    @NotBlank
    @JsonProperty(required = true)
    String url
}
