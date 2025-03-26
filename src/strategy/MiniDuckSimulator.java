package strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();

        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        // To change a duck’s
        //behavior at runtime, just
        //call the duck’s setter
        //method for that behavior.

    }
}
