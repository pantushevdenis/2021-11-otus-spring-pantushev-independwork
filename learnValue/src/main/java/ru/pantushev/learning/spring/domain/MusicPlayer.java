package ru.pantushev.learning.spring.domain;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class MusicPlayer {
    @Value("${musicplayer.name}")
    private String name;

    @Value("${musicplayer.volume}")
    private int volume;

    @Value("this is just string")
    private String justString;

    public String getJustString() {
        return justString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
