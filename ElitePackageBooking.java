/**
 * ElitePackageBooking represents a booking for the elite package at the
 * Paradise Palms resort.
 * 
 * @author Omar Habib ID:3742418
 */
public class ElitePackageBooking extends ResortBooking {

    /**
     * Constructs a new ElitePackageBooking object with the given guest name, number
     * of
     * à la carte meals, and number of spa visits.
     * 
     * @param guestName    the name of the guest
     * @param numMeals     the number of à la carte meals the guest wishes to have
     *                     during the week
     * @param numSpaVisits the number of spa visits the guest wishes to have during
     *                     the week
     */
    public ElitePackageBooking(String guestName, int numMeals, int numSpaVisits) {
        super(guestName, numMeals, numSpaVisits);
    }

    /**
     * Calculates the total price of the booking based on the guest's choices and
     * the elite package
     * pricing rules. Elite guests pay a base price of $2250.00, and their first
     * three à la carte meals
     * are complimentary. The first spa visit costs $75.00 and subsequent visits
     * cost $100.00.
     * 
     * @return the total price of the booking
     */
    public double calculatePrice() {
        double base = 2250.00;
        double mealprice = 0;
        double spaPrice = 0;

        // Add the cost of à la carte meals
        if (getNumMeals() > 3) {
            int numPaidMeals = getNumMeals() - 3;
            mealprice = numPaidMeals * 35.00;
        }

        // Add the cost of spa visits
        if (getNumSpaVisits() > 0) {
            spaPrice = 75.00 * getNumSpaVisits();
        }
        double totalPrice = base + mealprice + spaPrice;
        return totalPrice;
    }

    /**
     * Returns the number of the building where the elite guest will be staying.
     * Elite guests are
     * always placed in Building 1, which has the best rooms and an ocean view.
     * 
     * @return the number of the building (always 1 for elite guests)
     */
    public int getBuildingNumber() {
        return 1;
    }
}