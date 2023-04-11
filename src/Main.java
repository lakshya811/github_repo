public class Main {

    public static void main(String[] args) {
        MallardDuck mallardDuck= new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.performSwim();

        RedHeadDuck redHeadDuck= new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.performSwim();

        RubberDuck rubberDuck= new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();


    }
}
