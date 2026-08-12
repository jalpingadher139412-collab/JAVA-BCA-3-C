class Parent {
    void sum(int a, int b) {
        System.out.println("Sum of 2 is " + (a + b));
    }
}

public class MethodOverriding extends Parent {

    @Override
    void sum(int a, int b) {
        System.out.println("Overridding sum is " + (a + b));
    }

    public static void main(String args[]) {
        MethodOverriding m1 = new MethodOverriding();

        m1.sum(10, 20);
    }
}