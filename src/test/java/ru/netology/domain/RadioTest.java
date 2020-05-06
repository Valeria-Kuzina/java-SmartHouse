package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        int actual = 8;
        int expected = 9;

        radio.setStationNumber(actual);
        radio.next();
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        int actual = 8;
        int expected = 7;

        radio.setStationNumber(actual);
        radio.prev();
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    public void shouldNextMaxStation() {
        Radio radio = new Radio();
        int actual = 9;
        int expected = 0;

        radio.setStationNumber(actual);
        radio.next();
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    public void shouldMinPrevStation() {
        Radio radio = new Radio();
        int actual = 0;
        int expected = 9;

        radio.setStationNumber(actual);
        radio.prev();
        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    public void shouldNumberOfStation() {
        Radio radio = new Radio();
        int actual = 8;

        radio.setStationNumber(actual);
        assertEquals(actual, radio.getStationNumber());
    }

    @Test
    public void shouldUpNumberOfStation() {
        Radio radio = new Radio();
        int actual = 11;

        radio.setStationNumber(actual);
        assertNotEquals(actual, radio.getStationNumber());
    }
    @Test
    public void shouldDownNumberOfStation() {
        Radio radio = new Radio();
        int actual = -1;

        radio.setStationNumber(actual);
        assertNotEquals(actual, radio.getStationNumber());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        int actual = 8;
        int expected = 9;

        radio.setVolume(actual);
        radio.increaseVolume();
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        int actual = 8;
        int expected = 7;

        radio.setVolume(actual);
        radio.decreaseVolume();
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();
        int actual = 10;
        int expected = 10;

        radio.setVolume(actual);
        radio.increaseVolume();
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();
        int actual = 0;
        int expected = 0;

        radio.setVolume(actual);
        radio.decreaseVolume();
        assertEquals(expected, radio.getVolume());
    }


}