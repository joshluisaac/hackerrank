package com.avantsystems.problems.others;


import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface

interface PersonFactory<P extends  Person> {
    P create(final String firstName, final String lastName, int age, Date dateOfBirth, int countryId);
}



public class ProcessPerson {

    static List<Person> createPerson(){
        PersonFactory<Person> personFactory = Person::new;
        Person person1 = personFactory.create("Peter", "Parker", 10, new Date(), 90);
        Person person2 = personFactory.create("Peter2", "Parker2", 4, new Date(), 91);
        Person person3 = personFactory.create("Peter3", "Parker3", 6, new Date(), 94);
        Person person4 = personFactory.create("Peter4", "Parker4", 7, new Date(), 98);
        Person person5 = person4;
        System.out.println(person4.hashCode());
        System.out.println(person5.hashCode());

        person5.setAge(45);
        return Arrays.asList(person1,person2,person3,person4) ;
    }

    void process(List<Person> persons, Predicate<Person> predicate, Function<Person,String> function, Consumer<String> consumer) {
        for (Person person : persons) {
            if(predicate.test(person)) {
                String s = function.apply(person);
                consumer.accept(s);
            }
        }
    }

    Person supplyPerson(Supplier<Person> lazyPerson) {
        return lazyPerson.get();
    }

    public static void main(String[] args) {
        ProcessPerson processPerson = new ProcessPerson();
        processPerson.process(ProcessPerson.createPerson(),p -> p.getAge() > 5, Person::getFirstName, System.out::println);
        Person p = processPerson.supplyPerson(() -> new Person("Joshua", "Nwankwo", 17, new Date(), 981));
        System.out.println(p);
    }



}
