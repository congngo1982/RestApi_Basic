/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyencongngo.controller;

import java.util.List;
import nguyencongngo.entity.Student;
import nguyencongngo.exceptionhandle.StudentDeleteException;
import nguyencongngo.exceptionhandle.StudentNotFoundException;
import nguyencongngo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */
@RestController
@RequestMapping("/api")
public class AppRestController {

    @Autowired
    IStudentService service;

    @GetMapping("/student")
    public List<Student> getList() {
        return service.getList();
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id) {
        Student std = service.getStudent(id);
        if (std == null) {
            throw new StudentNotFoundException("Customer Id not found: " + id);
        }
        return std;
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable int id) {
        boolean result = service.deleteStudent(id);
        if (result == false) {
            throw new StudentDeleteException("Cannot delete Student");
        }
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student stu) {
        Student std = service.saveStudent(stu);
        return std;
    }
}
