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

    private Clip clip;

    /**
     * Executa um áudio
     *
     * @param filePath Localização do arquivo de áudio
     * @param repeat True para executar o áudio em loop, false para executar uma
     * vez
     */
    public void play(String filePath, Boolean repeat) {
        try {
            File audioPath = new File(filePath);
            if (audioPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(audioPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                if (repeat) {
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                }
            } else {
                System.err.println("File not found.");
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
