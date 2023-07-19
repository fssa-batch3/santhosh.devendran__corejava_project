package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create an ArrayList with duplicate entries
        ArrayList<Integer> numbersWithDuplicates = new ArrayList<>();
        numbersWithDuplicates.add(1);
        numbersWithDuplicates.add(2);
        numbersWithDuplicates.add(3);
        numbersWithDuplicates.add(2);
        numbersWithDuplicates.add(4);
        numbersWithDuplicates.add(1);
        
        // Use a HashSet to remove duplicates
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbersWithDuplicates);
        
        // Display the unique values
        System.out.println("Unique numbers:");
        for (Integer number : uniqueNumbers) {
            System.out.println(number);
        }
    }
}
