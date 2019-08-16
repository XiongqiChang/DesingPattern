package com.ccnu.adapter;

public class App {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","海阔天空");
        audioPlayer.play("vlc","far far away");
        audioPlayer.play("mp4","哪吒");
        audioPlayer.play("music","猪");
    }
}
