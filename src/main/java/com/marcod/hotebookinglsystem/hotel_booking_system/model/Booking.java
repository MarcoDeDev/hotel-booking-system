package com.marcod.hotebookinglsystem.hotel_booking_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Booking {

    @Id // (jakarta.persistence) als PRIMARY KEY zugewiesen
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTOINCREMENT
    private long id;

    @ManyToOne // Viele Buchungen können auf ein Zimmer verweisen
    @JoinColumn(name = "room_id", nullable = false) // Fremdschlüssel Spalte
    private Room room;

    @ManyToOne // Viele Buchungen können von einem Kunden gemacht werden
    @JoinColumn(name = "customer_id", nullable = false) // Fremdschlüssel Spalte
    private Customer customer;

    private LocalDate checkInDatum;
    private LocalDate checkOutDatum;
    private BookingStatus status;
    private double totalPrice;


}
