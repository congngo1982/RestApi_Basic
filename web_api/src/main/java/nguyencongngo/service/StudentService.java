/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyencongngo.service;

import java.util.List;
import javax.transaction.Transactional;
import nguyencongngo.entity.Student;
import nguyencongngo.repository.IStudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class StudentService implements IStudentService {

    @Autowired
    IStudentDAO dao;

    @Override
    @Transactional
    public List<Student> getList() {
        return dao.getList();
    }

    @Override
    @Transactional
    public Student getStudent(int id) {
        return dao.getStudent(id);
    }

    @Override
    @Transactional
    public Student saveStudent(Student stdnt) {
        return dao.saveStudent(stdnt);
    }

    @Override
    @Transactional
    public boolean deleteStudent(int i) {
        return dao.deleteStudent(i);
    }

}
