package com.example.demo.delegate;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomDataGenerator {
    public Integer generateRandomData() {
        Random random = new Random();
        return random.nextInt(100); // Генерируем случайное число от 0 до 99
    }
}
