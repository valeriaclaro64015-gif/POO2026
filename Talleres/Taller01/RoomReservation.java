public class RoomReservation {
    
    private String guest;
    private int roomNumber;
    private int numberOfNights;
    private double pricePerNight;

    public String getGuest() {
        return guest;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public int getNumberOfNights() {
        return numberOfNights;
    }
    public double getPricePerNight() {
        return pricePerNight;
    }
    public double getTotalCost() {
        return numberOfNights * pricePerNight;
    }
    public boolean setGuest(String newGuest) {
        if (newGuest != null && !newGuest.trim().isEmpty()) {
            guest = newGuest;
            return true;
        }
        return false;
    }
    public boolean setRoomNumber(int newRoomNumber) {
        roomNumber = newRoomNumber;
        return true;
    }
    public boolean setNumberOfNights(int newNumberOfNights) {
        if (newNumberOfNights > 0) {
            numberOfNights = newNumberOfNights;
            return true;
        }
        return false;
    }
    public boolean setPricePerNight(double newPricePerNight) {
        if (newPricePerNight > 0) {
            pricePerNight = newPricePerNight;
            return true;
        }
        return false;
    }
}
