# JavaFX GPA Calculator and Resort Booking System

## Overview
This project demonstrates GUI and event-driven programming using JavaFX, with two applications: a **GPA Calculator** and a **Resort Booking System**. It incorporates inheritance, decision-making, and data handling techniques to create user-friendly interfaces for each application.

### Applications

1. **GPA Calculator**:
   - A graphical GPA calculator that allows users to input course grades and credit hours.
   - Calculates cumulative GPA based on letter grades and course credit hours, following UNB’s grading system.
   - Features buttons for adding course data, calculating GPA, and clearing all entries.
   - Uses `NumberFormat` to display GPA and points with one decimal place.

2. **Resort Booking System**:
   - Allows users to book one-week stays at Paradise Palms resort with options for **Tourist** and **Elite** packages.
   - Packages differ in base price, building assignments, à la carte meals, and spa visit costs.
   - GUI interface collects user name, number of à la carte meals, and spa visits, displaying the final booking cost and building assignment.
   - Includes a reset button to clear user inputs and reset the GUI.

### Key Features
- **JavaFX GUI**: Easy-to-use interfaces for GPA calculation and resort booking.
- **Inheritance and Polymorphism**: Resort packages (Tourist and Elite) inherit from a base `ResortBooking` class, implementing specific booking details.
- **Validation and Error Handling**: Handles invalid grade entries in GPA Calculator and resets all fields when requested.
- **Formatted Output**: Uses `NumberFormat` to display currency and GPA values.

## Usage
1. Run `GpaCalculator.java` to enter course data, calculate GPA, and clear entries as needed.
2. Run `ResortBookingApp.java` to input booking details, choose a package, and display cost and building information.

## Documentation
Each class includes Javadoc comments, describing properties, methods, and usage with `@param` and `@return` tags.

## Project Files
- `GpaCalculator.java`: JavaFX GPA calculator.
- `ResortBooking.java`, `TouristPackageBooking.java`, `ElitePackageBooking.java`: Base and subclass implementations for resort booking.
- `ResortBookingApp.java`: JavaFX interface for booking system.
- Sample output screenshots are included for reference.
