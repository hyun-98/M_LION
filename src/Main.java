class Person {
    String name;
    int age;

    public void sayHello() {
        System.out.println("안녕하세요? 저는 " + name + "입니다. 저의 나이는  " + age + "살 입니다.");
    }
}

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.name = "조현우";
        person.age = 28;
        person.sayHello();
    }
}