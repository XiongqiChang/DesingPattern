package com.ccnu.adapter;
//创建MediaPlayer的适配类
public class MediaAdapter implements  MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String type){
        if(type.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if(type.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(filename);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(filename);
        }
    }
}
