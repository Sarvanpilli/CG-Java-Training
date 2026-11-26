public class WakeUpAlarm extends Alarm {

    private String WakeUpMessage;

    public WakeUpAlarm(String id, int hour, int minute, String label, boolean enabled,String WakeUpMessage) {
        super(id, hour, minute, label, enabled);
        this.WakeUpMessage = WakeUpMessage;
    }
    public String getWakeUpMessage(){
        return WakeUpMessage;
    }

    @Override
    public void ring(){
        if (isEnabled()){
            System.out.println( getWakeUpMessage() +
                    "Time to Wake up");
        } else {
            System.out.println("Alarm is not enabled.");
        }
    }
    public static void main(String[] args) {
        WakeUpAlarm wakeupalarm = new WakeUpAlarm("002", 7, 0, "Wake Up Alarm", true, "Good Sarvan Time to wake up!");
        System.out.println(wakeupalarm.getWakeUpMessage());
        wakeupalarm.displayAlarm();
        wakeupalarm.ring();
    }
}
