package ch12;

public class MyService extends Thread {
    private String name;

    public MyService(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= (int) (Math.random() * 1000); i++) {
            System.out.println("스레드 " + name + ": " + i);

            try {
                Thread.sleep((int) (Math.random() * 1000)); // 1초간 일시 정지
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


