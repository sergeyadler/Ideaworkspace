public class Person {
    String firstName;
    String lastName;
    Laptop laptop;

    public Person(String firstName, String lastName, Laptop laptop) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.laptop = laptop;
    }

    public String getFullName() {
        return firstName +lastName;
    }


    public Laptop getLaptop() {
        return laptop;
    }
}
