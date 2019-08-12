package au.com.avantsystems.examples.builderpattern;

import java.util.function.Function;

public class Test {

  public static void main(String[] args) {
    Person josh = new Person.Builder().setAge(10).setFirstName("Josh").setMiddleName("Uzo").build();
    Person asha =
        new Person.Builder().setAge(20).setFirstName("Asha").setMiddleName("Hocker").build();
    Person zoe =
        new Person.Builder().setAge(20).setFirstName("Zoe").setMiddleName("Roxanne").build();

    Function<Person, String> getName = person -> person.getFirstName();
    Function<Person, Integer> getAge = person -> person.getAge();

    Comparator<Person> cmpName = Comparator.comparing(getName);
    Comparator<Person> cmpAge = Comparator.comparing(getAge);


    Comparator<Person> cmpNameReversed = cmpName.reversed();
    System.out.println("Comparing: " + cmpName.compare(josh, asha));
    System.out.println("Comparing: " + cmpName.compare(asha, zoe));

    System.out.println("Reversed: " + cmpNameReversed.compare(josh, asha));
    System.out.println("Reversed: " + cmpNameReversed.compare(asha, zoe));

  }

}
