package service;

import entity.Animal;
import entity.Human;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AnimalService {
    private static SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Animal.class)
            .addAnnotatedClass(Human.class)
            .buildSessionFactory();

    public static void create(Animal animal) {
        sessionFactory.getCurrentSession().beginTransaction();
        sessionFactory.getCurrentSession().save(animal);
        sessionFactory.getCurrentSession().getTransaction().commit();
    }

    public static Animal getAnimalById(long id) {
        sessionFactory.getCurrentSession().beginTransaction();
        Session currentSession = sessionFactory.getCurrentSession();
        Animal animal = currentSession.find(Animal.class, id);
        currentSession.getTransaction().commit();
        return animal;
    }

    public static void update(Animal animal) {
        sessionFactory.getCurrentSession().beginTransaction();
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.update(animal);
        currentSession.getTransaction().commit();
    }

    public static void delete(Animal animal) {
        sessionFactory.getCurrentSession().beginTransaction();
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.delete(animal);
        currentSession.getTransaction().commit();
    }
}
