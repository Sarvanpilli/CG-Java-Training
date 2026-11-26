public class MeetingAlarm extends Alarm{
    private String meetingName;

    public MeetingAlarm(String id, int hour, int minute, String label, boolean enabled, String meetingName) {
        super(id, hour, minute, label, enabled);
        this.meetingName = meetingName;
    }
    @Override
    public void ring(){
        if(getEnabled()){
            System.out.println("Meeting Alarm is ringing: " +
                    "Meeting Name: "+ meetingName);
        }
        else{
            System.out.println("Meeting alarm is not enabled.");
        }
    }

    public static void main(String[] args) {
        MeetingAlarm meetingAlarm = new MeetingAlarm("MA001", 9, 0, "Meeting Alarm", true, "Project Meeting");
        meetingAlarm.displayAlarm();
        meetingAlarm.ring();
    }
}
