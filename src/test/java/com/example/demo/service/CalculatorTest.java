package com.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addition() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.addition(1,1));
    }
}