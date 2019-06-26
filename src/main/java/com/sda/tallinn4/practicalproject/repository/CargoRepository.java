package com.sda.tallinn4.practicalproject.repository;

import com.sda.tallinn4.practicalproject.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {

    List<Cargo> findAllByCargoDescription(String name);

    List<Cargo> findAllByLoadingPlace(String name);

    List<Cargo> findAllByDischargingPlace(String name);

    List<Cargo> findAllByCargoWeight(Integer name);

}
