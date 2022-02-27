public class AlarmClock extends Clock{

    private int alarmHours;
    private int alarmMinutes;

    public AlarmClock(){
        super(0,0,0);
    }

    public AlarmClock(int h, int m){
        super(h,m,0);
    }

    public AlarmClock(int h, int m, int s){
        super(h,m,s);
    }

    public int getAlarmHours(){
        return(alarmHours);
    }

    public int getAlarmMinutes(){
        return(alarmMinutes);
    }

    public void setAlarm(int h, int m) throws IllegalArgumentException{
        if (alarmHours < 0 || alarmHours > 59){
            throw new IllegalArgumentException("invalid alarm hours");
        } else if (alarmMinutes < 0 || alarmMinutes > 59){
            throw new IllegalArgumentException("invalid alarm minutes");
        }

        alarmHours = h;
        alarmMinutes = m;
    }

    public boolean isRinging(){
        if (super.getMinutes() == alarmMinutes){
            if (super.getHours() == alarmHours){
                if (super.getSeconds() < 15){
                    // System.out.println("YES");
                    // System.out.println(super.getSeconds());
                    // System.out.println(current_seconds);
                    return(true);
                }
                return(false);
            }
            return(false);
        }
        return(false);
    }

    @Override
    public void display(){
        // System.out.println(isRinging());
        if (isRinging() == false){
            System.out.println(toString());
        } else if (isRinging() == true){
            System.out.println(toString() + " - WAKE UP!");
        }
        
    }

}