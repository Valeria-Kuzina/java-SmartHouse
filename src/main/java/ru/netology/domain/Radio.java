package ru.netology.domain;

public class Radio {
    private int stationNumber;
    private int volume;

    public void next() {
        if (stationNumber == 9) {
            this.stationNumber = 0;
            return;
        }
        this.stationNumber = ++stationNumber;
    }

    public void prev() {
        if (stationNumber == 0) {
            this.stationNumber = 9;
            return;
        }
        this.stationNumber = --stationNumber;
    }

    public void increaseVolume(){
        if (volume == 10){
            return;
        }
        this.volume = ++volume;
    }

    public void decreaseVolume(){
        if (volume == 0){
            return;
        }
        this.volume = --volume;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber > 9) {
            return;
        }
        if (stationNumber < 0) {
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
}
