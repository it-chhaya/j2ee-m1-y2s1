package co.istad.jdbc.dao;

import co.istad.jdbc.config.DbConfig;
import co.istad.jdbc.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// Concrete class implements interface (super class)
public class ProductDaoImpl implements ProductDao {

    private final Connection conn;

    public ProductDaoImpl() {
        conn = DbConfig.getInstance();
    }


    @Override
    public int insert(Product product) {
        try {
            final String SQL = """
                    INSERT INTO products (code, name, price, qty, is_deleted)
                    VALUES (?,?,?,?,?)
                    """;
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, product.getCode());
            pstmt.setString(2, product.getName());
            pstmt.setBigDecimal(3, product.getPrice());
            pstmt.setInt(4, product.getQty());
            pstmt.setBoolean(5, product.getDeleted());

            return pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }


    @Override
    public List<Product> findAll() {
        try {
            // Step 4: Create statement object
            Statement stmt = conn.createStatement();

            // Step 5: Start executing SQL Query
            final String sql = """
                    SELECT *
                    FROM products
                    """;

            // Step 6: Handle ResultSet
            ResultSet rs = stmt.executeQuery(sql);

            List<Product> products = new ArrayList<>();
            // Multiple rows
            while(rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setCode(rs.getString("code"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getBigDecimal("price"));
                product.setQty(rs.getInt("qty"));
                product.setDeleted(rs.getBoolean("is_deleted"));
                products.add(product);
            }

            return products;

        } catch (SQLException e) {
            System.out.println("SQL errored: " + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }

}
