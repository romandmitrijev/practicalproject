package com.sda.tallinn4.practicalproject.repository;

import com.sda.tallinn4.practicalproject.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}