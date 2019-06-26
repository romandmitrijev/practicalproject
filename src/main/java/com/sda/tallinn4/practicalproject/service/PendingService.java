package com.sda.tallinn4.practicalproject.service;

import com.sda.tallinn4.practicalproject.model.Cargo;
import com.sda.tallinn4.practicalproject.model.Pending;
import com.sda.tallinn4.practicalproject.repository.PendingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class PendingService {

    @Autowired
    PendingRepository pendingRepository;

    public List<Pending> findAll() {
        return pendingRepository.findAll();
    }

    public void addNewPending(Pending pending){//
        pendingRepository.save(pending);
    }
}
