/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Student
 */
public class MediaAdapter implements MediaPlayer {
    
    AdvancedMediaPlayer amp;
    
    @Override
    public void play(String songString) {
        if(songString.equals("vlc")){
            amp = new VLCPlayer();
            amp.playVLC();
        }
        if(songString.equals("mp4")){
            amp = new Mp4Player();
            amp.playMP4();
        }
        
    }
    
}
