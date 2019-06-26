package com.sda.tallinn4.practicalproject.repository;

import com.sda.tallinn4.practicalproject.model.Cargo;
import com.sda.tallinn4.practicalproject.model.Pending;
import com.sun.image.codec.jpeg.JPEGDecodeParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PendingRepository extends JpaRepository<Pending, Long> {


}
