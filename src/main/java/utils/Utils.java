package utils;

import org.apache.commons.text.RandomStringGenerator;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Properties;
import java.util.Random;

import static org.apache.commons.text.CharacterPredicates.*;

public class Utils {

    static RandomStringGenerator generator = new RandomStringGenerator.Builder().filteredBy(ASCII_ALPHA_NUMERALS).build();
    static RandomStringGenerator numberGenerator = new RandomStringGenerator.Builder().filteredBy(ARABIC_NUMERALS).build();
    static RandomStringGenerator letterGenerator = new RandomStringGenerator.Builder().filteredBy(ASCII_LETTERS).build();
    static Properties properties = new Properties();

    public static String generateRandomEmail() {
        return "test+" + generator.generate(20) + "@test.com";
    }

    public static String generateRandomString(int length) {
        return generator.generate(length);
    }

    public static String generateRandomNumber(int length) {
        return numberGenerator.generate(length);
    }

    public static String generateRandomLetters(int length) {
        return letterGenerator.generate(length);
    }

    public static LocalDate generateRandomBirthDate() {
        Random random = new Random();
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2015, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);

        return randomBirthDate;
    }

    public static String getProperty(String propertyName) {
        try {
            properties.load(new FileInputStream(Thread.currentThread().getContextClassLoader().getResource("user.properties").getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(propertyName);
    }
}
