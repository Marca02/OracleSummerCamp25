public class Bazinga {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0 && i % 2 == 0) {
                System.out.println("Bazinga!");
            } else if (i % 5 == 0) {
                System.out.println("inga!");
            } else if (i % 2 == 0) {
                System.out.println("Baz");
            } else {
                System.out.println((i));
            }
        }
    }
}
