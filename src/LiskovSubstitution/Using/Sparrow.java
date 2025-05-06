package LiskovSubstitution.Using;

public class Sparrow implements FlyingBird{

    @Override
    public void fly() {
        System.out.println("I can fly.");
    }

    @Override
    public void eat() {
        System.out.println("I eat seeds.");
    }
}
