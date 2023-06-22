package ch07.inheritanceEx.music;

public class Piano extends Instrument {
    public void play(){
        super.play();
        System.out.println("도레미파솔라시도");
    }
}
