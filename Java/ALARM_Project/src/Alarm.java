public class Alarm {
    private String id;
    private  int hour;
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

    public Alarm() {
    }

    public void displayAlarm() {
        System.out.println("Alarm ID: " + id);
        System.out.println("Time: " + hour + ":" + minute);
        System.out.println("Label: " + label);
        System.out.println("Enabled: " + enabled);
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

    public String getLabel(){
        return label;
    }
    public boolean isEnabled() {
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

    public void ring(){
        if (isEnabled()){
            System.out.println("Alarm is ringing!" +
                    "Label: "+ getLabel());
        } else {
            System.out.println("Alarm is not enabled.");
        }
    }

    public void setAlarm(int hour,int minute){
        setHour(hour);
        setMinute(minute);
    }
    public void setAlarm(int hour,int minute,String label){
        setHour(hour);
        setMinute(minute);
        setLabel(label);
    }
    public static void main(String[] args) {
        Alarm alarm = new Alarm("001", 8, 30, "Morning Alarm", true);
        alarm.displayAlarm();
        System.out.println(alarm.getHour());
        System.out.println(alarm.isEnabled());
        alarm.setAlarm(8,15);
        alarm.setAlarm(8,45,"Brush");
        alarm.displayAlarm();
    }

}