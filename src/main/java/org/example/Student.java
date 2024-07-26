package org.example;

public class Student {
    // Fields representing student details
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    // Constructor to initialize the student object
    public Student(int id, String name, int grade) {
        this.feesPaid = 0; // Initialize feesPaid to 0
        this.feesTotal = 30000; // Set the total fees for the student
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Method to set the grade of the student
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Method for the student to pay fees
    public void payFees(int fees) {
        feesPaid += fees; // Update fees paid
        School.updateTotalMoneyEarned(fees); // Update total money earned by the school
    }

    // Getters for student details
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    // Method to calculate remaining fees
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    // Override toString method to display student details
    @Override
    public String toString() {
        return "Student's name: " + name +
                " Total fees paid so far: $" + feesPaid;
    }
}
