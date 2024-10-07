public class Main {
    public static void main(String[] args) {
        int y = 1337;

        for (int i = 1; i <= 100; i++) {

            y = y * 13 % 5;
        }
        System.out.println(y);
    }
}
