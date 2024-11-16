package com.example.turfbooking.Turf_booking_system.controller;

import com.example.turfbooking.Turf_booking_system.model.Turf;
import com.example.turfbooking.Turf_booking_system.service.TurfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/turfs")
public class TurfController {

    @Autowired
    private TurfService turfService;

    // Get all turfs
    @GetMapping
    public List<Turf> getAllTurfs() {
        return turfService.getAllTurfs();
    }

    // Get a turf by ID
    @GetMapping("/{id}")
    public ResponseEntity<Turf> getTurfById(@PathVariable Long id) {
        Optional<Turf> turf = turfService.getTurfById(id);
        return turf.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create a new turf
    @PostMapping
    public ResponseEntity<Turf> createTurf(@RequestBody Turf turf) {
        Turf createdTurf = turfService.createTurf(turf);
        return ResponseEntity.ok(createdTurf);
    }

    // Delete a turf by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTurf(@PathVariable Long id) {
        boolean isDeleted = turfService.deleteTurf(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
