// Always use java camel case while defining the class name. The first letter of each word should be capitalized, and there should be no spaces or underscores between words. For example, "AlarmClock" is a valid class name, while "alarm_clock" is not.

public class Alarm {
    private String id;
    private int hour;
    private int minute;
    private String label;
    private boolean enabled;

    public Alarm(String id, int hour, int minute, String label, boolean enabled) {
        this.id = id;
        this.hour = hour;
        this.minute = minute;
        this.label = label;
        this.enabled = enabled;
    }

    public String getId() {
        return id;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getLabel() {
        return label;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void displayAlarm() {
        System.out.println("Alarm ID: " + id);
        System.out.println("Time: " + hour + ":" + minute);
        System.out.println("Label: " + label);
        System.out.println("Enabled: " + enabled);
    }

    public void ring() {
        if (enabled) {
            System.out.println("Alarm ringing: " + label);
        } else {
            System.out.println("Alarm is disabled.");
        }
    }

    public static void main(String[] args) {
        Alarm alarm[] = new Alarm[2];
        alarm[0] = new WakeUpAlarm("A001", 7, 30, "Morning Alarm", true, "Good morning! Time to wake up!");
        alarm[1] = new MeetingAlarm("A002", 9, 0, "Meeting Alarm", true, "Project Meeting");
        AlarmClock clock = new AlarmClock("C001", "Sarvan");
        clock.addAlarm(alarm[0]);
        clock.showAlarm();
        clock.addAlarm(alarm[1]);
        clock.showAlarm();
        clock.ring();
    }
}
