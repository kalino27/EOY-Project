package eoy_project;

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.*;

public class Sound
{
	
	public void playmusic(String musicfile) {
		File soundFile = new File(musicfile);
		try {
			Clip clip = AudioSystem.getClip();
			AudioInputStream inputStream= AudioSystem.getAudioInputStream(soundFile);
			clip.open(inputStream);
			clip.loop(1);
			clip.start();
		}
	catch(Exception e)
		{
		System.out.println(e);
		}
	}
}