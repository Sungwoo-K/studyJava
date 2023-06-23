package ch08.interfaceEx3.musicPlayer;

public class StreamingMusicPlayer implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("Play StreamingMusicPlayer");
    }

    @Override
    public void pause() {
        System.out.println("Pause StreamingMusicPlayer");
    }

    @Override
    public void stop() {
        System.out.println("Stop StreamingMusicPlayer");
    }
}
