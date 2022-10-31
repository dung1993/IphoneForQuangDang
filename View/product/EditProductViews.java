package View.product;

import Service.ProductService;
import View.ViewTemplate;
import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EditProductViews extends ViewTemplate {
    private ProductService productService;

    public EditProductViews() {
        productService = new ProductService();
    }
    private static Scanner scanner =new Scanner(System.in);
    ProductsView productsView = new ProductsView();

    @Override
    public void showBody() {
        System.out.println("Input Id");
        Long id = Long.parseLong(scanner.nextLine());
        List<Product> list = productService.getProducts();
        for (Product oldProduct: list) {
            if (oldProduct.getId().equals(id)){
                System.out.println("Input Name");
                String name = scanner.nextLine();
                if (name != null && !name.isEmpty()){
                    oldProduct.setName(name);
                }
                break;
            }
        }
    }

}
