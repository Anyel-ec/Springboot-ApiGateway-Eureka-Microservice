package top.anyel.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.anyel.product.model.Product;

/*
 * Author: Anyel EC
 * Github: https://github.com/Anyel-ec
 * Creation date: 05/03/2025
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
