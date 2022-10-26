package homework.Lesson24;

abstract public class Animal {
    String name;
    public Animal(String name) {
        this.name=name;
    }
    public abstract void eat();
    public abstract void sleep();
}

abstract class Fish extends Animal {
    String name;
    public Fish(String name) {
        super(name);
    }
    public void sleep() {
        System.out.println("Vsegda interesno nabludat, kak spyat ribu");
    }
    public abstract void swim();
}

abstract class Bird extends Animal implements Speakable{
    String name;
    public Bird(String name) {
        super(name);
    }
    public abstract void fly();
    public void speak() {
        System.out.println(name + " sings");
    }
}

abstract class Mammal extends Animal implements Speakable{
    String name;
    public Mammal(String name) {
        super(name);
    }
    public abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {
    String name;
    public Mechenosec(String name) {
        super(name);
    }
    public void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet");
    }
    public void eat() {
        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm");
    }
}

class Pingvin extends Bird {
    String name;
    public Pingvin(String name) {
        super(name);
    }
    public void eat() {
        System.out.println("Pingvini lyubit est ribu!");
    }
    public void sleep() {
        System.out.println("Pingvini spyat prijavshis drug k drugu");
    }
    public void fly() {
        System.out.println("Pinvini ne umeyut letat!");
    }
    public void speak() {
        System.out.println("Pingvini ne ymeyut pet kak solovyi");
    }
}

class Lev extends Mammal {
    String name;
    public Lev(String name) {
        super(name);
    }
    public void eat() {
        System.out.println("Lev, kak lyuboy xishnik, lyubit myaso!");
    }
    public void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit!");
    }
    public void run() {
        System.out.println("Lev - eto ne samaya bistraya koshka!");
    }
}

class Test {
    public static void main(String[] args) {
        Mechenosec m1 = new Mechenosec("zohan");
        System.out.println(m1.name);
        m1.eat();
        m1.sleep();
        m1.swim();

        Speakable pingvin = new Pingvin("kristofer");
        pingvin.speak();

        Animal lev = new Lev("Leva");
        lev.eat();
        lev.sleep();

        Mammal lev2 = new Lev("Gena");
        lev2.run();
        lev2.speak();
        lev2.eat();
        lev2.sleep();

    }
}