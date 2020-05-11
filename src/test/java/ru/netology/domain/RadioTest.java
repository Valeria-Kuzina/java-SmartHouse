package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldNextStation() {
        int actual = 8;
        int expected = 9;

        radio.setStationNumber(actual);
        radio.next();
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    public void shouldPrevStation() {
        int actual = 8;
        int expected = 7;

        radio.setStationNumber(actual);
        radio.prev();
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    public void shouldNextMaxStation() {
        int actual = 9;
        int expected = 0;

        radio.setStationNumber(actual);
        radio.next();
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    public void shouldMinPrevStation() {
        int actual = 0;
        int expected = 9;

        radio.setStationNumber(actual);
        radio.prev();
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    public void shouldNumberOfStation() {
        int actual = 8;

        radio.setStationNumber(actual);
        assertEquals(actual, radio.getStationNumber());
    }

    @Test
    public void shouldUpNumberOfStation() {
        int actual = 11;

        radio.setStationNumber(actual);
        assertNotEquals(radio.getLastStation(), radio.getStationNumber());
    }

    @Test
    public void shouldDownNumberOfStation() {
        int actual = -5;

        radio.setStationNumber(actual);
        assertNotEquals(radio.getFirstStation(), radio.getStationNumber());
    }

    @Test
    public void shouldIncreaseVolume() {
        int actual = 8;
        int expected = 9;

        radio.setVolume(actual);
        radio.increaseVolume();
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        int actual = 8;
        int expected = 7;

        radio.setVolume(actual);
        radio.decreaseVolume();
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void shouldMaxVolume() {
        int actual = 10;

        radio.setVolume(actual);
        radio.increaseVolume();
        assertEquals(radio.getMaxVolume(), radio.getVolume());
    }

    @Test
    public void shouldMinVolume() {
        int actual = 0;

        radio.setVolume(actual);
        radio.decreaseVolume();
        assertEquals(radio.getMinVolume(), radio.getVolume());
    }

    @Test
    public void shouldNegativeVolume() {
        int actual = -10;

        radio.setVolume(actual);
        assertNotEquals(radio.getMinVolume(), radio.getVolume());
    }
}