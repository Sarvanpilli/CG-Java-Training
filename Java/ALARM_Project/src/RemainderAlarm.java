public class RemainderAlarm extends Alarm{
    private String remainder;

    public RemainderAlarm(String id, int hour, int minute, String label, boolean enabled, String remainder) {
        super(id, hour, minute, label, enabled);
        this.remainder = remainder;
    }

    public String getRemainder(){
        return remainder;
    }

    @Override
    public void ring(){
        if(isEnabled()){
            System.out.println("Remainder: "+getRemainder());
        }
        else{
            System.out.println("Remainder Alarm is not enabled");
        }
    }

    public static void main(String[] args) {
        RemainderAlarm remainderAlarm = new RemainderAlarm("004", 10, 0, "Remainder Alarm", true, "Don't forget to submit the report!");
        System.out.println("Remainder: " + remainderAlarm.getRemainder());
        remainderAlarm.displayAlarm();
        remainderAlarm.ring();
    }

}
