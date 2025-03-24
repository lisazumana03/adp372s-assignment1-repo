package za.ac.cput;

import za.ac.cput.domain.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the car hire application.");
        User user1 = new User.Builder()
                .setUserId(1)
                .setName("Bonga Velem")
                .setEmail("bongavelem@example.com")
                .setPhoneNumber("0798135811")
                .setLicenseNumber("ABC12345")
                .build();

        System.out.println(user1);
    }
}