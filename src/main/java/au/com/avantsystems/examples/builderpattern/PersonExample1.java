package au.com.avantsystems.examples.builderpattern;

public class PersonExample1 {

    private static  String firstName = "Static string";
    private String middleName = "James";

    static {
    System.out.println("Running static block");
    }

    {
        System.out.println("Running instance block");
    }

    public PersonExample1(){

        System.out.println("Running constructor");
        firstName = "";
    }

  public static void main(String[] args) {
    //Person person = new Person.Builder().build();

      //Person.Builder builder = new Person.Builder();

      //Person.InnerA innerA =  new Person().new InnerA();

      PersonExample1 e1 = new PersonExample1();
      PersonExample1 e2 = new PersonExample1();


  }
}
