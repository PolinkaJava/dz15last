package Task3;


import Task3.Person;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> personSet = new HashSet<>();


        personSet.add(new Person("John"));
        personSet.add(new Person("Alice"));
        personSet.add(new Person("Bob"));


        for (Person person : personSet) {
            System.out.println(person.getName());
        }


        personSet.remove(new Person("Alice"));
        personSet.remove(new Person("Bob"));


        Person remainingPerson = new Person("John");
        boolean containsRemainingPerson = personSet.contains(remainingPerson);
        System.out.println("Оставшийся объект содержится в коллекции: " + containsRemainingPerson);
    }
}