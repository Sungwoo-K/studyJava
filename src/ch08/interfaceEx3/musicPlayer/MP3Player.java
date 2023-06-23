package ch08.interfaceEx3.musicPlayer;

public class MP3Player implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("Play MP3Player");
    }

    @Override
    public void pause() {
        System.out.println("Pause MP3Player");
    }

    @Override
    public void stop() {
        System.out.println("Stop MP3Player");
    }
}
