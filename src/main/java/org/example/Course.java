package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    // Fields representing course details
    private int courseId;
    private String courseName;
    private Teacher teacher;
    private List<Student> students;

    // Constructor to initialize the course object
    public Course(int courseId, String courseName, Teacher teacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = new ArrayList<>(); // Initialize the list of students
    }

    // Getters and setters for course details
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    // Method to add a student to the course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to remove a student from the course
    public void removeStudent(Student student) {
        students.remove(student);
    }

    // Override toString method to display course details
    @Override
    public String toString() {
        return "Course ID: " + courseId +
                ", Course Name: " + courseName +
                ", Teacher: " + teacher.getName() +
                ", Number of Students: " + students.size();
    }
}
