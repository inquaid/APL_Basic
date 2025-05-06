package LiskovSubstitution.NotUsing;

public class Penguin extends Bird{
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins can't fly.");
    }
}
