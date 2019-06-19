package com.sda.tallinn4.practicalproject.repository;

import com.sda.tallinn4.practicalproject.model.Cargo;
import com.sda.tallinn4.practicalproject.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> findAllByVehicleLocation(String name);

    List<Vehicle> findAllByCapacity(Integer size);

    List<Vehicle> findAllByDeliveryArea(String area);

}
