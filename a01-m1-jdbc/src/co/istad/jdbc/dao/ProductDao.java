package co.istad.jdbc.dao;

import co.istad.jdbc.model.Product;

import java.util.List;

public interface ProductDao {

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
