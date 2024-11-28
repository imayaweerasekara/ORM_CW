package org.example.db;

import org.example.entity.Programs;
import org.example.entity.Enrollment;
import org.example.entity.Student;
import org.example.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.util.Properties;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() {
        try {
            Properties properties = new Properties();
            FileInputStream input = new FileInputStream("src/main/resources/hibernate.properties");
            properties.load(input);
            Configuration configuration = new Configuration();
            configuration.setProperties(properties)
                    .addAnnotatedClass(Users.class)
                    .addAnnotatedClass(Programs.class)
                    .addAnnotatedClass(Enrollment.class)
                    .addAnnotatedClass(Student.class);
            sessionFactory = configuration.buildSessionFactory();
        } catch (Exception e){

        }
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public static FactoryConfiguration getInstance() {
        if (factoryConfiguration == null) {
            factoryConfiguration = new FactoryConfiguration();
        }
        return factoryConfiguration;
    }
}

