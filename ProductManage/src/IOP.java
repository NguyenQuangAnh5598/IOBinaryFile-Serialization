import java.io.*;
import java.util.List;

public class IOP {
    public static List<Product> readFile(String text) {
        List<Product> product = null;
        try {
            InputStream is = new FileInputStream(text);
            ObjectInputStream os = new ObjectInputStream(is);
            product = (List<Product>) os.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }

    public static void writeFile(List<Product> productList,String text) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(text);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
