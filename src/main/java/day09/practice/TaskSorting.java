package day09.practice;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

class Task implements Comparable<Task> {
	private int id;
	private String name;
	private LocalDate deadline;

	public Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
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

	@Override
	public int compareTo(Task t) {

		if (this.getDeadline() == t.getDeadline()) {
			return 0;
		} else {
			if (this.getDeadline().isAfter(t.deadline)) {
				return 1;
			} else {
				return -1;
			}
		}
	}

}

public class TaskSorting {
	public static void main(String[] args) {
		ArrayList<Task> tasks = new ArrayList<>();

		Task modelTask1 = new Task(3, "Eat", LocalDate.parse("2022-10-22", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		Task modelTask2 = new Task(5, "Sleep",
				LocalDate.parse("2022-10-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		Task modelTask3 = new Task(1, "Study",
				LocalDate.parse("2022-10-07", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		Task modelTask4 = new Task(3, "Code", LocalDate.parse("2022-10-22", DateTimeFormatter.ofPattern("yyyy-MM-dd")));

		tasks.add(modelTask1);
		tasks.add(modelTask2);
		tasks.add(modelTask3);
		tasks.add(modelTask4);

		Collections.sort(tasks);

		for (Task task : tasks) {
			System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline());
		}
	}
}
