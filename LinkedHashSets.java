import java.util.LinkedHashSet;
import java.util.Iterator;

// Define the Person class
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age ) {
        this.name = name;
        this.age= age;
    }

    // Override toString method for easy printing
    
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class LinkedHashSets {
    public static void main(String[] args) {
        // Create LinkedHashSet object
        LinkedHashSet<Person> personSet = new LinkedHashSet<>();
        personSet.add(new Person("kavitha", 5));
        personSet.add(new Person("sujatha", 7));
        personSet.add(new Person("swarupa", 8));

        // Iterate over the LinkedHashSet using an Iterator and a while loop
        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
