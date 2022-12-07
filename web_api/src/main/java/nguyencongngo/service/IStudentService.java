/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package nguyencongngo.service;

import java.util.List;
import nguyencongngo.entity.Student;

/**
 *
 * @author Admin
 */
public interface IStudentService {
    public List<Student> getList();
    public Student getStudent(int id);
    public Student saveStudent(Student stu);
    public boolean deleteStudent(int id);
}
