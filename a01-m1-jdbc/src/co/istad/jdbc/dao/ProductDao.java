package co.istad.jdbc.dao;

import co.istad.jdbc.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDao {


    Optional<Product> findByCode(String code);


    /**
     * Update an existing product by code (name, price, qty)
     * @param code is identifier of product
     * @param updateProduct is new data
     */
    int updateByCode(String code, Product updateProduct);

    /**
     * Delete an existing product by code
     * Code is required
     * @return affected row number
     */
    int deleteByCode(String code);


    /**
     * Insert a new record into DB
     * New data is product
     * @return affected row number
     */
    int insert(Product product);

    // 1. Read all records from DB
    // * Expected return value => multiple rows of product
    // * Parameters
    List<Product> findAll();
}
