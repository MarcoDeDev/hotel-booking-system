package com.marcod.hotelbookingsystem.backend.repository;

import com.marcod.hotelbookingsystem.backend.model.Hotel;
import com.marcod.hotelbookingsystem.backend.model.Room;
import com.marcod.hotelbookingsystem.backend.model.RoomStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> findByHotelAndRoomStatus(Hotel hotel, RoomStatus roomStatus);
}
