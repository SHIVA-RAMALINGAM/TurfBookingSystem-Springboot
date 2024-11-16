package com.example.turfbooking.Turf_booking_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "turfbookingdb")
public class Turf {  // Capitalized class name

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Changed to Long for better compatibility with JPA

    private String name;
    private String location;
    private int capacity;

    // Default constructor (required by JPA)
    public Turf() {}

    // Parameterized constructor (optional, for convenience)
    public Turf(Long id, String name, String location, int capacity) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
