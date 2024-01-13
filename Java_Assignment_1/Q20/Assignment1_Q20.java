import java.util.Scanner;
import java.util.Vector;

class Java {

        static void printVector(Vector v) {

                for (int i = 0; i < v.size(); i++) {
                        System.out.print(" " + v.get(i) + "\n");
                }

                System.out.println();
        }

        public static void main(String args[]) {

                // Question 20---------------------------
                System.out.println(
                                "-----------------------------------------------------------------\nQuestion 20: Hotel Menu\n-----------------------------------------------------------------");
                String menutype[] = { "Veg", "Non-Veg", "Beverages" };
                System.out.println("________________ Hotel Menu Today ___________________\n| ");

                String menu[][] = { { "Paneer Biriyani", "South Indian Meals", "Veg fried rice" },
                                { "Chicken Biriyani", "Mutton Biriyani", "Fish curry" },
                                { "Tea", "Coffee", "Lime Soda" } };
                for (int i = 0; i < 3; i++) {
                        System.out.println("|  " + menutype[i] + " ________________________\n|  ");
                        for (int j = 0; j < 3; j++) {
                                // System.out.println(i + " " + j);
                                System.out.println("|  " + (i + 1) + "" + (j + 1) + "." + menu[i][j]);
                        }
                        System.out.println("|  ");
                }

                System.out.println("_______________________________\nPlease Enter your name:");
                Scanner s = new Scanner(System.in);
                String un = s.next();
                System.out.println("Please enter no. of items you need:");
                int l = s.nextInt();
                Vector<String> v = new Vector<String>();
                Vector<Integer> no = new Vector<Integer>();
                if (l < 9) {

                        System.out.println("Please Enter your order:");
                        int ono = 0;

                        s.nextLine();
                        for (int i = 0; i < l; i++) {
                                ono = s.nextInt();
                                // fetch the correct index from array
                                int mi = 0, mj = 0;
                                mi = (ono - 11) / 10;
                                mj = (ono - 11) % 10;
                                if ((mi > 2) || (mj > 2)) {
                                        no.add(ono);
                                } else {
                                        v.add(ono + ". " + menu[mi][mj]);
                                }

                        }
                } else {
                        System.out.println("There are only 9 items in Menu");
                }

                if (!v.isEmpty()) {
                        System.out.println(
                                        "_______________________________\nOrder details: \n_______________________________\n Name : "
                                                        + un);
                        printVector(v);
                }
                System.out.println("______________________________________________________________");
                if (!no.isEmpty()) {
                        System.out.println(
                                        "The below item number(s) are not available in today's Menu, \nRegret the inconvenience");
                        printVector(no);
                }
                System.out.println("______________________________________________________________");

        }

}
