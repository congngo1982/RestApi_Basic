/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyencongngo.repository;

import java.util.List;
import nguyencongngo.entity.Student;
import nguyencongngo.hibernate.MySessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public class StudentDAO implements IStudentDAO {

    private final SessionFactory sessionFactory;

    public StudentDAO() {
        this.sessionFactory = MySessionFactory.getSessionFactory();
        System.out.println("asas: " + sessionFactory);
    }

    @Override
    public List<Student> getList() {
        Session session = null;

        List<Student> list = null;
        session = sessionFactory.openSession();
        try {
            session.getTransaction().begin();
            Query<Student> query = session.createQuery("From Student", Student.class);
            list = query.getResultList();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("ERRRRORRORRO: " + e);
        } finally {
            session.close();
        }

        return list;
    }

    @Override
    public Student getStudent(int id) {
        Session session = null;
        Student stu = null;
        session = sessionFactory.openSession();
        try {
            session.getTransaction().begin();
            stu = session.get(Student.class, id);
        } catch (Exception e) {
        } finally {
            session.close();
        }
        return stu;
    }

    @Override
    public boolean deleteStudent(int id) {
        boolean result = false;
        Session session = null;
        Student stu = null;
        session = sessionFactory.openSession();
        try {
            session.getTransaction().begin();
            Student std = session.get(Student.class, id);
            System.out.println("Student: " + std);
            session.delete(std);
            result = true;
            System.out.println("Result: " + result);
            session.getTransaction().commit();
        } catch (Exception e) {
        } finally {
            session.close();
        }
        return result;
    }

    @Override
    public Student saveStudent(Student stdnt) {
        Session session = null;
        Student stu = null;
        session = sessionFactory.openSession();
        try {
            session.getTransaction().begin();
            stu = stdnt;
            session.save(stu);
        } catch (Exception e) {
        } finally {
            session.close();
        }
        return stu;
    }

}
