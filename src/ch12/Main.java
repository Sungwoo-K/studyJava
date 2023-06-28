package ch12;

public class Main {
    public static void main(String[] args) {
        MyService srv1 = new MyService("수강 관리 서비스");
        MyService srv2 = new MyService("학생 정보 관리 서비스");

        srv1.start(); // 스레드 시작
        srv2.start(); // 스레드 시작

        // 멀티태스킹 : 여러 프로세스와 여러 스레드가 아주 짧게 쪼개진 CPU time을 나눠 갖는것
        // 멀티쓰레딩 : 프로세스안에 다중스레드를 처리하는 것
        // 멀티프로세싱 : 다중코어로 프로세스 및 쓰레드를 처리하는 것
    }
}
