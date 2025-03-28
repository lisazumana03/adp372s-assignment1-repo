package za.ac.cput.factory;
// User Factory class
//Author: Bonga Velem (220052379)
//Date: 27 March 2025

import za.ac.cput.domain.User;

public class UserFactory {
    public static User registerUser(int userId, String name, String email, String password , String phoneNumber, String licenseNumber) {
        if(userId<0){
            return null;
        }
        if (name==null||name.isEmpty()){
            return null;
        }

        if (email == null || !email.contains("@") || email.isEmpty()) {
            return null;
        }

        if(password == null || password.isEmpty()){
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

    public static User loginUser(String email, String password) {
        if (email == null || !email.contains("@") || email.isEmpty()) {
            return null;
        }
        if (password == null || password.isEmpty()) {
            return null;
        }

        return new User.Builder()
                .setEmail(email)
                .setPassword(password).build();
    }

    public static User updateUser(String name, String email, String password, String phoneNumber, String licenseNumber) {
        if (name==null||name.isEmpty()){
            return null;
        }
        if (email == null || !email.contains("@") || email.isEmpty()) {
            return null;
        }
        if (password == null || password.isEmpty()){
            return null;
        }
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return null;
        }
        if (licenseNumber == null || licenseNumber.isEmpty()) {
            return null;
        }

        return new User.Builder()
                .setName(name)
                .setEmail(email)
                .setPassword(password)
                .setPhoneNumber(phoneNumber)
                .setLicenseNumber(licenseNumber)
                .build();

    }




    }
