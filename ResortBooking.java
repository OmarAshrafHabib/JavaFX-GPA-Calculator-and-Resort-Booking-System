/**
 * The ResortBooking class represents a booking for a one-week stay at Paradise
 * Palms resort.
 * 
 * @author Omar Habib ID:3742418
 */
public abstract class ResortBooking {

    /**
     * The name of the guest who made the booking.
     */
    protected String guestName;

    /**
     * The number of à la carte meals the guest wishes to have during their stay.
     */
    protected int numMeals;

    /**
     * The number of spa visits the guest wishes to schedule during their stay.
     */
    protected int numSpaVisits;

    /**
     * Constructor for a ResortBooking object.
     * 
     * @param guestName    The name of the guest who made the booking.
     * @param numMeals     The number of à la carte meals the guest wishes to have
     *                     during their stay.
     * @param numSpaVisits The number of spa visits the guest wishes to schedule
     *                     during their stay.
     */
    public ResortBooking(String guestName, int numMeals, int numSpaVisits) {
        this.guestName = guestName;
        this.numMeals = numMeals;
        this.numSpaVisits = numSpaVisits;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getNumMeals() {
        return numMeals;
    }

    public int getNumSpaVisits() {
        return numSpaVisits;
    }

    /**
     * Method to calculate the total price of the booking based on the information
     * given by the guest.
     * 
     * @return The total price of the booking.
     */
    public abstract double calculatePrice();

    /**
     * Method to retrieve the number of the building where the guest will be
     * staying.
     * 
     * @return The number of the building where the guest will be staying.
     */
    public abstract int getBuildingNumber();
}