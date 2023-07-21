package day09.practice;


import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Task1 {
	private int id;
	private String name;
	private LocalDate deadline;
	private int priority;

	public Task1(int id, String name, LocalDate deadline, int priority) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
		this.priority = priority;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public int getPriority() {
		return priority;
	}

}

class PriorityComparator implements Comparator<Task1> {
	public int compare(Task1 t1, Task1 t2) {
		int deadlineComparison = t1.getDeadline().compareTo(t2.getDeadline());
		if (deadlineComparison != 0) {
			return deadlineComparison;
		} else {
			if (t1.getPriority() == t2.getPriority())
				return 0;
			else if (t1.getPriority() > t2.getPriority())
				return 1;
			else
				return -1;
		}
	}
}

public class TaskSorting2 {
	public static void main(String[] args) {
		ArrayList<Task1> tasks = new ArrayList<>();

		Task1 modelTask1 = new Task1(3, "Eat", LocalDate.parse("2022-10-22", DateTimeFormatter.ofPattern("yyyy-MM-dd")),
				3);
		Task1 modelTask2 = new Task1(5, "Sleep",
				LocalDate.parse("2022-10-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")), 1);
		Task1 modelTask3 = new Task1(1, "Study",
				LocalDate.parse("2022-10-07", DateTimeFormatter.ofPattern("yyyy-MM-dd")), 2);
		Task1 modelTask4 = new Task1(3, "Code",
				LocalDate.parse("2022-10-22", DateTimeFormatter.ofPattern("yyyy-MM-dd")), 1);

		// Sample tasks
		tasks.add(modelTask1);
		tasks.add(modelTask2);
		tasks.add(modelTask3);
		tasks.add(modelTask4);

		Collections.sort(tasks, new PriorityComparator());

		for (Task1 task : tasks) {
			System.out
					.println(task.getId() + "," + task.getName() + "," + task.getDeadline() + "," + task.getPriority());
		}
	}
}