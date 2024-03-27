public class Main {
    public static  void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelduck = new ModelDuck();
        modelduck.performFly();//akan memanggil construktor modelduck(FlyNoWay())
        modelduck.setFlyBehavior(new FlyWithRocketPower());
        modelduck.performFly();
    }
}