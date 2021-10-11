import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manage {
    List<Product> productList;

    public Manage() {
        productList = new ArrayList<>();
    }

    public Manage(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;

    }

    public void addProductInList(Product product) {
        productList.add(product);
        IOP.writeFile(productList,"product.txt");
    }

    public void showProductList(List<Product> productList) {
        for (Product p : productList) {
            System.out.println(p.toString());
        }
    }
    public String findProduct(List<Product> productList,String name) {
        Product product = null;
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getName())) {
                product = productList.get(i);
            }
        }
        return product.toString();

    }
}
