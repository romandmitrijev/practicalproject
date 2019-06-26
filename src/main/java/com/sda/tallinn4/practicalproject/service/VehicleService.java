package com.sda.tallinn4.practicalproject.service;

import com.sda.tallinn4.practicalproject.model.User;
import com.sda.tallinn4.practicalproject.model.Vehicle;
import com.sda.tallinn4.practicalproject.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public List<Vehicle> findAll(){
        return vehicleRepository.findAll();
    }

    public List<Vehicle> findAllBySearchCriteria( String name, String criteria) {
        switch (criteria) {
            case "Owner":
                return findAllByUser(name);
            case "LoadingPlace":
                return findAllByVehicleLocation(name);
            case "PreferredDeliveryPlace":
                return findAllByDeliveryArea(name);
            case "ContainerType":
                return findAllByCapacity(Integer.parseInt(name));
            default:
                return findAll();
        }
    }

    public List<Vehicle> findAllByUser(String name) {
        return vehicleRepository.findAllByUserUserName(name);
    }


    public List<Vehicle> findAllByVehicleLocation (String name){
        return vehicleRepository.findAllByVehicleLocation(name);
    }

    public List<Vehicle> findAllByCapacity (Integer capacity){
        return vehicleRepository.findAllByCapacity(capacity);
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
