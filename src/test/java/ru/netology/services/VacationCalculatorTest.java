package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationCalculatorTest {
    @Test
    public void VacationCalculator1() {
        VacationCalculator calculator = new VacationCalculator();
        int result1 = calculator.calculate(10000, 3000, 20000);
        int expected = 3;
        assertEquals(3, result1);
        System.out.println("Отдых в году: " + result1 + " месяца");
    }
}