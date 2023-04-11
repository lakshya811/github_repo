public class RubberDuck extends Duck{

    public RubberDuck(){
        quackbehaviour =new Quack();
        flybehaviour =new FlyWithWings();
        swimbehaviour=new cantswim();
    }
    @Override
    void display() {

    }
}
