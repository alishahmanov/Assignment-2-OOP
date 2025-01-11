package models;

public abstract class Person implements Payable, Comparable<Person> {
    private static int idNumber = 1;
    private final int id;
    private String name;
    private String surname;

    public Person() {
        this.id = idNumber++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract String getPosition();

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
