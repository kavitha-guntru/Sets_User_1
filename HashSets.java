import java.util.HashSet;

// Define the Person class
class Person {
    private String name;
    private int age;
    private double salary;
    private String department;

    // Constructor
    public Person(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    // Getter methods (if needed)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // Override toString method for meaningful output
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", salary=" + salary + ", department='" + department + "'}";
    }

    // Override equals and hashCode for correct behavior in HashSet
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.salary, salary) == 0 && name.equals(person.name) && department.equals(person.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, department);
    }
}

public class HashSets {
    // Prepare HashSet object here and add Person class objects to it, then iterate using for-each loop
    public static void main(String[] args) {
        HashSet<Person> per = new HashSet<>();
        per.add(new Person("kavitha", 21, 22000, "sw"));
        per.add(new Person("sujatha", 21, 25000, "hr"));
        per.add(new Person("swarupa", 21, 29000, "sw"));

        // Iterate over the HashSet using a for-each loop
        for (Person person : per) {
            System.out.println(person);
        }
    }
}
