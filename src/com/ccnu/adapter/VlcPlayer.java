package com.ccnu.adapter;

public class VlcPlayer implements  AdvancedMediaPlayer {
    @Override
    public void playMp4(String filename) {

    }

    @Override
    public void playVlc(String filename) {
        System.out.println("play vlc file" + filename);
    }
}
