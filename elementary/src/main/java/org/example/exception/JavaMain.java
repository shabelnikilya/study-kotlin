package org.example.exception;

import java.io.IOException;

/**
 * @author Shabelnik Ilya (ishabelnik@unislabs.com)
 */
public class JavaMain {

    public static void main(String[] args) {
        User user = new User("Jenya", 11, "");

        try {
            NumberMainKt.emailValidate(user);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
