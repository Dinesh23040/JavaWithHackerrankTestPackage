package datepackage;

import java.util.Date;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create a new Date object which represents the current date and time
        Date currentDate = new Date();
        
        // Print the current date
        System.out.println("Current Date: " + currentDate);
        
        LocalDate currentDate2 = LocalDate.now();
        
        // Print the current date
        System.out.println("Current Date: " + currentDate);
    }
}
