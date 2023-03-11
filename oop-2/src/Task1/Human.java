package Task1;

public class Human  {
    int age;

    public Human(int age){
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayHello(int count) {
        for (int i = 0; i < count; ++i) sayHello();
    }
}
