package Service;

import model.Product;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class ProductService {
    private static ArrayList<Product> products = new ArrayList<>();

    public  ProductService(){

    }

    static {

        Date createAt = new Date();
        Instant updateAt = Instant.now();

        products.add(new Product(1667182235L, "Iphone 11", 20000, 2, "Apple",createAt, updateAt ));
        products.add(new Product(1667182236L, "Iphone 12", 20000, 2, "Apple",createAt, updateAt ));
        products.add(new Product(1667182237L, "Iphone 13", 20000, 2, "Apple",createAt, updateAt ));
        products.add(new Product(1667182238L, "Iphone 14", 20000, 2, "Apple",createAt, updateAt ));
        products.add(new Product(1667182239L, "Iphone X", 20000, 2, "Apple",createAt, updateAt ));


    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

}
