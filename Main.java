import View.ViewTemplate;
import View.product.*;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ViewTemplate viewPage = null;
        boolean flagMenu = true;
        do{
            System.out.println("Menu: ");
            System.out.println("1: Add Product");
            System.out.println("2: Show List User");
            System.out.println("3: Edit name Product");
            System.out.println("4: Remove Product");
            System.out.println("5: Find Product");
            System.out.println("0: Exit");
            int menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    viewPage = new ProductView();
                    break;
                case 2:
                    viewPage = new ProductsView();
                    break;
                case 3:
                    viewPage = new EditProductViews();
                    break;
                case 4:
                    viewPage = new RemoveProduct();
                    break;
                case 5:
                    viewPage = new FindProduct();
                case 0:
                    flagMenu = false;
                    break;
            }
            viewPage.showPage();
            //3
        }while (flagMenu);

    }
}
