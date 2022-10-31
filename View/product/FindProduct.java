package View.product;

import Service.ProductService;
import View.ViewTemplate;
import model.Product;

import java.util.List;

public class FindProduct extends ViewTemplate {

    private ProductService productService;

    public FindProduct(){
        productService =new ProductService();
    }
    @Override
    public void showBody() {
        System.out.println("Input Id");
        Long id = Long.parseLong(scanner.nextLine());
        List<Product> list = productService.getProducts();
        for (Product oldProduct: list) {
            if (oldProduct.getId().equals(id)){
                System.out.println(oldProduct);
            }
            break;
        }
    }
}
