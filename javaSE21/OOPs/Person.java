package OOPs;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the toString method
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    
    // Overriding equals to define equality based on name and age
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    // Overriding hashCode to ensure consistency with equals
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }



    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        Person person1 = new Person("Alice", 30);
        System.out.println(person == person1);
        System.out.println(person.equals(person1));
        System.out.println(person); // Output: Person{name='Alice', age=30}
        System.out.println(person1);

        System.out.println(person1.hashCode());
        System.out.println(person.hashCode());


        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");
        String d  = "heLLo";

        System.out.println(a == b);//true
        System.out.println(a == c);//false
        System.out.println(a.equals(b));//true  .equals --> compares the text
        System.out.println(a.equals(c));//true
        System.out.println(a.equals(d));//false
        System.out.println(a.equalsIgnoreCase(d));//true
        



    }
}

