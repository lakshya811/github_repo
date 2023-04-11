class RedHeadDuck extends Duck {
    public RedHeadDuck(){
        quackbehaviour =new Quack();
        flybehaviour =new FlyWithWings();
        swimbehaviour=new canSwim();
    }

    @Override
    void display() {

    }
}
