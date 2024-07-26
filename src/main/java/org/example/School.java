package org.example;

import java.util.List;

public class School {
    // Fields representing school details
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    // Constructor to initialize the school object
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0; // Initialize totalMoneyEarned to 0
        totalMoneySpent = 0; // Initialize totalMoneySpent to 0
    }

    // Getters for school details
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    // Static methods to update total money earned and spent
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
    }

    // Getters for financial summary
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
}
