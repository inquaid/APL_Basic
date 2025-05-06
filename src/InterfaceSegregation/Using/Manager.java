package InterfaceSegregation.Using;

public class Manager implements Workable, MeetingParticipant, ReportWriter{
    @Override
    public void work() {
        System.out.println("Managing the team.");
    }

    @Override
    public void attendMeetings() {
        System.out.println("Attending management meetings.");
    }

    @Override
    public void writeReports() {
        System.out.println("Writing team performance reports.");
    }
}
