import java.util.Scanner;

class Calculate
{
    void add(int a, int b){
        System.out.println("Addition is : " + (a + b));
    }

    void sub(int a, int b){
        System.out.println("Subtraction is : " + (a - b));
    }

    void mul(int a, int b){
        System.out.println("Multiplication is : " + (a * b));
    }

    void div(int a, int b){
        System.out.println("Division is : " + (a / b));
    }

    void mod(int a, int b){
        System.out.println("Modulus is : " + (a % b));
    }
}

class UserInput
{
    int a, b;

    void getval()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your a value : ");
        a = input.nextInt();

        System.out.println("Please enter your b value : ");
        b = input.nextInt();
    }
}

public class program14 {
    public static void main(String args[]){
        UserInput ui = new UserInput();
        ui.getval();

        Calculate cal = new Calculate();

        cal.add(ui.a, ui.b);
        cal.sub(ui.a, ui.b);
        cal.mul(ui.a, ui.b);
        cal.div(ui.a, ui.b);
        cal.mod(ui.a, ui.b);
    }
}