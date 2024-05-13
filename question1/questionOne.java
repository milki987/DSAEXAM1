package question1;

import java.util.Scanner;

public class questionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        //since the user is asked the same time as the size they just put as an input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to be searched: ");
        int searchNumber = scanner.nextInt();

        int count = searchNumberInArray(array, searchNumber);
        if (count > 0) {
            System.out.println("The number " + searchNumber + " is present in the array " + count + " times.");
        } else {
            System.out.println("The number " + searchNumber + " is not present in the array.");
        }


    }
    public static int searchNumberInArray(int[] array, int searchNumber) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (searchNumber == array[i]) {
                count++;
            }
        }
        return count;

    }
}


