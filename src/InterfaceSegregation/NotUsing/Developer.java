package InterfaceSegregation.NotUsing;

public class Developer implements Worker {
    public void work() {
        System.out.println("Writing code.");
    }

    public void attendMeetings() {
        System.out.println("Attending technical discussions.");
    }

    public void writeReports() {
        System.out.println("I don't write reports, but I'm forced to implement this.");
    }
}
