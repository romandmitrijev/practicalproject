package com.sda.tallinn4.practicalproject.service;

import com.sda.tallinn4.practicalproject.model.Pending;
import com.sda.tallinn4.practicalproject.model.Shipment;
import com.sda.tallinn4.practicalproject.repository.PendingRepository;
import com.sda.tallinn4.practicalproject.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentService {

    @Autowired
    ShipmentRepository shipmentRepository;

    public List<Shipment> findAll() {
        return shipmentRepository.findAll();
    }

    public void addNewShipment(Shipment shipment){//
        shipmentRepository.save(shipment);
    }
}
