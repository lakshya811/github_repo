public abstract class Duck {
    FlyBehaviour flybehaviour; // object of interfaces
    quackBehaviour quackbehaviour;

    swimBehaviour swimbehaviour;
    abstract void display();

    public void setFlyBehavior(FlyBehaviour fb) {
        flybehaviour = fb;
    }

    public void setquackBehavior(quackBehaviour qb) {
        quackbehaviour=qb;
    }

    public void setswimBehavior(swimBehaviour sb) {
        swimbehaviour=sb;
    }

    public void performQuack()
    {
        quackbehaviour.quack();
    }
    public void performFly()
    {
        flybehaviour.Fly();
    }
    public void performSwim()
    {
        swimbehaviour.swim();
    }
}