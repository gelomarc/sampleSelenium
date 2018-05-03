package entities;

import java.time.LocalDate;
import java.util.Random;

import static utils.Utils.*;

public class User {

    private String email;
    private String password;
    private String title;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Address address;

    public User() {
        this.email = generateRandomEmail();
        this.password = generateRandomString(12);
        this.firstName = "firstName" + generateRandomLetters(8);
        this.lastName = "lastName" + generateRandomLetters(8);
        this.title = getRandomTitle();
        this.birthDate = generateRandomBirthDate();
        this.address = new Address(firstName, lastName);
    }

    private String getRandomTitle() {
        Random random = new Random();
        if (random.nextBoolean() == true)
            return "Mr.";
        else
            return "Mrs.";
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Address getAddress() {
        return address;
    }
}
