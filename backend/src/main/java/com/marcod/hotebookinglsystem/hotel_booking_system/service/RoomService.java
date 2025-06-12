package com.marcod.hotebookinglsystem.hotel_booking_system.service;

import com.marcod.hotebookinglsystem.hotel_booking_system.model.Hotel;
import com.marcod.hotebookinglsystem.hotel_booking_system.model.Room;

import java.util.List;
import java.util.Optional;

public interface RoomService {

    Room save (Room room);

    Room getRoomById(long id);

    List<Room> getAllRooms();

    void deleteRoomById(long id);

    List<Room> findAvailableRooms(Hotel hotel);
}
