package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseId;
    private String courseName;
    private Teacher teacher;
    private List<Student> students;

    public Course(int courseId, String courseName, Teacher teacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

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

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId +
                ", Course Name: " + courseName +
                ", Teacher: " + teacher.getName() +
                ", Number of Students: " + students.size();
    }
}