package com.ccnu.adapter;

public class Mp4Player implements  AdvancedMediaPlayer {
    @Override
    public void playMp4(String filename) {
        System.out.println("play mp4" + filename);
    }

    @Override
    public void playVlc(String filename) {

    }
}
