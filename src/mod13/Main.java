package mod13;

public class Main {
    public static void main(String[] args) {
        Thread threadik = new Thread(new Runner());
        threadik.start();

    }
}
