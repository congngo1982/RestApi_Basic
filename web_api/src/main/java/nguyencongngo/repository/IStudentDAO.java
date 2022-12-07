/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package nguyencongngo.repository;

import java.util.List;
import nguyencongngo.entity.Student;

/**
 *
 * @author Admin
 */
public interface IStudentDAO {
    public List<Student> getList();
    public Student getStudent(int id);
    public boolean deleteStudent(int id);
    public Student saveStudent(Student std);
}
