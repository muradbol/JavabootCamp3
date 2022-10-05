package business;

import core.logging.Logger;
import dataAcces.HibernateProductDao;
import dataAcces.JdbcProducthDao;
import dataAcces.ProductDao;
import entities.Product;

import java.util.List;

public class ProductManager {
    private Logger[] loggers;
    public ProductManager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers=loggers;

    }

    private ProductDao productDao;


    public void add(Product product) throws Exception {
        //iş kuralları
        if (product.getUnitPrice()<10) {
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }
        productDao.add(product);
        for (Logger logger:loggers) {//[db,mail]
            logger.log(product.getName());

        }
    }
}
