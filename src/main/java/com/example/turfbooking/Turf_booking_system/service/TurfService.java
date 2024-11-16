package com.example.turfbooking.Turf_booking_system.service;

import com.example.turfbooking.Turf_booking_system.model.Turf;
import com.example.turfbooking.Turf_booking_system.repository.TurfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurfService {

    @Autowired
    private TurfRepository turfRepository;

    public List<Turf> getAllTurfs() {
        return turfRepository.findAll();
    }

    public Optional<Turf> getTurfById(Long id) {
        return turfRepository.findById(id);
    }

    public Turf createTurf(Turf turf) {
        return turfRepository.save(turf);
    }

    public boolean deleteTurf(Long id) {
        if (turfRepository.existsById(id)) {
            turfRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
