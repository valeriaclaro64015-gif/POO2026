public class TestRoomReservation {

    public static void main(String[] args) {

        RoomReservation reservation = new RoomReservation();

        reservation.setGuest("Valeria");
        reservation.setRoomNumber(205);
        reservation.setNumberOfNights(3);
        reservation.setPricePerNight(180000);
        
        System.out.println("Guest: " + reservation.getGuest());
        System.out.println("Room number: " + reservation.getRoomNumber());
        System.out.println("Number of nights: " + reservation.getNumberOfNights());
        System.out.println("Price per night: $" + reservation.getPricePerNight());
        System.out.println("Total cost: $" + reservation.getTotalCost());

        boolean result = reservation.setGuest("Maria");
        if (result) {
            System.out.println("Guest modification accepted.");
        } else {
            System.out.println("Guest modification rejected.");
        }
        result = reservation.setNumberOfNights(5);
        if (result) {
            System.out.println("Number of nights modification accepted.");
        } else {
            System.out.println("Number of nights modification rejected.");
        }
        result = reservation.setPricePerNight(200000);
        if (result) {
            System.out.println("Price modification accepted.");
        } else {
            System.out.println("Price modification rejected.");
        }
        System.out.println("Updated guest: " + reservation.getGuest());
        System.out.println("Updated nights: " + reservation.getNumberOfNights());
        System.out.println("Updated price per night: $" + reservation.getPricePerNight());
        System.out.println("Updated total cost: $" + reservation.getTotalCost());
        result = reservation.setGuest("");
        if (result) {
            System.out.println("Guest modification accepted.");
        } else {
            System.out.println("Guest modification rejected.");
        }
        result = reservation.setNumberOfNights(0);

        if (result) {
            System.out.println("Number of nights modification accepted.");
        } else {
            System.out.println("Number of nights modification rejected.");
        }
        result = reservation.setPricePerNight(-50000);
        if (result) {
            System.out.println("Price modification accepted.");
        } else {
            System.out.println("Price modification rejected.");
        }
        System.out.println("Guest: " + reservation.getGuest());
        System.out.println("Number of nights: " + reservation.getNumberOfNights());
        System.out.println("Price per night: $" + reservation.getPricePerNight());
        System.out.println("Total cost: $" + reservation.getTotalCost());
    }
}

