package service;

import dao.Dao;
import entity.Animal;
import entity.Human;

public class HumanService {

    private Dao dao;

    public Human getHumanById(long ownerId) {
        return dao.getHuman(ownerId);
    }

    public void updateAnimalList(Human owner, Animal animal) {
        owner.getAnimals().add(animal);
    }

    public void create(Human human) {
        dao.createHuman(human);
    }

    public void update(Human human) {
        dao.updateHuman(human);
    }

    public void delete(Human human) {
        dao.deleteHuman(human);
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }
}
