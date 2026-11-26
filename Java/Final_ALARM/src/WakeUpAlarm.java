public class WakeUpAlarm extends Alarm{
    private String wakeUpMessage;

    public WakeUpAlarm(String id, int hour, int minute, String label, boolean enabled, String wakeUpMessage) {
        super(id, hour, minute, label, enabled);
        this.wakeUpMessage = wakeUpMessage;
    }
    public String getWakeUpMessage(){
        return wakeUpMessage;
    }

    @Override
    public void ring(){
        if(getEnabled()){
            System.out.println(wakeUpMessage);
        }
        else{
        System.out.println("Wake up alarm is not enabled.");
        }
    }

    public static void main(String[] args) {
        WakeUpAlarm wakeUpAlarm = new WakeUpAlarm("WA001", 6, 30, "Wake Up Alarm", true, "Good morning! Time to wake up!");
        wakeUpAlarm.displayAlarm();
        wakeUpAlarm.ring();
    }

}
