import java.util.Scanner;

class Java {
    public static void main(String args[]) {
        int a = 10, b = 5;
        // Question 1-------------------------
        System.out.println(
                "------------------------ Java Assignment 1 ---------------------- \nQuestion 1: Print Sum, Sub, Mul , Div of 2 nums \n-----------------------------------------------------------------");
        System.out.println("a=10, b=5 \n Sum = " + (a + b) + "\n Sub = " + (a - b) + "\n Mul = " + (a * b) + "\n Div = "
                + (a / b));
        // Question 2---------------------------
        System.out.println(
                "-----------------------------------------------------------------\nQuestion 2: Above with user input \n-----------------------------------------------------------------");
        System.out.println("Enter 2 numbers");
        Scanner uinput = new Scanner(System.in);
        int u1 = uinput.nextInt();
        int u2 = uinput.nextInt();
        System.out.println("u1=" + u1 + ", u2=" + u2 + " \n Sum = " + (u1 + u2) + "\n Sub = " + (u1 - u2) + "\n Mul = "
                + (u1 * u2) + "\n Div = "
                + (u1 / u2));
    }
}
