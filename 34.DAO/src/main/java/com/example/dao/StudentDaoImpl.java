package com.example.dao;

import com.example.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private final List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<>();
        students.add(new Student("Sonoo", 0));
        students.add(new Student("Jaiswal", 1));
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Updated Student: Roll No " + student.getRollNo());
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Deleted Student: Roll No " + student.getRollNo());
    }
}
