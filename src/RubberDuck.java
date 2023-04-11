public class RubberDuck extends Duck{

    public RubberDuck(){
        quackbehaviour =new Quack();
        flybehaviour =new FlyWithWings();
    }
    @Override
    void display() {

    }
}
