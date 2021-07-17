package service;

import entity.Animal;
import entity.Human;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HumanService {
    private static SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Animal.class)
            .addAnnotatedClass(Human.class)
            .buildSessionFactory();

    public static Human getHumanById(long ownerId) {
        sessionFactory.getCurrentSession().beginTransaction();
        Session currentSession = sessionFactory.getCurrentSession();
        Human human = currentSession.find(Human.class, ownerId);
        sessionFactory.getCurrentSession().getTransaction().commit();
        return human;
    }

    public static void updateAnimalList(Human owner, Animal animal) {
        owner.getAnimals().add(animal);
    }

    public static void create(Human human) {
        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.save(human);
        transaction.commit();
    }

    public static void update(Human human) {
        sessionFactory.getCurrentSession().beginTransaction();
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.update(human);
        currentSession.getTransaction().commit();
    }

    public static void delete(Human human){
        sessionFactory.getCurrentSession().beginTransaction();
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.delete(human);
        currentSession.getTransaction().commit();
    }
}
