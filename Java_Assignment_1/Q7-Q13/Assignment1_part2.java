
import java.util.Random;
import java.util.Scanner;
import java.time.Clock;

class Java {
        public static void main(String args[]) {

                // Question 7---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 7: Add & divide 2 binary numbers\n-----------------------------------------------------------------");
                System.out.println("Enter 2 binary numbers");
                Scanner uinput = new Scanner(System.in);
                String u1 = uinput.next();
                String u2 = uinput.next();
                int sum = Integer.parseInt(u1, 2) + Integer.parseInt(u2, 2);
                String result = Integer.toBinaryString(sum);
                System.out.println(u1 + " + " + u2 + " = " + result);
                System.out.println("Decimal version: \n" + Integer.parseInt(u1, 2) + " + " +
                                Integer.parseInt(u2, 2)
                                + " = " + sum);
                System.out.println("--------------------------\nEnter 2 binary numbers");
                Scanner uip = new Scanner(System.in);
                String s1 = uip.next();
                String s2 = uip.next();
                int div = Integer.parseInt(u1, 2) / Integer.parseInt(u2, 2);
                String d = Integer.toBinaryString(div);
                System.out.println(s1 + " / " + s2 + " = " + d);
                System.out.println("Decimal version: \n" + Integer.parseInt(s1, 2) + " / " +
                                Integer.parseInt(s2, 2)
                                + " = " + div);

                // Question 8---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 8: Bin to Oct\n-----------------------------------------------------------------");
                System.out.println("Enter 1 binary number");
                Scanner ip = new Scanner(System.in);
                String b = ip.next();
                int bint = Integer.parseInt(b, 2);// parse integer to Decimal value
                String o = Integer.toOctalString(bint);
                System.out.println("Binary to Octal:" + o);
                // Question 9---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 9: Oct to Hex\n-----------------------------------------------------------------");

                int oint = Integer.parseInt(o, 8);// Parse integer to Octal value
                System.out.println("Octal to Hexadecimal:" + Integer.toHexString(oint));
                // Question 10---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 10: Compare 2 numbers\n-----------------------------------------------------------------");
                System.out.println("Enter 2 numbers");
                Scanner comp = new Scanner(System.in);
                int c1 = comp.nextInt();
                int c2 = comp.nextInt();
                if (c1 > c2) {
                        System.out.println(c1 + " is greater than (>) " + c2);
                } else if (c2 == c1) {
                        System.out.println(c2 + " and " + c1 + " are equal");
                } else {
                        System.out.println(c2 + " is greater than (>)" + c1);
                }
                // Question 11---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 11: Count letters, spaces, numbers and special characters\n-----------------------------------------------------------------");

                String str = "You are a wonderful being in this world !... Don't doubt that 1%";// s.next();
                System.out.println("String is :\n" + str);
                int l = 0, sp = 0, n = 0, sc = 0;
                for (int i = 0; i <= str.length() - 1; i++) {
                        if (Character.isDigit(str.charAt(i))) {// If a number
                                n++;
                        } else if (Character.isWhitespace(str.charAt(i))) {// if whitespace
                                sp++;
                        } else if (Character.isLetter(str.charAt(i))) {// if any letter (alphabet)
                                l++;
                        } else {// if nothing else--> special character
                                sc++;
                        }
                }
                System.out.println("\nNumber of : \n letters: " + l + "\n spaces: " + sp +
                                "\n numbers: " + n
                                + "\n special characters: " + sc);

                // Question 12---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 12: Print ASCII value \n-----------------------------------------------------------------");

                System.out.println("Enter any string");
                Scanner s = new Scanner(System.in);
                String asc = s.next();

                char[] ca = asc.toCharArray(); // Convert the string to character array

                // Random number generator - to get any random index and print ascii value of
                // that character
                Random r = new Random();
                int index = r.nextInt(asc.length());

                int ascii = (int) ca[index];
                System.out.println("ASCII value of " + ca[index] + " is " + ascii);

                // Question 13---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 13: System time \n-----------------------------------------------------------------");

                // Get the default system clock
                Clock systemClock = Clock.systemDefaultZone();

                // Get the current instant using the clock
                System.out.println("System Time: " + systemClock.instant());
        }

}
