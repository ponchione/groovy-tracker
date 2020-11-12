package com.groovyapp.tracker.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "Parts")
class VehiclePart {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id

    @Column(name = "vehicle")
    String vehicle

    @Column(name = "part")
    String partName

    @Column(name = "type")
    String partType

    @Column(name = "price")
    BigDecimal price

    @Column(name = "link")
    String url
}
