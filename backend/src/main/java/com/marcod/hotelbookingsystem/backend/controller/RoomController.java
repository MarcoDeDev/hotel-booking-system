package com.marcod.hotelbookingsystem.backend.controller;


import com.marcod.hotelbookingsystem.backend.model.Room;
import com.marcod.hotelbookingsystem.backend.service.RoomService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    private final RoomService roomService;


    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    // Standard Methode
    // localhost:8080/api/rooms
    @GetMapping
    public List<Room> getAllRooms () {
        return roomService.getAllRooms();
    }

    @GetMapping("/{id}")
    public Room getRoomById (@PathVariable("id") long id) {
        return roomService.getRoomById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201 No Content ist Standard für erfolgreiches Created
    public Room save (@RequestBody Room room) {
        return roomService.save(room);
    }

    @DeleteMapping("/{id}")
    public void deleteRoomById (@PathVariable("id") long id) {
        roomService.deleteRoomById(id);
    }

}
