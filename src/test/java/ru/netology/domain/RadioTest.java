package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetAndGet (){
        Radio radio = new Radio();
        String expected = "BlahBlah";
        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    public void increaseCurrentStation() {
        Radio radio = new Radio();
        radio.setName("BlahBlah");
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setOn(true);
        radio.setCurrentStation(9);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void decreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setName("BlahBlah");
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setOn(true);
        radio.setCurrentStation(9);
        radio.decreaseCurrentStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void increaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setName("BlahBlah");
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setOn(true);
        radio.setCurrentVolume(9);
        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setName("BlahBlah");
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setOn(true);
        radio.setCurrentVolume(9);
        radio.decreaseCurrentVolume();
        assertEquals(8, radio.getCurrentVolume());
    }
}
