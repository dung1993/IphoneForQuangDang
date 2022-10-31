package View.product;


import Service.ProductService;
import View.ViewTemplate;
import model.Product;

public class ProductsView extends ViewTemplate {
    private ProductService productService;
    public ProductsView(){
        productService = new ProductService();
    }

    @Override
    public void showBody() {
        for (Product product : productService.getProducts()) {
            System.out.println(product);
        }
    }

}
