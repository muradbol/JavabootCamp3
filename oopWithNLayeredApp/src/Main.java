import business.ProductManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAcces.HibernateProductDao;
import dataAcces.JdbcProducthDao;
import entities.Product;

public class Main {

    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"İphone XR",10000);

       Logger[] loggers={new DatabaseLogger(),new FileLogger(),new MailLogger()};
       ProductManager productManager=new ProductManager(new JdbcProducthDao(),loggers);
       productManager.add(product1);

    }
}
