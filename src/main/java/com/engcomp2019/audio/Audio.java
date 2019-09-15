package com.engcomp2019.audio;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author erick / rckmath
 */
public class Audio {

    //private Boolean play;

    public void play(String filePath) {
        try {
            File audioPath = new File(filePath);

            if (audioPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(audioPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            } else System.err.println("File not found.");
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.err.println("ERRO: " + e);
        }

    }
}
