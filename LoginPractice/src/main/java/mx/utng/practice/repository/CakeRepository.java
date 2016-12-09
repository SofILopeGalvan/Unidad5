package mx.utng.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Cake;

@Repository
public interface CakeRepository extends JpaRepository<Cake,Long> {

}
