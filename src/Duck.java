abstract class Duck {

    Flybehaviour flybehaviour; // object of interfaces
    quackbehaviour quackbehaviour;
    public String quack() {
        return "Quack!";
    }

    public String fly() {
        return "Swim!";
    }

    abstract public String display();
