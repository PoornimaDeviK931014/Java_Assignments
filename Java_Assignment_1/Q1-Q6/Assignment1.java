import java.util.Scanner;

class Java {
        public static void main(String args[]) {
                int a = 10, b = 5;
                // Question 1-------------------------
                System.out.println(
                                "------------------------ Java Assignment 1 ---------------------- \nQuestion 1: Print Sum, Sub, Mul , Div of 2 nums \n-----------------------------------------------------------------");
                System.out.println("a=10, b=5 \n Sum = " + (a + b) + "  |  Sub = " + (a - b) + "\n Mul = " + (a * b)
                                + "  |  Div = "
                                + (a / b));
                // Question 2---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 2: Above with user input \n-----------------------------------------------------------------");
                System.out.println("Enter 2 numbers");
                Scanner uinput = new Scanner(System.in);
                int u1 = uinput.nextInt();
                int u2 = uinput.nextInt();
                System.out.println("u1=" + u1 + ", u2=" + u2 + " \n Sum = " + (u1 + u2) + "  | Sub = " + (u1 - u2)
                                + "\n Mul = "
                                + (u1 * u2) + "  | Div = "
                                + (u1 / u2));
                // Question 3---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 3: Multiplication table \n-----------------------------------------------------------------");
                System.out.println("Enter a number");
                Scanner mul_ip = new Scanner(System.in);
                int ip = mul_ip.nextInt();
                for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " x " + ip + " = " + i * ip);
                }
                // Question 4---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 4: Area and Perimeter of Rectangle \n-----------------------------------------------------------------");
                System.out.println("Enter length and breadth");
                Scanner rect = new Scanner(System.in);
                int len = rect.nextInt();
                int bre = rect.nextInt();
                System.out.println("Area: " + len * bre + " | Perimeter: " + 2 * (len + bre));
                // Question 5---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 5: Swap 2 variables \n-----------------------------------------------------------------");
                System.out.println("Enter 2 numbers");
                Scanner swap = new Scanner(System.in);
                int v1 = swap.nextInt();
                int v2 = swap.nextInt();
                int t = 0;
                System.out.println("Before Swapping: " + v1 + " & " + v2);
                t = v1;
                v1 = v2;
                v2 = t;
                System.out.println("After Swapping: " + v1 + " & " + v2);

                // Question 6---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 6: Swap 2 variables without 3rd var\n-----------------------------------------------------------------");
                System.out.println("Enter 2 numbers");
                Scanner swap1 = new Scanner(System.in);
                int var1 = swap1.nextInt();
                int var2 = swap1.nextInt();
                System.out.println("Before Swapping: " + var1 + " & " + var2);
                var1 = var1 + var2;
                var2 = var1 - var2;
                var1 = var1 - var2;
                System.out.println("After Swapping: " + var1 + " & " + var2);

        }

}
