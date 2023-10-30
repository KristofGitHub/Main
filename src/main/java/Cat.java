public class Cat {
    protected String name;
    protected int age;
    public String getName() {return name;} // The end of the getName method
    public void setName(String name) {this.name = name;} // The end of the setName method
    public int getAge() {return age;} // The end of the getAge method
    public void setAge(int age) {this.age = age;} // The end of the getAge method
    // Переопределение базового метода toString
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    } // Конец переопределения
    public void printInfo() {
        System.out.println("Meow! My name is " + name + ", my age is " + age);
    } // The end of the printInfo method
} // The end of the Cat class
