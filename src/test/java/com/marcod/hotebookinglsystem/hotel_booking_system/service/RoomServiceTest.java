package com.marcod.hotebookinglsystem.hotel_booking_system.service;

import com.marcod.hotebookinglsystem.hotel_booking_system.model.Hotel;
import com.marcod.hotebookinglsystem.hotel_booking_system.model.Room;
import com.marcod.hotebookinglsystem.hotel_booking_system.model.RoomStatus;
import com.marcod.hotebookinglsystem.hotel_booking_system.repository.HotelRepository;
import com.marcod.hotebookinglsystem.hotel_booking_system.repository.RoomRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@SpringBootTest         // Teilt Spring mit, einen Spring Boot Testkontext zu laden
@ActiveProfiles("test") // Aktiviert das "test"-Profil und lädt application-test.properties
@Transactional          // Sorgt dafür, dass jeder Test in einer Transaktion läuft und diese danach zurückgerollt wird
class RoomServiceTest {

    @Autowired
    RoomService roomService;

    @Autowired
    RoomRepository roomRepository;
    @Autowired
    HotelRepository hotelRepository;

    private Hotel testHotel; // TestHotel, das in allen Tests zugreifbar ist
    private Room availableRoom1; // TestRoom, die in allen Tests zugreifbar sind
    private Room availableRoom2;
    private Room occupiedRoom;

    @BeforeEach
    void setUp() {
        roomRepository.deleteAll(); // Immer zuerst Zimmer löschen, da sie von Hotel abhängen
        hotelRepository.deleteAll(); // Dann Hotels löschen

        // Erstelle ein Hotel, da Zimmer ein Hotel benötigen
        testHotel = new Hotel("Test Hotel");
        hotelRepository.save(testHotel);

        availableRoom1 = new Room(testHotel, "101", RoomStatus.AVAILABLE);
        availableRoom2 = new Room(testHotel, "103", RoomStatus.AVAILABLE);
        occupiedRoom = new Room(testHotel, "102", RoomStatus.OCCUPIED);

        roomRepository.save(availableRoom1);
        roomRepository.save(availableRoom2);
        roomRepository.save(occupiedRoom);
    }

    @Test
    void save() {

        Room r1 = new Room();
        System.out.println(roomService.save(r1));

    }

    @Test
    void getRoomById() {
    }

    @Test
    void getAllRooms() {
    }

    @Test
    void deleteRoomById() {
    }


    @Test
    void findAvailableRooms() {

        List<Room> availableRooms = roomService.findAvailableRooms(testHotel);

        System.out.println(availableRooms);

    }
}