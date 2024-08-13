public class Person{

// prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it
    private String name;
    private int age;
    private String Address;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        Address = address;
    }
      
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", Address=" + Address + "]";
    }
        
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            result = prime * result + age;
            result = prime * result + ((Address == null) ? 0 : Address.hashCode());
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Person other = (Person) obj;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            if (age != other.age)
                return false;
            if (Address == null) {
                if (other.Address != null)
                    return false;
            } else if (!Address.equals(other.Address))
                return false;
            return true;
        }
    
}

