package com.inflation.meter.myapp.repository;

import com.inflation.meter.myapp.domain.Product;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data JPA repository for the Product entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    @Query(value = "select distinct(name) from product;", nativeQuery = true)
    public List<String> findAllNameProducts();
}
