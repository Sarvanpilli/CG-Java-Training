public class AlarmClock {
    private String clockId;
    private String owner;
    private Alarm alarm;

    public AlarmClock(String clockId, String owner){
        this.clockId = clockId;
        this.owner = owner;
    }
    public void addAlarm(Alarm alarm){
        this.alarm = alarm;
    }

    public void showAlarm(){
        System.out.println(clockId);
        System.out.println(owner);
        alarm.displayAlarm();


    }

    public void ringAlarm(){
        alarm.ring();
    }
    public static void main(String[] args) {
        AlarmClock alarmClock = new AlarmClock("CD1", "John Doe");
        Alarm alarm = new Alarm("001", 8, 30, "Morning Alarm", true);
        alarmClock.addAlarm(alarm);
        alarmClock.showAlarm();
        alarmClock.ringAlarm();
    }
}
