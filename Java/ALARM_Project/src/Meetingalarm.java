public class Meetingalarm extends Alarm {
    private String meetingName;

    public Meetingalarm(String id, int hour, int minute, String label, boolean enabled, String meetingName) {
        super(id, hour, minute, label, enabled);
        this.meetingName = meetingName;
    }

    public String getMeetingName() {
        return meetingName;
    }
    @Override

    public void ring(){
        if(isEnabled()){
            System.out.println("Meeting Alarm is ringing! Meeting Name: " + getMeetingName());
        } else {
            System.out.println("Meeting Alarm is not enabled.");
        }
    }

    public static void main(String[] args) {
        Meetingalarm meetingalarm = new Meetingalarm("003", 9, 0, "Meeting Alarm", true, "Team Meeting");
        System.out.println("Meeting Name: " + meetingalarm.getMeetingName());
        meetingalarm.displayAlarm();
        meetingalarm.ring();

    }
}
