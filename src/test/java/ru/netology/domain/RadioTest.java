package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetAndGet() {
        Radio radio = new Radio();
        String expected = "Radioman";
        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    public void increaseCurrentStation() {
        Radio radio = new Radio();
        radio.setName("Radioman");
        radio.setOn(true);
        radio.setCurrentStation(10);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void decreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setName("Radioman");
        radio.setOn(true);
        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationValid() {
        Radio radio = new Radio();
        radio.setName("Radioman");
        radio.setOn(true);
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationInvalidMax() {
        Radio radio = new Radio();
        radio.setName("Radioman");
        radio.setOn(true);
        radio.setCurrentStation(11);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationInvalidMin() {
        Radio radio = new Radio();
        radio.setName("Radioman");
        radio.setOn(true);
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void increaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setName("Radioman");
        radio.setOn(true);
        radio.setCurrentVolume(99);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setName("Radioman");
        radio.setOn(true);
        radio.setCurrentVolume(55);
        radio.decreaseCurrentVolume();
        assertEquals(54, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeInvalidMax() {
        Radio radio = new Radio();
        radio.setName("Radioman");
        radio.setOn(true);
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeInvalidMin() {
        Radio radio = new Radio();
        radio.setName("Radioman");
        radio.setOn(true);
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

}
