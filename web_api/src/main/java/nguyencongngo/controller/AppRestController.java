/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyencongngo.controller;

import java.util.List;
import nguyencongngo.entity.Student;
import nguyencongngo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        try {
            return service.getStudent(id);
        } catch (Exception e) {
        }
        return null;
    }
}
