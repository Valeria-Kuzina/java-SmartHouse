package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @Test
    public void shouldGetAndSet() {
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void shouldIncreaseTemperature() {
        int actual = 20;
        int expected = 21;

        conditioner.setCurrentTemperature(actual);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseMaxTemperature() {
        int actual = 30;
        int expected = 30;

        conditioner.setCurrentTemperature(actual);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseTemperature() {
        int actual = 20;
        int expected = 19;

        conditioner.setCurrentTemperature(actual);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseMinTemperature() {
        int actual = 10;
        int expected = 10;

        conditioner.setCurrentTemperature(actual);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldMaxCurrentTemperature() {
        int actual = 31;

        conditioner.setCurrentTemperature(actual);
        assertNotEquals(conditioner.getMaxTemperature(), conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldMinCurrentTemperature() {
        int actual = 9;

        conditioner.setCurrentTemperature(actual);
        assertNotEquals(conditioner.getMinTemperature(), conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldBelowZeroCurrentTemperature() {
        int actual = -5;

        conditioner.setCurrentTemperature(actual);
        assertNotEquals(conditioner.getMinTemperature(), conditioner.getCurrentTemperature());
    }
}