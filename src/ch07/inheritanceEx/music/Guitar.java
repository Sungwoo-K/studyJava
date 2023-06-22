package ch07.inheritanceEx.music;

public class Guitar extends Instrument{
    public void play(){
        super.play();
        System.out.println("딩기딩딩기");
    }
}
