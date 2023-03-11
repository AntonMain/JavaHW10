package ru.netology.statistic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void turnOnTheMaximumStation() {
        Radio api = new Radio();

        api.currentStation = 6;

        int expected = 6;
        int actual = api.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxStation() {
        Radio api = new Radio();
        api.setToMaxStation();

        int expected = 9;
        int actual = api.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinStation() {
        Radio api = new Radio();
        api.setToMinStation();

        int expected = 0;
        int actual = api.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio api = new Radio();

        api.setCurrentStation(14);

        int expected = 0;
        int actual = api.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousStationTest() {
        Radio api = new Radio();

        api.setCurrentStation(-1);

        int expected = 0;
        int actual = api.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTest() {
        Radio api = new Radio();

        api.currentStation = 6;
        api.nextStation();

        int expected = 7;
        int actual = api.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousStationTest() {
        Radio api = new Radio();

        api.currentStation = 6;
        api.setPreviousStation();

        int expected = 5;
        int actual = api.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnOnTheMaximumVolume() {
        Radio api = new Radio();

        api.currentVolume = 6;

        int expected = 6;
        int actual = api.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio api = new Radio();
        api.setToMaxVolume();

        int expected = 10;
        int actual = api.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio api = new Radio();
        api.setToMinVolume();

        int expected = 0;
        int actual = api.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeMaxTest() {
        Radio api = new Radio();

        api.currentVolume = 10;
        api.nextVolumeMax();

        int expected = 10;
        int actual = api.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousVolumeMinTest() {
        Radio api = new Radio();

        api.currentVolume = 0;
        api.setPreviousVolumeMin();

        int expected = 0;
        int actual = api.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeTest() {
        Radio api = new Radio();

        api.currentVolume = 6;
        api.nextVolume();

        int expected = 7;
        int actual = api.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousVolumeTest() {
        Radio api = new Radio();

        api.currentVolume = 6;
        api.setPreviousVolume();

        int expected = 5;
        int actual = api.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}