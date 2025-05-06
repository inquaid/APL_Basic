package LiskovSubstitution.Using;

public class Penguin implements Bird{
    @Override
    public void eat() {
        System.out.println("I eat fish.");
    }
}
