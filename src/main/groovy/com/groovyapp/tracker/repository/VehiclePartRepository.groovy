package com.groovyapp.tracker.repository


import com.groovyapp.tracker.model.VehiclePart
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VehiclePartRepository extends JpaRepository<VehiclePart, Long> {
}
