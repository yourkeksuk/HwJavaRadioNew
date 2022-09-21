package ru.netology.javaqa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void numberStation() {
        Radio radio = new Radio(0, 10);

        Assertions.assertEquals(0, radio.getMinNumberStation());
        Assertions.assertEquals(10, radio.getMaxNumberStation());
        Assertions.assertEquals(0, radio.getNumberStation());
    }
    @Test
    public void setMoreNumberStation(){
        Radio radio = new Radio(0, 10);
        radio.setNumberStation(11);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setLessNumberStation(){
        Radio radio = new Radio(0, 10);
        radio.setNumberStation(-1);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTestNine(){
        Radio radio = new Radio(0, 10);
        radio.setNumberStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTestZero(){
        Radio radio = new Radio(0, 10);
        radio.setNumberStation(0);
        radio.next();

        int expected = 1;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTestZero() {
        Radio radio = new Radio(0, 10);
        radio.setNumberStation(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTestNine() {
        Radio radio = new Radio(0, 10);
        radio.setNumberStation(10);
        radio.prev();

        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void maxVolume(){
        Radio radio = new Radio(100);

        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
    }
    @Test
    public void setVolumeMore(){
        Radio radio = new Radio(100);
        radio.setVolume(101);

        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setVolumeLess(){
        Radio radio = new Radio(100);
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void plusVolumeMax(){
        Radio radio = new Radio(100);
        radio.setVolume(100);
        radio.plusVolume();

        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void plusVolumeMin(){
        Radio radio = new Radio(100);
        radio.setVolume(0);
        radio.plusVolume();

        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minusVolumeMax(){
        Radio radio = new Radio(100);
        radio.setVolume(10);
        radio.minusVolume();

        int expected = 9;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minusVolumeMin(){
        Radio radio = new Radio(100);
        radio.setVolume(0);
        radio.minusVolume();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}