package myproject;

public class Arrays_4 {
	    public static void main(String[] args) {
	        int[] arr = {3, 6, 9, 12};
	        int sum = 0;

	        for(int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        System.out.println("Sum of elements: " + sum);
	    }
}
