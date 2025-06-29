package com.marcod.hotelbookingsystem.backend.service;

import com.marcod.hotelbookingsystem.backend.model.Hotel;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest         // Teilt Spring mit, einen Spring Boot Testkontext zu laden
@ActiveProfiles("test") // Aktiviert das "test"-Profil und lädt application-test.properties
@Transactional          // Sorgt dafür, dass jeder Test in einer Transaktion läuft und diese danach zurückgerollt wird
class HotelServiceTest {

    @Autowired
    HotelService hotelService;

    @Test
    void save() {

        Hotel h1 = new Hotel("Hotel Test");

        System.out.println(hotelService.save(h1));

    }

    @Test
    void getHotelById() {

        Hotel h1 = new Hotel("Hotel Test");

        hotelService.save(h1);

        System.out.println(hotelService.getHotelById(1));
        //System.out.println(hotelService.getHotelById(2));
    }

    @Test
    void getAllHotels() {


    }

    @Test
    void deleteHotelById() {


    }
}