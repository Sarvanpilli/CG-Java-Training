public class AlarmClock {
    private String clockId;
    private String owner;
    private Alarm alarm;

    public AlarmClock(String clockId, String owner) {
        this.clockId = clockId;
        this.owner = owner;
    }

    public void addAlarm(Alarm alarm){
        this.alarm = alarm;

    }
    public void showAlarm(){
        System.out.println("Clock ID: "+clockId);
        System.out.println("Owner: "+owner);
        alarm.displayAlarm();
    }

    public void ring(){
        alarm.ring();
    }

    public static void main(String[] args) {
        AlarmClock alarmClock = new AlarmClock("AC001", "John Doe");
        Alarm alarm = new Alarm("A001", 7, 30, "Morning Alarm", true);
        alarmClock.addAlarm(alarm);
        alarmClock.showAlarm();
        alarmClock.ring();
    }







}
