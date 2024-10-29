/**
 * The TouristPackageBooking class represents a booking for a one-week stay at
 * Paradise Palms resort
 * 
 * @author Omar Habib ID:3742418
 */
public class TouristPackageBooking extends ResortBooking {

    /**
     * Constructor for a TouristPackageBooking object.
     * 
     * @param guestName    The name of the guest who made the booking.
     * @param numMeals     The number of à la carte meals the guest wishes to have
     *                     during their stay.
     * @param numSpaVisits The number of spa visits the guest wishes to schedule
     *                     during their stay.
     */
    public TouristPackageBooking(String guestName, int numMeals, int numSpaVisits) {
        super(guestName, numMeals, numSpaVisits);
    }

    /**
     * Method to calculate the total price of the booking based on the information
     * given by the guest.
     * 
     * @return The total price of the booking.
     */
    public double calculatePrice() {
        double base = 1475.00;
        double price = base + (numMeals * 35.00);
        double totalPrice = price + 125.00 + ((numSpaVisits - 1) * 100.00);
        return totalPrice;
    }

    /**
     * Method to retrieve the number of the building where the guest will be
     * staying.
     * 
     * @return The number of the building where the guest will be staying.
     */
    public int getBuildingNumber() {
        int rand = (int) (Math.random() * 4) + 2;
        return rand;
    }
}