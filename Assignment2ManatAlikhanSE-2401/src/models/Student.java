package models;

public class Student extends Person {
    private double gpa;
    private static final double stipend = 36660.00;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        return gpa > 2.67 ? stipend : 0.0;
    }

    @Override
    public String getPosition() {
        return "Student";
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}
