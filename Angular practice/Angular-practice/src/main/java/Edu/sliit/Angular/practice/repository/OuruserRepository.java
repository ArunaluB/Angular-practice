package Edu.sliit.Angular.practice.repository;

import Edu.sliit.Angular.practice.entity.ourUsers;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OuruserRepository extends CrudRepository<ourUsers,Integer> {
    Optional<ourUsers> findByEmail(String email);
}
