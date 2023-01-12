package me.viharev.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    final String correctEmail = "work@work.com";
    final String wrongEmail = "homehome.gov";
    final String name_1 = "Ivan";
    final String name_2 = "Eva";

    User user1;
    User user2;
    User user3;


    @BeforeEach
    public void setUp() {
        user1 = new User(name_1, correctEmail);
        user2 = new User(name_2, wrongEmail);
        user3 = new User();
    }

    @Test
    @DisplayName("Тест проверки равны ли login и email (Они не должны быть равны)")
    void objectFieldsAreNotEquals() {
        assertNotEquals(user1.getEmail(), user1.getLogin());
    }

    @Test
    @DisplayName("Тест проверки email (должны быть символы '.' и '@')")
    void checkEmail() {
        assertTrue(user1.checkEmail(user1.getEmail()));
    }

    @Test
    @DisplayName("Тест конструктора с двумя параметрами")
    void testUserFullConstructor() {
        assertNotNull(user1.getLogin());
        assertNotNull(user1.getEmail());
    }

    @Test
    @DisplayName("Тест пустого конструктора")
    void testUserEmptyConstructor() {
        assertNull(user3.getLogin());
        assertNull(user3.getEmail());
    }
}
