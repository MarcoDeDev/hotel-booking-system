# Hotel Booking System mit Spring JPA
## Version0.1

* mit RestAPI

### Konfiguration
* resources/application.properties

### Entity/Model
* model.Hotel
* model.Zimmer
* model.Kunde
* model.Buchung

### Repository (Interface)
* repository.HotelRepository
* repository.RoomRepository
* repository.CustomerRepository
* repository.BookingRepository

### Service (Interface) - CRUD - Operationen
* service.HotelService
* service.RoomService
* service.CustomerService
* service.BookingService
 
### ServiceImpl - CRUD - Operationen
* service.HotelServiceImpl
* service.RoomServiceImpl
* service.CustomerServiceImpl
* service.BookingServiceImpl

### Controller
* controller.Hotel
* controller.Room
* controller.Customer
* controller.Booking

### Testumgebung 
* application-test.proprieties
* HotelServiceTest (teilweise)
* RoomServiceTest (teilweise)

### exception Package
* ResourceNotFoundException
* implementiert beim deleteById()
* implementiert beim  getById()

#### TODO
- Klassenspezifische methoden schreiben

*  Hotel:
*  Zimmerbelegung 

* Room
* getAllRoomsByHotel(oder HotelId)

* Booking:
* Zimmerverfügbarkeit prüfen
* Kostenvorschlag
* getAllBookingsByKunde(oder KundeId)



- Frontend mit javaFX
- Testen (auch zwischendürch)



### Test


### Service