package InterfaceSegregation.Using;

public class Developer implements Workable, MeetingParticipant {
    @Override
    public void work() {
        System.out.println("Writing code.");
    }

    @Override
    public void attendMeetings() {
        System.out.println("Attending technical discussions.");
    }
}
