package com.marcod.hotelbookingsystem.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Hotel {

    @Id // (jakarta.persistence) als PRIMARY KEY zugewiesen
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTOINCREMENT
    private long id;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true) // Ein Hotel hat viele Zimmer
    private Set<Room> rooms = new HashSet<>();

    private String hotelName;
    private String city;
    private String country;


    public Hotel (String hotelName) {

        this.hotelName = hotelName;
    }


}
