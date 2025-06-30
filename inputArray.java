import java.util.Scanner;
import java.util.Arrays;

public class ArrayInputPrint {

    public static int[] inputArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;}
    }

    public static void printArray(int[] array) {
         System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] myArray = inputArray(size);
        System.out.print("The array is: ");
        printArray(myArray);
        scanner.close();
    }
}