class MallardDuck extends Duck {

    public MallardDuck(){
        quackbehaviour =new Quack();
        flybehaviour =new FlyWithWings();
        swimbehaviour=new canSwim();
    }

    @Override
    void display() {

    }
}
