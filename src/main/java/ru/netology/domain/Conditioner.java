package ru.netology.domain;

import lombok.Data;

@Data
public class Conditioner {
    private String name;
    private int maxTemperature = 30;
    private int minTemperature = 10;
    private int currentTemperature;
    private boolean on;

    public void increaseCurrentTemperature() {
        if (currentTemperature == maxTemperature) {
            return;
        }
        this.currentTemperature = ++currentTemperature;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature == minTemperature) {
            return;
        }
        this.currentTemperature = --currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentTemperature = currentTemperature;
    }

}
