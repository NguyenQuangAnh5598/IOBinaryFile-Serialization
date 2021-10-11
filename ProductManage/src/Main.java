import java.util.List;
import java.util.Scanner;

public class Main {

    static Manage manage = new Manage();

    public static Product addProduct() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập ID sản phẩm");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name = scan.nextLine();
        System.out.println("Nhập giá");
        int price = scanner.nextInt();
        System.out.println("Nhập mô tả sản phẩm");
        String description = scan.nextLine();

        return new Product(id, name, price, description);
    }

    public static void checkProduct(List<Product> productList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm cần tìm");
        String name = scanner.nextLine();
        System.out.println(manage.findProduct(productList,name));
    }

    public static void main(String[] args) {
        manage.setProductList(IOP.readFile("product.txt"));
//        manage.addProductInList(addProduct());
//        manage.addProductInList(addProduct());
//        manage.addProductInList(addProduct());
        System.out.println(IOP.readFile("product.txt"));
        checkProduct(manage.getProductList());

    }
}
