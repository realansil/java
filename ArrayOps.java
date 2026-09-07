import java.util.Scanner;
import java.util.Vector;

class Access {
    static int[] array;

    static int index(int i) {
        return array[i];
    }

    static void update(int i, int value) {
        array[i] = value;
    }

    static int search(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    static void sorting() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

public class ArrayOps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        Access.array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element:");
            Access.array[i] = sc.nextInt();
        }

        System.out.println("Displaying the array:");
        for (int i = 0; i < size; i++) {
            System.out.println(Access.array[i] + "\t");
        }

        boolean run = true;

        while (run) {

            System.out.println(
                "\n1. Display\n" +
                "2. Get value at an index\n" +
                "3. Update\n" +
                "4. Search\n" +
                "5. Sort\n" +
                "6. Exit"
            );

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Displaying the array:");

                    for (int i = 0; i < size; i++) {
                        System.out.print(Access.array[i] + "\t");
                    }

                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter your index:");
                    int index = sc.nextInt();

                    if (index >= 0 && index < size) {
                        System.out.println(
                            "Number: " + Access.index(index)
                        );
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;

                case 3:
                    System.out.println("Enter the index to update:");
                    int up = sc.nextInt();

                    if (up >= 0 && up < size) {

                        System.out.println("Enter the new number:");
                        int num = sc.nextInt();

                        Access.update(up, num);

                        System.out.println("Number is updated");
                        System.out.println("New Array:");

                        for (int i = 0; i < size; i++) {
                            System.out.print(Access.array[i] + "\t");
                        }

                        System.out.println();

                    } else {
                        System.out.println("Invalid index");
                    }

                    break;

                case 4:
                    System.out.println("Enter your number:");
                    int num = sc.nextInt();

                    int found = Access.search(num);

                    if (found != -1) {
                        System.out.println(
                            "Number is at index " + found
                        );
                    } else {
                        System.out.println("Number not found");
                    }

                    break;

                case 5:
                    Access.sorting();

                    System.out.println("Sorted array:");

                    for (int i = 0; i < size; i++) {
                        System.out.print(Access.array[i] + "\t");
                    }

                    System.out.println();
                    break;

                case 6:
                    run = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
