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

        // ================= ARRAY OPERATIONS =================

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        Access.array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element:");
            Access.array[i] = sc.nextInt();
        }

        System.out.println("Displaying the array:");

        for (int i = 0; i < size; i++) {
            System.out.print(Access.array[i] + "\t");
        }

        System.out.println();

        boolean run = true;

        while (run) {

            System.out.println("\nArray Operations");
            System.out.println("1. Display");
            System.out.println("2. Get value at an index");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Sort");
            System.out.println("6. Exit");

            System.out.println("Enter your choice:");
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
                    int searchNumber = sc.nextInt();

                    int found = Access.search(searchNumber);

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


        // ================= STRING OPERATIONS =================

        sc.nextLine();

        System.out.println("\nEnter a string:");
        String str = sc.nextLine();

        boolean stringRun = true;

        while (stringRun) {

            System.out.println("\nString Operations");
            System.out.println("1. Display the string");
            System.out.println("2. Find string length");
            System.out.println("3. Find character at index");
            System.out.println("4. Convert to uppercase");
            System.out.println("5. Convert to lowercase");
            System.out.println("6. Extract substring");
            System.out.println("7. Find position of substring");
            System.out.println("8. Replace old word with new word");
            System.out.println("9. Check if word exists");
            System.out.println("10. Exit");

            System.out.println("Enter your choice:");
            int stringChoice = sc.nextInt();
            sc.nextLine();

            switch (stringChoice) {

                case 1:
                    System.out.println("String: " + str);
                    break;

                case 2:
                    System.out.println(
                        "Length: " + str.length()
                    );
                    break;

                case 3:
                    System.out.println("Enter the index:");
                    int index = sc.nextInt();

                    if (index >= 0 && index < str.length()) {
                        System.out.println(
                            "Character: " + str.charAt(index)
                        );
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;

                case 4:
                    System.out.println(
                        "Uppercase: " + str.toUpperCase()
                    );
                    break;

                case 5:
                    System.out.println(
                        "Lowercase: " + str.toLowerCase()
                    );
                    break;

                case 6:
                    System.out.println("Enter start index:");
                    int start = sc.nextInt();

                    System.out.println("Enter end index:");
                    int end = sc.nextInt();

                    if (start >= 0 &&
                        end <= str.length() &&
                        start <= end) {

                        System.out.println(
                            "Substring: " +
                            str.substring(start, end)
                        );

                    } else {
                        System.out.println("Invalid index");
                    }

                    break;

                case 7:
                    System.out.println("Enter the substring:");
                    String search = sc.nextLine();

                    int position = str.indexOf(search);

                    if (position != -1) {
                        System.out.println(
                            "Substring found at index " + position
                        );
                    } else {
                        System.out.println("Substring not found");
                    }

                    break;

                case 8:
                    System.out.println("Enter the old word:");
                    String oldWord = sc.nextLine();

                    System.out.println("Enter the new word:");
                    String newWord = sc.nextLine();

                    str = str.replace(oldWord, newWord);

                    System.out.println(
                        "Updated string: " + str
                    );

                    break;

                case 9:
                    System.out.println("Enter a word:");
                    String word = sc.nextLine();

                    if (str.contains(word)) {
                        System.out.println("Word exists");
                    } else {
                        System.out.println("Word not found");
                    }

                    break;

                case 10:
                    stringRun = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }


        // ================= VECTOR OPERATIONS =================

        Vector<String> student = new Vector<String>();

        System.out.println("\nEnter the size of vector:");
        int vsize = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < vsize; i++) {
            System.out.println("Enter string element:");
            student.add(sc.nextLine());
        }

        boolean vectorRun = true;

        while (vectorRun) {

            System.out.println("\nVector Operations");
            System.out.println("1. Add");
            System.out.println("2. Insert");
            System.out.println("3. Get");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Search");
            System.out.println("7. Size");
            System.out.println("8. Exit");

            System.out.println("Enter your choice:");
            int vectorChoice = sc.nextInt();
            sc.nextLine();

            switch (vectorChoice) {

                case 1:
                    System.out.println("Enter a new element:");
                    String element = sc.nextLine();

                    student.add(element);

                    System.out.println("Element added");
                    break;

                case 2:
                    System.out.println("Enter the position:");
                    int position = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter the element:");
                    String value = sc.nextLine();

                    if (position >= 0 &&
                        position <= student.size()) {

                        student.add(position, value);

                        System.out.println("Element inserted");

                    } else {
                        System.out.println("Invalid position");
                    }

                    break;

                case 3:
                    System.out.println("Enter the index:");
                    int index = sc.nextInt();

                    if (index >= 0 &&
                        index < student.size()) {

                        System.out.println(
                            "Element: " + student.get(index)
                        );

                    } else {
                        System.out.println("Invalid index");
                    }

                    break;

                case 4:
                    System.out.println("Enter the index:");
                    int updateIndex = sc.nextInt();
                    sc.nextLine();

                    if (updateIndex >= 0 &&
                        updateIndex < student.size()) {

                        System.out.println("Enter the new element:");
                        String newElement = sc.nextLine();

                        student.set(updateIndex, newElement);

                        System.out.println("Element updated");

                    } else {
                        System.out.println("Invalid index");
                    }

                    break;

                case 5:
                    System.out.println("Enter the index:");
                    int deleteIndex = sc.nextInt();

                    if (deleteIndex >= 0 &&
                        deleteIndex < student.size()) {

                        student.remove(deleteIndex);

                        System.out.println("Element deleted");

                    } else {
                        System.out.println("Invalid index");
                    }

                    break;

                case 6:
                    System.out.println("Enter an element:");
                    String searchElement = sc.nextLine();

                    if (student.contains(searchElement)) {
                        System.out.println("Element exists");
                    } else {
                        System.out.println("Element not found");
                    }

                    break;

                case 7:
                    System.out.println(
                        "Total number of elements: "
                        + student.size()
                    );
                    break;

                case 8:
                    vectorRun = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
