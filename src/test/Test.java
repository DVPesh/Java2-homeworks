package test;

public class Test {

    public static void main(String[] args) {
        System.out.println("Test");
        int a = 15, b = 25;
        System.out.printf("%d + %d = %d%n", a, b, add(a, b));
    }

    private static int add(int a, int b) {
        return a + b;
    }

}
