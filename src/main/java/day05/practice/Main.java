package day05.practice;

class Department {
    String deptName;
    int deptId;

    public Department(String deptName, int deptId) {
        this.deptName = deptName;
        this.deptId = deptId;
    }
}

class Student {
    String name;
    int id;
    Department department;

    public Student(String name, int id, Department department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student Details:\n" +
                "Name: " + name + "\n" +
                "ID: " + id + "\n" +
                "Department: " + department.deptName + "\n" +
                "Department ID: " + department.deptId;
    }
}

public class Main {
    public static void main(String[] args) {
        Department department = new Department("Computer Science", 1111);
        Student student = new Student("santhosh devendran", 10096, department);

        System.out.println(student);
    }
}
