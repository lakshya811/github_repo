class MallardDuck extends Duck {

    public MallardDuck(){
        quackbehaviour =new Quack();
        flybehaviour =new FlyWithWings();
    }

    @Override
    void display() {

    }
}
