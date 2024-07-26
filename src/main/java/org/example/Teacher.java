package org.example;

public class Teacher {
    // Fields representing teacher details
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    // Constructor to initialize the teacher object
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0; // Initialize salaryEarned to 0
    }

    // Getters and setters for teacher details
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method for the teacher to receive salary
    public void receiveSalary(int salary) {
        salaryEarned += salary; // Update salary earned
        School.updateTotalMoneySpent(salary); // Update total money spent by the school
    }

    // Override toString method to display teacher details
    @Override
    public String toString() {
        return "Teacher's name: " + name +
                " Total salary earned so far: $" + salaryEarned;
    }
}
