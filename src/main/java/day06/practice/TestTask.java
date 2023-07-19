package day06.practice;

import java.util.ArrayList;

public class TestTask {
	public static void main(String[] args) {

		// #Question 1
		ArrayList<Task> tasks = new ArrayList<>();

		Task task1 = new Task("Open The Door", 1);
		Task task2 = new Task("Close the Door", 2);

		tasks.add(task1);
		tasks.add(task2);

		for (Task task : tasks) {
			System.out.println("Task Name: " + task.taskName);
			System.out.println("Priority: " + task.priority);
			System.out.println();
		}

		// #Question 2
		boolean found = findTaskByName("Close the Door", tasks);

		if (found == true) {
			System.out.println("Task Successfully found :) ");
		} else {
			System.out.println("Task Not Found :( ");
		}

	}

	private static boolean findTaskByName(String name, ArrayList<Task> tasks) {
		for (Task task : tasks) {
			if (task.taskName.equals(name)) {
				return true;
			}
		}
		return false;
	}
}