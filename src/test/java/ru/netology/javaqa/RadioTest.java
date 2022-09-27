package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void setMoreNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(10);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setLessNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(-1);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTestNine() {
        Radio radio = new Radio();
        radio.setNumberStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTestZero() {
        Radio radio = new Radio();
        radio.setNumberStation(0);
        radio.next();

        int expected = 1;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTestZero() {
        Radio radio = new Radio();
        radio.setNumberStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTestNine() {
        Radio radio = new Radio();
        radio.setNumberStation(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMore() {
        Radio radio = new Radio();
        radio.setVolume(11);

        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLess() {
        Radio radio = new Radio();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.plusVolume();

        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.plusVolume();

        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.minusVolume();

        int expected = 9;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.minusVolume();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

}