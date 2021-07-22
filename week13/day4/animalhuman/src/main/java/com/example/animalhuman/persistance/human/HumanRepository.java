package com.example.animalhuman.persistance.human;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.animalhuman.persistance.human.entity.Human;

@Repository
public interface HumanRepository extends JpaRepository<Human, Long> {
}
