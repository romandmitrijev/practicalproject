package com.sda.tallinn4.practicalproject.repository;

import com.sda.tallinn4.practicalproject.model.Cargo;
import com.sda.tallinn4.practicalproject.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CountyRepository extends JpaRepository<Country, Long> {
}
