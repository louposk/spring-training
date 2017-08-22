package com.kl.Dao;

import com.kl.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudentById(Student student);

    void insertStudentToDb(Student student);
}
