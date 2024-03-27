interface Quackable{
    void quack();
}
interface Flyable {
    void fly();
}

interface QuackBehavior{
    void quack();
}
interface FlyBehavior{
    void fly();
}

class Quack implements QuackBehavior{
    public void quack() {
        System.out.println("Qwek - Qwek");
    }
}
class Squeak implements QuackBehavior{
    public void quack() {
        System.out.println("Squeak");
    }
}
class MuteQuack implements  QuackBehavior {
    public void quack() {
        System.out.println("Tidak Bisa Bersuara");
    }
}


class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Terbang");
    }
}

class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Tidak bisa Terbang");
    }
}
class FlyWithRocketPower implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Cool, terbang menggunakan rocket");
    }
}

abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    abstract void display();

    void quack() {
        System.out.println("Qwek Qwek");
    }

    void swim() {
        System.out.println("Berenang");
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }

    void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    void fly(){
        System.out.println("Terbang");
    }
}

class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("Tampilan MallardDuck");
    }
}

class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("Tampilan RedHeadDuck");
    }
}

class RubberDuck extends Duck{
    public RubberDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
    @Override
    void display() {
        System.out.println("Tampilan RubberDuck");
    }
    @Override
    void quack() {
        System.out.println("Bunyinya squeek, bukan qwak");
    }

    @Override
    void fly() {
        // Tidak ada implementasi, karena bebek mainan tidak dapat terbang
    }
}

class WoodenDuck extends Duck {
    public WoodenDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("Tampilan WoodenDuck");
    }
}
class ModelDuck extends Duck {
    ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("Tampilan ModelDuck");
    }

    @Override
    void quack() {
        // Tidak ada implementasi, karena bebek mainan tidak dapat bersuara
    }

    @Override
    void swim() {
        System.out.println("Mengambang");
    }

    @Override
    void fly() {
        // Tidak ada implementasi, karena bebek mainan tidak dapat terbang
    }
}