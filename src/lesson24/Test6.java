package lesson24;

public class Test6 {

}

class Animal1 {
    String showName() {
        return "someAnimal";
    }

    void showInfoAboutAnimal() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse1 extends Animal1 {


    String showName() {
        return "Mouse";
    }

    void showInfoAboutMouse() {
        System.out.println("Name of mouse: " + showName());
    }

    public static void main(String[] args) {
        Mouse1 a = new Mouse1();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}