public class Drinks extends Product {
    protected double volume;
    public double getVolume() {return volume;} // The end of the getter
    public void setVolume(double volume) {this.volume = volume;} // The end of the setter
    public Drinks(String name, String manufacture, double volume, double cost) {
        productName = name;
        productManufacture = manufacture;
        this.volume = volume;
        productCost = cost;
    } // Конец конструктора
    public Drinks() {
        this.productName = null;
        this.productManufacture = null;
        this.volume = 0;
        this.productCost = 0;
    } // Конец дефолтного конструктора
    @Override
    public String getProductInfo() {
        String productInfo = "Название: " + getProductName()
                + ", производитель: " + getProductManufacture()
                + ", объём: " + getVolume() + "l"
                + ", цена: " + getProductCost() + "$";
        return productInfo;
    } // The end of the getProductInfo method
} // The end of the Drinks class
