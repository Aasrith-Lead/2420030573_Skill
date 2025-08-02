package myproject;
import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int D = sc.nextInt();

        int num[] = new int[D];

        System.out.println("Enter " + D + " elements:");
        for (int i = 0; i < D; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("You entered:");
        for (int i = 0; i < D; i++) {
            System.out.println("Element " + (i+1) + ": " + num[i]);
        }
	}
}