package co.istad.jdbc.dao;

import co.istad.jdbc.model.Product;

import java.util.List;

public interface ProductDao {

    /**
     * Insert a new record into DB
     * New data is product
     * @return affected row number
     */
    int insert(Product product);

    // 1. Read all records from DB
    // * Expected return value
    // * Parameters
    List<Product> findAll();

}
