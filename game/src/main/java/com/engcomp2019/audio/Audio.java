package com.engcomp2019.audio;

import java.io.IOException;
import java.net.URL;
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

    private Clip clip;
    private URL audioPath;

    public void setAudioPath(URL audioPath) {
        this.audioPath = audioPath;
    }

    /**
     * Executa um áudio
     *
     * @param repeat True para executar o áudio em loop, false para executar uma
     * vez
     */
    public void play(Boolean repeat) {
        try {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(audioPath);
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            if (repeat) {
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.err.println("ERRO: " + e);
        }
    }

    /**
     * Para o áudio executando
     */
    public void stop() {
        try {
            this.clip.stop();
        } catch (Exception e) {
            System.err.println("ERRO: " + e);
        }
    }

}
