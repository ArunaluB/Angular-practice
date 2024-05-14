package Edu.sliit.Angular.practice.repository;

import Edu.sliit.Angular.practice.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
