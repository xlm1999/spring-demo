package com.meng.dao;

import com.meng.entity.Student;
import com.meng.entity.StudentMarks;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    public void setDataSource(DataSource ds);
    /**
     * This is the method to be used to create
     * a record in the Student and Marks tables.
     */
    public void create(String name, Integer age, Integer marks, Integer year);
    /**
     * This is the method to be used to list down
     * all the records from the Student and Marks tables.
     */
    public List<StudentMarks> listStudents();
}
