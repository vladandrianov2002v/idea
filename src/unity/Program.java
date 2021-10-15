package unity;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Person person= new Person("vlad",19);
        Person person1= new Person("nikita",18);
        Person person2= new Person("den",20);
        Person person3= new Person("vlad",19);

        Set<Person> people = new  HashSet<>();
        people.add(person);
        people.add(person1);
        people.add(person2);
        people.add(person3);

        for (Person el:people) {
            System.out.println(el);
        }
    }
}
