package com.marcod.hotelbookingsystem.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(uniqueConstraints = { // Zimmernummer müssen eindeutig für jedes Hotel
        @UniqueConstraint(columnNames = {"hotel_id", "room_number"})
})
public class Room {

    @Id // (jakarta.persistence) als PRIMARY KEY zugewiesen
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTOINCREMENT
    private long id;

    @ManyToOne // Viele Zimmer gehören zu einem Hotel
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    private String roomNumber;
    @Enumerated(EnumType.STRING)
    private RoomType roomType;
    @Enumerated(EnumType.STRING)
    private RoomStatus roomStatus;
    private double pricePerNight;


    public Room(Hotel hotel, String roomNumber, RoomType roomType, double pricePerNight) {
        this.hotel = hotel;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;;
    }

    public Room(Hotel hotel, String roomNumber, RoomStatus roomStatus) {
        this.hotel = hotel;
        this.roomNumber = roomNumber;
        this.roomStatus = roomStatus;
    }
}
