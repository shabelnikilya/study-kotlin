package org.example.lasmbdas;


public class RunnabelClass {

    public void run(int amount, Runnable runnable) {
        for (int i = 0; i < amount; i++) {
            runnable.run();
        }
    }
}
