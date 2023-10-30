public class Main {
    public static void main(String[] args) {
//        // ЗАДАНИЕ 1
//        // Экземпляр 1
//        Cat myKittyCat = new Cat();
//        myKittyCat.setName("Sebastik");
//        System.out.println(myKittyCat.getName());
//        myKittyCat.setAge(12);
//        System.out.println(myKittyCat);
//        System.out.println(myKittyCat.toString());
//        myKittyCat.printInfo();
//        // Экземпляр 2
//        Cat myCat = new SiberianCat();
//        myCat.setAge(7);
//        myCat.setName("Murzik");
//        myCat.printInfo();
        ////////////////////////////////////////////////////////////////////////////////////////////
        // ЗАДАНИЕ 2
        // Продукт 1
        Product product1 = new Product();
        product1.setProductName("Snickers");
        product1.setProductManufacture("MARS Co.");
        product1.setProductCost(1.99);
        // Продукт 2
        Product product2 = new Product();
        product2.setProductName("Mars");
        product2.setProductManufacture("MARS Co.");
        product2.setProductCost(1.89);
        // Продукт 3
        Product product3 = new Product();
        product3.setProductName("Pomidorka");
        product3.setProductManufacture("Ovosch Corp.");
        product3.setProductCost(0.99);
        // Продукт 4
        Product product4 = new Product();
        product4.setProductName("Burger");
        product4.setProductManufacture("Chicken Corp.");
        product4.setProductCost(2.99);
        // Продукт 5
        Product product5 = new Product("Whiskas","WHISKAS",0.5);
        // Продукт 6 - напиток
        Product product6 = new Drinks("Pepsi Cola", "PEPSI",0.5,1.2);
        // Продукт 7 - горячий напиток
        Product product7 = new HotDrinks("Coffee", "NESCAFE", 0.25, 98, 0.5);
        // Создаем автомат и ложим в него продукты
        Automat automat = new Automat();
        automat.initProduct(product1);
        automat.initProduct(product2);
        automat.initProduct(product3);
        automat.initProduct(product4);
        automat.initProduct(product5);
        // ДОМАШНЕЕ ЗАДАНИЕ
        automat.initProduct(product6);
        automat.initProduct(product7);
        // Посмотреть список продуктов в автомате
        automat.showProductList();
        // Хотим сникерс с пепси и кофе
        automat.getProduct("Whiskas");
        automat.getProduct("Pepsi Cola");
        automat.getProduct("Coffee");
        System.out.println("-".repeat(16));
        // Создаем экземпляр автомата горячих напитков
        HotDrinksAutomat hotDrinksAutomat = new HotDrinksAutomat();
        // Напиток 1
        HotDrinks drink1 = new HotDrinks("Coffee", "NESCAFE", 0.25, 98, 0.5);
        // Напиток 2
        HotDrinks drink2 = new HotDrinks("Coffee", "JARDIN", 0.3, 97, 0.99);
        // Напиток 3
        HotDrinks drink3 = new HotDrinks("Coffee", "LAVAZZA", 0.3, 96, 2.99);
        // Кладем в автомат
        hotDrinksAutomat.initDrink(drink1);
        hotDrinksAutomat.initDrink(drink2);
        hotDrinksAutomat.initDrink(drink3);
        // Посмотреть список продуктов в автомате
        hotDrinksAutomat.showProductList();
        // Хотим кофе
        hotDrinksAutomat.getProduct("Coffee", 0.25, 98);
        hotDrinksAutomat.getProduct("Tea", 0.5, 60);
        ////////////////////////////////////////////////////////////////////////////////////////////
    } // The end of the main method
} // The end of the Main class