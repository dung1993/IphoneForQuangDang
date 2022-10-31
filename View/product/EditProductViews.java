package View.product;

import View.EditView;
import View.ViewTemplate;
import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EditProduct extends ViewTemplate {
    private static Scanner scanner =new Scanner(System.in);
    ProductsView productsView = new ProductsView();

    @Override
    public void showBody() {
        Product newProduct = new Product();
        List<Product> products = new ArrayList<>();
        System.out.println("Input Id");
        Long id = Long.parseLong(scanner.nextLine());
        for (Product oldProduct: products) {
            if (oldProduct.getId().equals(newProduct.getId())){
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
