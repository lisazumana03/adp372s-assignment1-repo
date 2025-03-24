package za.ac.cput.factory;
// User Factory class
//Author: Bonga Velem (220052379)
//Date: 20 March 2025

import za.ac.cput.domain.User;

public class UserFactory {
    public static User registerUser(int userId, String name, String email, String phoneNumber, String licenseNumber) {
        if(userId<0){
            return null;
        }
        if (name==null||name.isEmpty()){
            return null;
        }

        if (email == null || !email.contains("@") || email.isEmpty()) {
            return null;
        }

        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return null;
        }

        if (licenseNumber == null || licenseNumber.isEmpty()) {
            return null;
        }

        return new User.Builder()
                .setUserId(userId)
                .setName(name)
                .setEmail(email)
                .setPhoneNumber(phoneNumber)
                .setLicenseNumber(licenseNumber)
                .build();
    }

    }
