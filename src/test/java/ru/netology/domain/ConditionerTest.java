package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void shouldIncreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        int actual = 20;
        int expected = 21;

        conditioner.setCurrentTemperature(actual);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        int actual = 30;
        int expected = 30;

        conditioner.setCurrentTemperature(actual);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        int actual = 20;
        int expected = 19;

        conditioner.setCurrentTemperature(actual);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseMinTemperature() {
        Conditioner conditioner = new Conditioner();
        int actual = 10;
        int expected = 10;

        conditioner.setCurrentTemperature(actual);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldMaxCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        int actual = 31;

        conditioner.setCurrentTemperature(actual);
        assertNotEquals(conditioner.getMaxTemperature(), conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldMinCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        int actual = 9;

        conditioner.setCurrentTemperature(actual);
        assertNotEquals(conditioner.getMinTemperature(), conditioner.getCurrentTemperature());
    }
}