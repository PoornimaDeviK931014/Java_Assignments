import java.util.Scanner;
import java.util.Vector;

import javax.imageio.stream.IIOByteBuffer;

class Java {
    // Print Integer array
    static void printarray(int a[]) {
        System.out.print("Elements in array: \n{ ");
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }
        System.out.print("}");

    }

    // With Scanner class - get user input
    static int getUserIntInput() {
        Scanner s = new Scanner(System.in);
        int ip = s.nextInt();
        return ip;
    }

    // Returns a vector of indexes which matches the user input
    static Vector<Integer> returnIndexOfArray(int a[], int index) {

        Vector<Integer> v = new Vector<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == index) {// if the value matches with user input
                v.add(i);// add indexes in vector
            }
        }
        return v;
    }

    // Integer Vector traversal
    static void vectorTraversal(Vector<Integer> v) {

        System.out.print("[ ");
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }
        System.out.print("]\n");
    }

    // Check Array for 0 and -1
    static void checkArray(int a[]) {

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] == 0) || (a[i] == -1)) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.print("\nYes, the array does not contains 0 or -1\n");
        } else {
            System.out.print("\nNo, the array contains 0 or -1\n");
        }
    }

    public static void main(String args[]) {
        // Question 1
        System.out.println(
                "-------------------------------------------- \nQuestion 1: Sum & Avg of elements in array\n-------------------------------------------- ");
        int arr[] = { 3, 4, 2, 5, 9, 2, -1, 0 };
        int sum = 0, avg = 0;

        printarray(arr);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println("\nSum : " + sum + " | Average: " + avg);

        // Question 2
        System.out.println(
                "-------------------------------------------- \nQuestion 2: Index of element in array\n-------------------------------------------- ");
        printarray(arr);
        System.out.println("\nEnter an element from array: ");
        int ai = getUserIntInput();
        Vector<Integer> oi = returnIndexOfArray(arr, ai);
        if (!oi.isEmpty()) {
            System.out.println("User selected element present in index(es) : ");
            vectorTraversal(oi);
        } else {
            System.out.println("User selected element not present in the array");
        }
        // Question 3
        System.out.println(
                "-------------------------------------------- \nQuestion 3: Remove an element from array\n-------------------------------------------- ");
        printarray(arr);
        System.out.println("\nEnter an element to be removed from array: ");
        int rem = getUserIntInput();
        Vector<Integer> newV = new Vector<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != rem) {// if the value does matches with user input
                newV.add(arr[i]);// add indexes in vector
            }
        }

        if (newV.size() < arr.length) {
            System.out.println("\nElement removed from array: ");
            vectorTraversal(newV);
        } else {
            System.out.println("User entered element not present in the array");
        }
        // Question 4
        System.out.println(
                "-------------------------------------------- \nQuestion 4: Insert an element in array\n(specific position)\n-------------------------------------------- ");
        printarray(arr);

        System.out.println("\nEnter an element to be inserted into array: ");
        int ins = getUserIntInput();
        System.out.println("\nPosition to be inserted into array: ");
        int ind = getUserIntInput();
        int arr1[] = new int[arr.length + 1];
        if (ind > (arr.length)) {
            System.out.println(
                    "\nPosition entered is beyond the limits of array \n Please enter a value < " + (arr.length));
            ind = getUserIntInput();
        }
        for (int i = 0; i < (arr1.length); i++) {
            if (i < ind) {
                arr1[i] = arr[i];
            } else if (i == ind) {
                arr1[i] = ins;
            } else {
                arr1[i] = arr[i - 1];
            }
        }
        printarray(arr1);
        // Question 5
        System.out.println(
                "\n-------------------------------------------- \nQuestion 5: Max and Min value in array\n-------------------------------------------- ");
        printarray(arr);
        int min = arr[0], max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }

            // System.out.println("iteration " + (i) + " min : " + min + " max :" + max);
        }
        System.out.println("\nMin : " + min + " | Max: " + max);
        // Question 6
        System.out.println(
                "-------------------------------------------- \nQuestion 6: Duplicate val in array of str\n-------------------------------------------- ");
        String astr[] = { "sa", "re", "ga", "ma", "pa", "sa", "re" };

        System.out.print("Elements in array: \n{ ");
        Vector<String> vstr = new Vector<String>();
        for (int i = 0; i < astr.length; i++) {
            System.out.print(astr[i] + " ");
            for (int j = i + 1; j < astr.length; j++) {

                // System.out
                // .println(i + " " + j + " " + astr[i] + " == " + astr[j] + " ==> " +
                // astr[i].equals(astr[j]));
                if (astr[i].equals(astr[j])) {
                    vstr.add(astr[i]);
                    break;
                }
            }
        }
        System.out.print("}\nDuplicate Elements: ");

        System.out.print("[ ");
        for (int i = 0; i < vstr.size(); i++) {
            System.out.print(vstr.get(i) + " ");
        }
        System.out.print("]\n");

        // Question 7
        System.out.println(
                "-------------------------------------------- \nQuestion 7: Common values b/w 2 int arr\n-------------------------------------------- ");
        System.out.println("Array 1:");
        printarray(arr);
        System.out.println("\nArray 2:");
        int secArr[] = { 4, 5, 7, 2, 9, 0, -2 };
        printarray(secArr);
        Vector<Integer> vec = new Vector<Integer>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < secArr.length; j++) {
                if (arr[i] == secArr[j]) {
                    vec.add(arr[i]);
                }
            }
        }
        System.out.println("\n Common elements between 2 arrays :");
        vectorTraversal(vec);

        // Question 8
        System.out.println(
                "\n-------------------------------------------- \nQuestion 8: 2nd Smallest element in Array\n-------------------------------------------- ");
        int myarr[] = { 0, 4, 9, 2, 1, -1, 5 };
        arr = myarr;
        printarray(arr);
        System.out.println();
        int small1 = arr[0], small2 = arr[1];

        for (int i = 0; i < arr.length; i++) {

            if (small1 > arr[i]) {
                // small1 has the minimum value

                // small 2 holds second minimum value which stores the last value received
                // before the 1st minimum value

                // stores the previous changed value before least value
                if (small1 != small2) {
                    small2 = small1;
                }
                small1 = arr[i];
            }
        }

        System.out.println("The Second smallest element is: " + small2);

        // Question 9
        System.out.println(
                "\n-------------------------------------------- \nQuestion 9: Missing number in Array\n-------------------------------------------- ");

        int missArr[] = { 3, 5, 7, 8, 9 };
        int mi = missArr[0], ma = 0;
        printarray(missArr);
        for (int i = 0; i < missArr.length; i++) {
            if (missArr[i] > ma) {
                ma = missArr[i];
            } else if (missArr[i] < mi) {
                mi = missArr[i];
            }
        }

        System.out.println("\nMin : " + mi + " Max : " + ma);
        Vector<Integer> miss = new Vector<Integer>();
        for (int i = mi; i <= ma; i++) {
            miss.add(i);
        }

        System.out.println("\nComplete array:");
        vectorTraversal(miss);
        System.out.println("\nThere are " + (miss.size() - missArr.length) + " elements missing \nThose are: ");
        for (int i = 0; i < missArr.length; i++) {
            for (int j = 0; j < (miss.size()); j++) {

                // System.out.println("Iteration: a[" + i + "] (" + missArr[i] + ") == v[" + j +
                // "] (" + miss.get(j) + ") ");

                if (missArr[i] == miss.get(j)) {
                    miss.remove(j);
                    break;
                }
            }
        }
        vectorTraversal(miss);

        // Question 10
        System.out.println(
                "\n-------------------------------------------- \nQuestion 10: Without 0 & -1 in array\n-------------------------------------------- ");

        System.out.println("\n3 Sample arrays");
        int arrWith[] = { 3, 5, -1, 8, 9 };
        int arrWith1[] = { 3, 5, -1, 8, 0 };
        int arrWithout[] = { 3, 5, 7, 8, 9 };
        System.out.println("\nArray 1:");
        printarray(arrWith);
        checkArray(arrWith);
        System.out.println("\nArray 2:");
        printarray(arrWith1);
        checkArray(arrWith1);
        System.out.println("\nArray 3:");
        printarray(arrWithout);
        checkArray(arrWithout);
    }
}