package com.marcod.hotebookinglsystem.hotel_booking_system.service;

import com.marcod.hotebookinglsystem.hotel_booking_system.exception.ResourceNotFoundException;
import com.marcod.hotebookinglsystem.hotel_booking_system.model.Hotel;
import com.marcod.hotebookinglsystem.hotel_booking_system.model.Room;
import com.marcod.hotebookinglsystem.hotel_booking_system.model.RoomStatus;
import com.marcod.hotebookinglsystem.hotel_booking_system.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService{

    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public Room save(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room getRoomById(long id) {

        return roomRepository.findById(id)
                             .orElseThrow(() -> new ResourceNotFoundException("Room with id: " + id + " not found!"));
    }

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public void deleteRoomById(long id) {

        if (!roomRepository.existsById(id)) {
            throw new ResourceNotFoundException("Room with id: " + id + " not found!");
        }
        roomRepository.deleteById(id);
    }

    @Override
    public List<Room> findAvailableRooms(Hotel hotel) {
         return roomRepository.findByHotelAndRoomStatus(hotel, RoomStatus.AVAILABLE);
    }
}
