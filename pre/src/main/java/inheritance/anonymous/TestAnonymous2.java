package inheritance.anonymous;

abstract class Person {
    abstract void eat();
}

//įŽåį
public class TestAnonymous2 {
    public static void main(String[] args) {
        Person p = new Person() {
            void eat() {
                System.out.println("nice food ");
            }
        };
        p.eat();
    }
}
