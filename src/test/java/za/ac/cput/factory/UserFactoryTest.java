package za.ac.cput.factory;
// User UserFactoryTest  class
//Author: Bonga Velem (220052379)
//Date: 27 March 2025

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.User;

import static org.junit.jupiter.api.Assertions.*;
class UserFactoryTest {
    private static User user1 = UserFactory.registerUser(1234, "Bonga", "bongavelem@outlook.com",
            "Bonga@34", "07123239843", "CPT8944");
    private static User userLogin = UserFactory.loginUser("bongavelem@outlook.com", "Bonga@34");

    private static User userUpdate = UserFactory.updateUser("Bonga", "bongavelem@gmail.com",
            "Bonga@34", "07123239843", "CPT8944");

    @Test
    @Tag("User")
    void registerUser() {
        assertNotNull(user1);
        System.out.println("User Register test" + user1.toString());
    }

    @Test
    @Tag("User")
    void loginUser() {
        assertNotNull(userLogin);
        System.out.println("User Login test" + userLogin.toString());
    }

    @Test
    @Tag("User")
    void updateUser() {
        assertNotNull(userUpdate);
        System.out.println( "User Update test" + userUpdate.toString());
    }
}