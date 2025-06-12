package com.marcod.hotebookinglsystem.hotel_booking_system.repository;

import com.marcod.hotebookinglsystem.hotel_booking_system.model.Hotel;
import com.marcod.hotebookinglsystem.hotel_booking_system.model.Room;
import com.marcod.hotebookinglsystem.hotel_booking_system.model.RoomStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> findByHotelAndRoomStatus(Hotel hotel, RoomStatus roomStatus);
}
