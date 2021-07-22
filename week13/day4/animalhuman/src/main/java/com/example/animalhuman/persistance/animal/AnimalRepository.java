package com.example.animalhuman.persistance.animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.animalhuman.persistance.animal.entity.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
