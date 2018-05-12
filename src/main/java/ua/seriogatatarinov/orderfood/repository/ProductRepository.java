package ua.seriogatatarinov.orderfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.seriogatatarinov.orderfood.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
