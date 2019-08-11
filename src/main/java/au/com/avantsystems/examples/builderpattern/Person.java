package au.com.avantsystems.examples.builderpattern;

public class Person {
  private String firstName;
  private String middleName;
  private String lastName;
  private double height;
  private int age;
  private String countryCode;
  private static String region;

  public Person() {
    System.out.println("Created person");
  }

  public Person(String firstName, String middleName, String lastName, double height, int age) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.height = height;
    this.age = age;
  }

  public void getSomething() {}

  class InnerA {

    public void getCountryCode() {
      String X = Person.this.countryCode;
    }

    public void callMethod(){
        Person.this.getSomething();
    }
  }

  public static class Builder {

    private String firstName;
    private String middleName;
    private String lastName;
    private double height;
    private int age;

    public Builder() {}

    public static Builder newInstance() {
      return new Builder();
    }

    public Builder setFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder setMiddleName(String middleName) {
      this.middleName = middleName;
      return this;
    }

    public Builder setLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder setHeight(double height) {
      this.height = height;
      return this;
    }

    public Builder setAge(int age) {
      this.age = age;
      return this;
    }

    public Person build() {

      new Person().getSomething();

      return new Person(firstName, middleName, lastName, height, age);
    }
  }

  public static void main(String[] args) {
    Person person =
        new Person.Builder().setAge(10).setFirstName("Joshua").setMiddleName("Uzo").build();

    System.out.println(person.toString());
    System.out.println(person.getClass().getName() + "@" + Integer.toHexString(person.hashCode()));
  }
}
