package com.sda.tallinn4.practicalproject.repository;

import com.sda.tallinn4.practicalproject.model.Cargo;
import org.springframework.data.repository.CrudRepository;

public interface ShipmentRepository extends CrudRepository<Cargo, Long> {
}