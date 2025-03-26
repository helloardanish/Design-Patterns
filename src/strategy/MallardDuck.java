package strategy;

public class MallardDuck extends Duck{

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
