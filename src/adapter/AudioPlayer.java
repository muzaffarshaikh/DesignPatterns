/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Muzaffar
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter amp = new MediaAdapter();
    
    @Override
    public void play(String songString) {
        
        if(songString.endsWith("mp3")){
            System.out.println("MP3 File Playing..........");
        }
        
        if(songString.endsWith("vlc")){
            amp.play("vlc");
        }
        
        if(songString.endsWith("mp4")){
            amp.play("mp4");
        }
        
    }
    
}
