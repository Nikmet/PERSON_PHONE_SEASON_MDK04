public class Person {
    String fullName;
    int age;

    public Person(){}

    public Person(String FIO, int age_person){
        fullName = FIO;
        age = age_person;
    }

    public void move(String name){
        System.out.println(name + " идет");
    }

    public void talk(String name){
        System.out.println(name + " говорит");
    }
}
