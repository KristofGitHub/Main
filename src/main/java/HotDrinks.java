public class HotDrinks extends Drinks {
    private double temperature;
    public double getTemperature() {return temperature;} // The end of the getter
    public void setTemperature(double temperature) {this.temperature = temperature;} // The end of the setter
    public HotDrinks(String name, String manufacture, double volume, double temperature, double cost) {
        productName = name;
        productManufacture = manufacture;
        this.volume = volume;
        this.temperature = temperature;
        productCost = cost;
    } // Конец конструктора
    public HotDrinks() {
        this.productName = null;
        this.productManufacture = null;
        this.volume = 0;
        this.temperature = 0;
        this.productCost = 0;
    } // Конец дефолтного конструктора
    @Override
    public String getProductInfo() {
        String productInfo = "Название: " + getProductName()
                + ", производитель: " + getProductManufacture()
                + ", объём: " + getVolume() + "l"
                + ", температура: " + getTemperature() + " Celcius Degrees"
                + ", цена: " + getProductCost() + "$";
        return productInfo;
    } // The end of the getProductInfo method
} // The end of the HotDrinks class
