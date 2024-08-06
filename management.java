import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Hotel {
    private List<Room> rooms;
    private List<Reservation> reservations;

    public Hotel() {
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room findRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    public void makeReservation(Reservation reservation) {
        if (reservation.getRoom().isAvailable()) {
            reservations.add(reservation);
            reservation.getRoom().setAvailability(false);
            System.out.println("Reservation successful.");
        } else {
            System.out.println("Room is not available.");
        }
    }

    public void checkIn(int reservationId) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationId() == reservationId) {
                if (!reservation.getRoom().isAvailable()) {
                    reservation.getRoom().setAvailability(false);
                    System.out.println("Check-in successful.");
                } else {
                    System.out.println("Room is already occupied.");
                }
                return;
            }
        }
        System.out.println("Reservation not found.");
    }

    public void checkOut(int reservationId) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationId() == reservationId) {
                if (!reservation.getRoom().isAvailable()) {
                    reservation.getRoom().setAvailability(true);
                    System.out.println("Check-out successful.");
                } else {
                    System.out.println("Room is already vacant.");
                }
                return;
            }
        }
        System.out.println("Reservation not found.");
    }
}

class Room {
    private int roomNumber;
    private String type;
    private double price;
    private boolean isAvailable;

    public Room(int roomNumber, String type, double price, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getDetails() {
        return "Room Number: " + roomNumber + ", Type: " + type + ", Price: " + price + ", Available: " + isAvailable;
    }
}

class Guest {
    private String name;
    private String guestId;
    private String contactInfo;

    public Guest(String name, String guestId, String contactInfo) {
        this.name = name;
        this.guestId = guestId;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getGuestId() {
        return guestId;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getDetails() {
        return "Name: " + name + ", Guest ID: " + guestId + ", Contact Info: " + contactInfo;
    }
}

class Reservation {
    private int reservationId;
    private Room room;
    private Guest guest;
    private Date checkInDate;
    private Date checkOutDate;

    public Reservation(int reservationId, Room room, Guest guest, Date checkInDate, Date checkOutDate) {
        this.reservationId = reservationId;
        this.room = room;
        this.guest = guest;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public int getReservationId() {
        return reservationId;
    }

    public Room getRoom() {
        return room;
    }

    public Guest getGuest() {
        return guest;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public String getDetails() {
        return "Reservation ID: " + reservationId + ", Room: [" + room.getDetails() + "], Guest: [" + guest.getDetails() + "], Check-In Date: " + checkInDate + ", Check-Out Date: " + checkOutDate;
    }
}

public class management{
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Room room1 = new Room(101, "Single", 100.0, true);
        Room room2 = new Room(102, "Double", 150.0, true);
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        Guest guest1 = new Guest("John Doe", "G001", "123456789");
        Guest guest2 = new Guest("Jane Smith", "G002", "987654321");

      
        Reservation reservation1 = new Reservation(1, room1, guest1, new Date(2023 - 1900, 6, 10), new Date(2023 - 1900, 6, 15)); // Month is 0-based
        Reservation reservation2 = new Reservation(2, room2, guest2, new Date(2023 - 1900, 6, 11), new Date(2023 - 1900, 6, 14));
        hotel.makeReservation(reservation1);
        hotel.makeReservation(reservation2);


        hotel.checkIn(1);
        hotel.checkIn(2);


        hotel.checkOut(1);
        hotel.checkOut(2);
    }
}
