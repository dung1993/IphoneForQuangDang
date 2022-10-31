package View.product;

import Service.ProductService;
import View.ViewTemplate;
import model.Product;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProductView extends ViewTemplate {
    private ProductService productService;

    public ProductView(){
        productService = new ProductService();
    }

    @Override
    public  void showBody() {
        System.out.println("--> ADD PRODUCT VIEW");
        Long idProduct = System.currentTimeMillis()/1000;
        System.out.println("Input name:");
        String nameProduct = scanner.nextLine();
        System.out.println("Input price:");
        Float priceProduct = Float.parseFloat(scanner.nextLine());

        System.out.println("Input quantity:");
        int quantityProduct = Integer.parseInt(scanner.nextLine());

        System.out.println("Input manufacturer:");
        String manufacturerProduct = scanner.nextLine();

        Date creatAtProduct = new Date();
        Instant updateAtProduct = Instant.now();
        Product product = new Product(idProduct, nameProduct, priceProduct,
                quantityProduct,manufacturerProduct,  creatAtProduct, updateAtProduct);

        productService.getProducts().add(product);
    }





}
