package ru.netology.javaqa;

public class Radio {
    private int maxNumberStation = 10;
    private int minNumberStation = 0;
    private int numberStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume;


    public Radio(int minNumberStation, int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
        this.minNumberStation = minNumberStation;
        this.numberStation = minNumberStation;
    }

    public Radio(int size) {
        maxVolume = minVolume + size;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation < minNumberStation) {
            return;
        }
        if (numberStation > maxNumberStation - 1) {
            return;
        }
        this.numberStation = numberStation;
    }

    public void next() {
        if (numberStation >= maxNumberStation - 1) {
            numberStation = minNumberStation;
        } else {
            numberStation++;
        }
    }

    public void prev() {
        if (numberStation <= minNumberStation) {
            numberStation = maxNumberStation - 1;
        } else {
            numberStation--;
        }
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume <= 0) {
            volume = 0;
        }
        if (volume >= 100) {
            volume = 100;
        }
        this.volume = volume;
    }

    public void plusVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void minusVolume() {
        if (volume > 0) {
            volume--;
        }
    }

}