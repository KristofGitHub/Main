public class Product {
    protected String productName;
    protected String productManufacture;
    protected double productCost;
    public Product(String name, String manufacture, double cost) {
        productName = name;
        productManufacture = manufacture;
        productCost = cost;
    } // Конец конструктора
    public Product() {
        this.productName = null;
        this.productManufacture = null;
        this.productCost = 0;
    } // Конец дефолтного конструктора
    public String getProductName() {return productName;} // The end of the getProductName method
    public void setProductName(String productName) {this.productName = productName;} // The end of the setProductName method
    public String getProductManufacture() {return productManufacture;}  // The end of the getProductManufacture method
    public void setProductManufacture(String productManufacture) {this.productManufacture = productManufacture;} // The end of the setProductManufacture method
    public double getProductCost() {return productCost;} // The end of the getProductCost method
    public void setProductCost(double productCost) {this.productCost = productCost;} // The end of the setProductCost method
    public String getProductInfo() {
        String productInfo = "Название: " + getProductName()
                + ", производитель: " + getProductManufacture()
                + ", цена: " + getProductCost() + "$";
        return productInfo;
    } // The end of the getProductInfo method
} // The end of the Product class
