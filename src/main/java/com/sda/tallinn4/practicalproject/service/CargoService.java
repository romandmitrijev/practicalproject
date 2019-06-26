package com.sda.tallinn4.practicalproject.service;

import com.sda.tallinn4.practicalproject.model.Cargo;
import com.sda.tallinn4.practicalproject.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class CargoService {

    @Autowired
    CargoRepository cargoRepository;

    public List<Cargo> findAll() {
        return cargoRepository.findAll();
    }

    public List<Cargo> findAllBySearchCriteria( String name, String criteria) {
        switch (criteria) {
            case "LoadingPlace":
                return findAllByLoadingPlace(name);
            case "DischargingPlace":
                return findAllByDischargingPlace(name);
            case "CargoDescription":
                return findAllByCargoDescription(name);
            case "CargoWeight":
                return findAllByCargoWeight(Integer.parseInt(name));
            default:
                return findAll();
        }
    }

    public List<Cargo> findAllByLoadingPlace( String name) {
        return cargoRepository.findAllByLoadingPlace(name);
    }

    public List<Cargo> findAllByDischargingPlace ( String name){
        return cargoRepository.findAllByDischargingPlace(name);
    }

    public List<Cargo> findAllByCargoDescription (String name){
        return cargoRepository.findAllByCargoDescription(name);
    }

    public List<Cargo> findAllByCargoWeight (Integer name){
        return cargoRepository.findAllByCargoWeight(name);
    }

    public void deleteCargo (Cargo cargo){
        cargoRepository.delete(cargo);
    }

    public String addNewCargo(Cargo cargo){//
        cargoRepository.save(cargo);
        return "/html/addcargo";
    }


    public void deleteById(Long id) {cargoRepository.deleteById(id);
    }
}
