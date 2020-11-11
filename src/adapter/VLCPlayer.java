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
public class VLCPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVLC() {
        System.out.println("VLC Playing................");
    }

    @Override
    public void playMP4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
