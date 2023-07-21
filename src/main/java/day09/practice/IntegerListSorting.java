package day09.practice;


import java.util.ArrayList;
import java.util.Collections;

public class IntegerListSorting {
	public static void main(String[] args) {

		String input = "8,9,45,12,1";

		String[] numbers = input.split(",");
		ArrayList<Integer> list = new ArrayList<>();

		for (String number : numbers) {
			list.add(Integer.parseInt(number));
		}

		Collections.sort(list);

		System.out.print("Sorted list: ");
		for (Integer num : list) {
			System.out.print(num + " ");
		}
	}
}