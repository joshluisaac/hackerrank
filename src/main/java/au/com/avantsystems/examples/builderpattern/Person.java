package au.com.avantsystems.examples.builderpattern;

public class Person {
  private String firstName;
  private String middleName;
  private String lastName;
  private double height;
  private int age;
  private String countryCode;
  private static String region;

  public Person(Builder builder) {
    this.firstName = builder.firstName;
    this.middleName = builder.middleName;
    this.lastName = builder.lastName;
    this.height = builder.height;
    this.age = builder.age;
  }

  public String getFirstName() {
    return firstName;
  }

  public int getAge() {
    return age;
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
      return new Person(this);
    }
  }

  public static void main(String[] args) {
    Person person =
        new Person.Builder().setAge(10).setFirstName("Joshua").setMiddleName("Uzo").build();

    System.out.println(person.toString());
    System.out.println(person.getClass().getName() + "@" + Integer.toHexString(person.hashCode()));
  }
}
