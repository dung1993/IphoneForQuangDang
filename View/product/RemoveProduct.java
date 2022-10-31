package View.product;

import Service.ProductService;
import View.ViewTemplate;
import model.Product;

import java.util.List;

public class RemoveProduct extends ViewTemplate {
    private ProductService productService;

    public RemoveProduct(){
        productService =new ProductService();
    }


    @Override
    public void showBody() {
        System.out.println("Input id");
        Long id = Long.parseLong(scanner.nextLine());
        List<Product> products = productService.getProducts();
        for (Product oldProduct: products) {
            if (oldProduct.getId().equals(id)){
                products.remove(oldProduct);
            }
            break;
        }
    }
}
