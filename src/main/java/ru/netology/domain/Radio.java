package ru.netology.domain;

public class Radio {
    private int stationNumber = -1;
    private int volume;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int firstStation = 0;
    private int lastStation = 9;

    public void next() {
        if (stationNumber == lastStation) {
            this.stationNumber = firstStation;
            return;
        }
        this.stationNumber = ++stationNumber;
    }

    public void prev() {
        if (stationNumber == firstStation) {
            this.stationNumber = lastStation;
            return;
        }
        this.stationNumber = --stationNumber;
    }

    public void increaseVolume() {
        if (volume == maxVolume) {
            return;
        }
        this.volume = ++volume;
    }

    public void decreaseVolume() {
        if (volume == minVolume) {
            return;
        }
        this.volume = --volume;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber > lastStation) {
            return;
        }
        if (stationNumber < firstStation) {
            return;
        }
        this.stationNumber = stationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getFirstStation() {
        return firstStation;
    }

    public void setFirstStation(int firstStation) {
        this.firstStation = firstStation;
    }

    public int getLastStation() {
        return lastStation;
    }

    public void setLastStation(int lastStation) {
        this.lastStation = lastStation;
    }
}
