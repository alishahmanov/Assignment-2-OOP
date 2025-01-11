import models.Payable;
import models.Student;
import models.Employee;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class MyApplication {
    public static void main(String[] args) {
        List<Payable> people = new ArrayList<>();

        people.add(new Employee("John", "Lennon", "Manager", 27045.78));
        people.add(new Employee("George", "Harrison", "Developer", 50000.00));

        people.add(new Student("Ringo", "Starr", 2.5));
        people.add(new Student("Paul", "McCartney", 3.7));

        people.sort(Comparator.comparingDouble(Payable::getPaymentAmount));

        printData(people);
    }

    public static void printData(Iterable<Payable> payables) {
        for (Payable payable : payables) {
            System.out.printf("%s earns %.2f tenge%n", payable.toString(), payable.getPaymentAmount());
        }
    }
}
