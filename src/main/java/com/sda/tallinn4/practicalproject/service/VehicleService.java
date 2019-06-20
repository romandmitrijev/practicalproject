package com.sda.tallinn4.practicalproject.service;

import com.sda.tallinn4.practicalproject.model.Vehicle;
import com.sda.tallinn4.practicalproject.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public Iterable<Vehicle> findAll(){
        return vehicleRepository.findAll();
    }

    public List<Vehicle> findAllByVehicleLocation (String name){
        return vehicleRepository.findAllByVehicleLocation(name);
    }

    public List<Vehicle> findAllByCapacity (Integer size){
        return vehicleRepository.findAllByCapacity(size);
    }

    public List<Vehicle> findAllByDeliveryArea (String area){
        return vehicleRepository.findAllByDeliveryArea(area);
    }
    public void deleteVehicle (Vehicle vehicle){
        vehicleRepository.delete(vehicle);
    }

    public String addNewVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
        return "addvehicle";
    }
}
