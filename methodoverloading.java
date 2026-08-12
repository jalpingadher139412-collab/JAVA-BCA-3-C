public class methodoverloading{

    void sum(int a, int b) {
        System.out.println("sum of 2 is " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("sum of 3 is " + (a + b + c));
    }

    public static void main(String args[]) {
        methodoverloading m1 = new methodoverloading();

        m1.sum(10, 20);
        m1.sum(10, 20, 30);
    }
}