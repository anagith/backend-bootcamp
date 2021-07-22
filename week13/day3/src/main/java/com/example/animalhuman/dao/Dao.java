package com.example.animalhuman.dao;


import com.example.animalhuman.entity.Animal;
import com.example.animalhuman.entity.Human;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Dao {
    private static SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Animal.class)
            .addAnnotatedClass(Human.class)
            .buildSessionFactory();

    public void createAnimal(Animal animal) {
        sessionFactory.getCurrentSession().beginTransaction();
        sessionFactory.getCurrentSession().save(animal);
        sessionFactory.getCurrentSession().getTransaction().commit();
    }

    public Animal getAnimal(long id) {
        sessionFactory.getCurrentSession().beginTransaction();
        Session currentSession = sessionFactory.getCurrentSession();
        Animal animal = currentSession.find(Animal.class, id);
        currentSession.getTransaction().commit();
        return animal;
    }

    public void updateAnimal(Animal animal) {
        sessionFactory.getCurrentSession().beginTransaction();
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.update(animal);
        currentSession.getTransaction().commit();
    }

    public void deleteAnimal(Animal animal) {
        sessionFactory.getCurrentSession().beginTransaction();
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.delete(animal);
        currentSession.getTransaction().commit();
    }

    public Human getHuman(long ownerId) {
        sessionFactory.getCurrentSession().beginTransaction();
        Session currentSession = sessionFactory.getCurrentSession();
        Human human = currentSession.find(Human.class, ownerId);
        sessionFactory.getCurrentSession().getTransaction().commit();
        return human;
    }

    public void createHuman(Human human) {
        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.save(human);
        transaction.commit();
    }

    public void updateHuman(Human human) {
        sessionFactory.getCurrentSession().beginTransaction();
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.update(human);
        currentSession.getTransaction().commit();
    }

    public void deleteHuman(Human human) {
        sessionFactory.getCurrentSession().beginTransaction();
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.delete(human);
        currentSession.getTransaction().commit();
    }
}
