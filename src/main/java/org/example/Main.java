package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Teachers
        Teacher donnie = new Teacher(1, "Donnie", 2300);
        Teacher george = new Teacher(2, "George", 2000);
        Teacher isaac = new Teacher(3, "Isaac", 2000);
        Teacher debbie = new Teacher(4, "Debbie", 2400);
        Teacher lisa = new Teacher(5, "Lisa", 2200);
        Teacher dejia = new Teacher(6, "Dejia", 2200);

        // Add teachers to the list
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(donnie);
        teacherList.add(george);
        teacherList.add(isaac);
        teacherList.add(debbie);
        teacherList.add(lisa);
        teacherList.add(dejia);

        // Create Students
        Student dean = new Student(1, "Dean", 10);
        Student devon = new Student(2, "Devon", 11);
        Student joe = new Student(3, "Joe", 12);
        Student alice = new Student(4, "Alice", 9);
        Student bob = new Student(5, "Bob", 10);
        Student charlie = new Student(6, "Charlie", 11);
        Student dave = new Student(7, "Dave", 12);
        Student eva = new Student(8, "Eva", 9);

        // Add students to the list
        List<Student> studentList = new ArrayList<>();
        studentList.add(dean);
        studentList.add(devon);
        studentList.add(joe);
        studentList.add(alice);
        studentList.add(bob);
        studentList.add(charlie);
        studentList.add(dave);
        studentList.add(eva);

        // Create School
        School fphs = new School(teacherList, studentList);

        // Add new Teachers
        Teacher frank = new Teacher(7, "Frank", 1900);
        Teacher megan = new Teacher(8, "Megan", 2100);
        fphs.addTeacher(frank);
        fphs.addTeacher(megan);

        // Create Courses
        Course math = new Course(101, "Math", donnie);
        Course science = new Course(102, "Science", george);
        Course english = new Course(103, "English", frank);
        Course history = new Course(104, "History", isaac);
        Course art = new Course(105, "Art", debbie);
        Course physicalEducation = new Course(106, "Physical Education", lisa);
        Course music = new Course(107, "Music", megan);
        Course computerScience = new Course(108, "Computer Science", dejia);

        // Enroll Students in Courses
        math.addStudent(dean);
        math.addStudent(devon);
        math.addStudent(alice);
        math.addStudent(bob);

        science.addStudent(joe);
        science.addStudent(charlie);
        science.addStudent(dave);
        science.addStudent(eva);

        english.addStudent(dean);
        english.addStudent(alice);
        english.addStudent(dave);
        english.addStudent(eva);

        history.addStudent(devon);
        history.addStudent(bob);
        history.addStudent(joe);
        history.addStudent(charlie);

        art.addStudent(dean);
        art.addStudent(devon);
        art.addStudent(alice);
        art.addStudent(bob);

        physicalEducation.addStudent(joe);
        physicalEducation.addStudent(charlie);
        physicalEducation.addStudent(dave);
        physicalEducation.addStudent(eva);

        music.addStudent(dean);
        music.addStudent(alice);
        music.addStudent(dave);
        music.addStudent(eva);

        computerScience.addStudent(devon);
        computerScience.addStudent(bob);
        computerScience.addStudent(joe);
        computerScience.addStudent(charlie);

        // Students pay fees
        dean.payFees(6000);
        devon.payFees(7000);
        joe.payFees(8000);
        alice.payFees(5000);
        bob.payFees(6000);
        charlie.payFees(5000);
        dave.payFees(6000);
        eva.payFees(7000);

        // Pay Salaries
        donnie.receiveSalary(donnie.getSalary());
        george.receiveSalary(george.getSalary());
        isaac.receiveSalary(isaac.getSalary());
        debbie.receiveSalary(debbie.getSalary());
        lisa.receiveSalary(lisa.getSalary());
        dejia.receiveSalary(dejia.getSalary());
        frank.receiveSalary(frank.getSalary());
        megan.receiveSalary(megan.getSalary());

        // Output School Financial Summary
        System.out.println("FPHS Financial Summary:");
        System.out.println("Total Money Earned: $" + fphs.getTotalMoneyEarned());
        System.out.println("Total Money Spent: $" + fphs.getTotalMoneySpent());

        // Output Teacher Salary Details
        System.out.println("\nTeacher Salary Details:");
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }

        // Output Student Fee Details
        System.out.println("\nStudent Fee Payment Details:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Output Course Details
        System.out.println("\nCourse Details:");
        System.out.println(math);
        System.out.println(science);
        System.out.println(english);
        System.out.println(history);
        System.out.println(art);
        System.out.println(physicalEducation);
        System.out.println(music);
        System.out.println(computerScience);
    }
}
