package co.istad.generictype;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SchoolSystem {
    public static void main(String[] args) {

        Person student =
                new Student("Dara", "Male", 1.70F, 99.95);
        Person teacher =
                new Teacher("Kanha", "Female", 1.65F, BigDecimal.valueOf(1500));
        Person teacher2 =
                new Teacher("Tola", "Female", 1.65F, BigDecimal.valueOf(1500));
        Person student2 =
                new Student("Vicheka", "Female", 1.65F, 50.55);

        List<Person> people = new ArrayList<>();
        people.add(student);
        people.add(teacher);
        people.add(student2);
        people.add(teacher2);

        School<Person> school = new School<>();
        school.setData(people);

        school.getData().forEach(person -> {
            // ព័ត៌មានរួម
            System.out.println("Name: " + person.getName());
            System.out.println("Gender: " + person.getGender());
            System.out.println("Height: " + person.getHeight());
            // ព័ត៌មានរបស់ subtype
            if (person instanceof Student obj) {
                System.out.println("Score: " + obj.getScore());
            } else if (person instanceof Teacher obj){
                System.out.println("Salary: " + obj.getSalary());
            } else {
                System.out.println("Invalid information..!");
            }
            System.out.println("--------------------------");
        });

    }
}
