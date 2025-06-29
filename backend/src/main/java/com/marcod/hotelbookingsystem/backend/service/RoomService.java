package com.marcod.hotelbookingsystem.backend.service;

import com.marcod.hotelbookingsystem.backend.model.Hotel;
import com.marcod.hotelbookingsystem.backend.model.Room;

import java.util.List;

public interface RoomService {

    Room save (Room room);

    Room getRoomById(long id);

    List<Room> getAllRooms();

    void deleteRoomById(long id);

    List<Room> findAvailableRooms(Hotel hotel);
}
