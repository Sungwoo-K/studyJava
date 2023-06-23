package ch08.interfaceEx3.musicPlayer;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer1 = new MP3Player();
        MusicPlayer musicPlayer2 = new StreamingMusicPlayer();

        musicPlayer1.play();
        musicPlayer1.pause();
        musicPlayer1.stop();

        System.out.println("------------------------");

        musicPlayer2.play();
        musicPlayer2.pause();
        musicPlayer2.stop();
    }
}
