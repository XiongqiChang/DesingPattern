package com.ccnu.adapter;

/**
 * MediaAdapter的具体的实现类
 */
public class AudioPlayer implements  MediaPlayer {

    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String filename) {
            if(audioType.equalsIgnoreCase("mp3")){
                System.out.println("mp3 file" + filename);
            }else  if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType,filename);

            }else {
                System.out.println("当前文件不支持");
            }
    }
}
