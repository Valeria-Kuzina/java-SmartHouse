package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Radio {
    private int stationNumber;
    private int volume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int firstStation = 0;
    private int lastStation = 9;

    public Radio(int lastStation) {
        this.lastStation = lastStation;
    }

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

    public void setStationNumber(int stationNumber) {
        if (stationNumber > lastStation) {
            return;
        }
        if (stationNumber < firstStation) {
            return;
        }
        this.stationNumber = stationNumber;
    }

}
