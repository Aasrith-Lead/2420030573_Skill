package myproject;
import java.util.*;

public class date_example {
public static void main(String[] args) {
	Date d = new Date();
	System.out.println("Current date is " +d);
	int month = d.getMonth();
	System.out.println("The month : " +month);
	int year = d.getYear();
	System.out.println("The year : " +year);
	System.out.println("The minutes : " +d.getMinutes());
	System.out.println("The Hours : " +d.getHours());
}
}
