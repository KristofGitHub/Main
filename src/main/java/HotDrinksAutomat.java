import java.util.ArrayList;
public class HotDrinksAutomat {
    public ArrayList<HotDrinks> drinksList = new ArrayList<HotDrinks>();
    public void initDrink(HotDrinks sample) {drinksList.add(sample);} // The end of the initProduct method
    public void getProduct(String name, double volume, double temperature) {
        boolean output = false;
        for (HotDrinks dr : drinksList) {
            if (dr.getProductName().equals(name) && dr.getTemperature() == temperature && dr.getVolume() == volume) {
                System.out.println("Вам выпал " + name + " объемом " + volume + "l и температурой " + temperature + " градусов");
                output = true;
            } // Получите вкусняшку
        } // Конец перебора
        if (output == false) {
            System.out.println("Такого напитка нет, вам ничего не выпало, сорян");
        } // Конец условия вывода сообщения о том, что куй вам не сникерс
    }  // The end of the getProduct method
    public void showProductList() {
        System.out.println("Есть в наличии: ");
        for (HotDrinks dr : drinksList) {
            System.out.println(dr.getProductInfo());
        }
        System.out.println("-".repeat(16));
    } // The end of the showProductList method
} // The end of the HotDrinksAutomat class
