/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyencongngo.hibernate;

import java.io.File;
import nguyencongngo.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Admin
 */
public class MySessionFactory {

    private static final SessionFactory sessionFactory;

    static {
        File file = new File("N:\\Java\\web_api\\src\\main\\webapp\\hibernate.cfg.xml");
        sessionFactory = new Configuration()
                .configure(file)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
