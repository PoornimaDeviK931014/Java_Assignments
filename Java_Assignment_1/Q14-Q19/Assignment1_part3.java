import java.util.Scanner;
import java.util.Vector;

class Java {

        static void printVector(Vector v) {

                for (int i = 0; i < v.size(); i++) {
                        System.out.print(v.get(i) + " ");
                }

                System.out.println();
        }

        public static void main(String args[]) {

                // Question 14---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 14: Print numbers divisible by 3 & 5\n-----------------------------------------------------------------");

                Vector<Integer> v3 = new Vector<Integer>();
                Vector<Integer> v5 = new Vector<Integer>();
                Vector<Integer> v35 = new Vector<Integer>();
                for (int i = 0; i <= 100; i++) {
                        if (i % 3 == 0) {
                                // a3[i3++] = i;
                                v3.add(i);
                        }
                        if (i % 5 == 0) {
                                // a5[i5++] = i;
                                v5.add(i);
                        }
                }

                System.out.println("\nNumbers divisible by 3:");
                printVector(v3);
                System.out.println("\nNumbers divisible by 5:");
                printVector(v5);
                System.out.println("\nNumbers divisible by both 3 and 5:");
                v35.addAll(v3);
                v35.addAll(v5);
                printVector(v35);
                // Question 15---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 15: Determine Eldest & youngest among 3\n-----------------------------------------------------------------");
                Scanner s = new Scanner(System.in);
                int a1 = s.nextInt();
                int a2 = s.nextInt();
                int a3 = s.nextInt();
                int o = ((a1 > a2) ? ((a1 > a3) ? a1 : a3)
                                : ((a2 > a3) ? a2 : a3));
                int y = ((a1 < a2) ? ((a1 < a3) ? a1 : a3)
                                : ((a2 < a3) ? a2 : a3));

                System.out.println("\nEldest is " + o + " & youngest is " + y);

                // Question 16---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 16: Triangle * pattern\n-----------------------------------------------------------------");
                for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i + 1; j++) {// i+1 number of times * printed
                                System.out.print("* ");
                        }
                        System.out.println();// newline on each loop
                }

                // Question 17---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 17: Reverse Triangle * pattern\n-----------------------------------------------------------------");
                for (int i = 0; i < 5; i++) {
                        for (int j = 5; j >= i + 1; j--) {// decrement same loop logic
                                System.out.print("* ");
                        }
                        System.out.println();
                }
                // Question 18---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 18: Find largest of 2 \nReturn 0 if equal\nFind smallest val if 2 val have same reminder /6\n-----------------------------------------------------------------");

                Scanner v = new Scanner(System.in);
                int v1 = v.nextInt();
                int v2 = v.nextInt();
                int l = v1 > v2 ? v1 : (v1 == v2 ? 0 : v2);

                System.out.println("Largest of those 2 numbers is " + l);// largest of 2 vals - returns 0 if equal
                if (v1 % 6 == v2 % 6) {
                        System.out.println("Smallest of those 2 numbers is " + ((v1 < v2) ? v1 : v2));// prints smallest
                                                                                                      // value when both
                                                                                                      // have same
                                                                                                      // reminders when
                                                                                                      // divided by 6
                }
                // Question 19---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 19: Odd or Even\n-----------------------------------------------------------------");
                Scanner ooe = new Scanner(System.in);
                int un = ooe.nextInt();
                // String isEven = (un % 2 == 0) ? (un + " is Even number") : (un + " is Odd
                // number");
                int isEven = (un % 2 == 0) ? 1 : 0;
                System.out.println(isEven);

        }

}
