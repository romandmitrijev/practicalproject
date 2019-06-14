package com.sda.tallinn4.practicalproject.search.repository;

import com.sda.tallinn4.practicalproject.search.model.Cargo;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<Cargo, Long> {
}
