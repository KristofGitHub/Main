import java.util.ArrayList;
public class Automat {
    public ArrayList<Product> productList = new ArrayList<>();
    public void initProduct(Product sample) {productList.add(sample);} // The end of the initProduct method
    public void showProductList() {
        System.out.println("Есть в наличии: ");
        for (Product pr : productList) {
            System.out.println(pr.getProductInfo());
        }
        System.out.println("-".repeat(16));
    } // The end of the showProductList method
    public void getProduct(String name) {
        boolean output = false;
        for (Product pr : productList) {
            if (pr.getProductName().equals(name)) {
                System.out.println("Вам выпал " + name);
                output = true;
            } // Получите вкусняшку
        } // Конец перебора
        if (output == false) {
            System.out.println("Такого продукта нет, вам ничего не выпало, сорян");
        } // Конец условия вывода сообщения о том, что куй вам не сникерс
    } // The end of the getProduct method
} // The end of the Automat class
