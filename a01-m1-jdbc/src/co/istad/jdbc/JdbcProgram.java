package co.istad.jdbc;

import co.istad.jdbc.config.DbConfig;
import co.istad.jdbc.dao.ProductDao;
import co.istad.jdbc.dao.ProductDaoImpl;
import co.istad.jdbc.model.Product;
import co.istad.jdbc.util.InputUtil;
import co.istad.jdbc.view.ViewUtil;

import java.math.BigDecimal;
import java.util.List;

public class JdbcProgram {

    private ProductDao productDao;

    public static void main(String[] args) {
        DbConfig.init();
        new JdbcProgram().run();
    }

    private void run() {
        productDao = new ProductDaoImpl();

        do {
            ViewUtil.printMenu();
            int menu = InputUtil.getInteger("Enter menu option: ");

            switch (menu) {
                case 1 -> {
                    try {
                        List<Product> products = productDao.findAll();
                        ViewUtil.printProductList(products);
                    } catch (RuntimeException e) {
                        System.out.println("Database is errored");
                    }
                }
                case 2 -> System.out.println("Search");
                case 3 -> {
                    ViewUtil.printHeader("Add a new product");
                    String code = InputUtil.getText("Enter code: ");
                    String name = InputUtil.getText("Enter name: ");
                    BigDecimal price = InputUtil.getMoney("Enter price: ");
                    Integer qty = InputUtil.getInteger("Enter qty: ");

                    // Create a new product object
                    Product newProduct = new Product(code, name, price, qty, false);

                    try {
                        int affectedRow = productDao.insert(newProduct);
                        if (affectedRow > 0) {
                            ViewUtil.printHeader("Insert a new product successfully..!");
                        } else {
                            ViewUtil.printHeader("Insert operation is not affected");
                        }
                    } catch (RuntimeException e) {
                        ViewUtil.printHeader(e.getMessage());
                    }
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid menu");
            }
        } while (true);
    }
}
