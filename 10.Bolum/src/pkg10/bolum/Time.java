
package pkg10.bolum;

public class Time {
    private long hour;
    private long minute;
    private long second;
    
    public Time(){
       this(System.currentTimeMillis());
        
    }
    
    public Time(long hour, long minute, long second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    
    public long getHour(){
        return hour;
    }
    
    public long getMinute(){
        return minute;
    }
    
    public long getSecond(){
        return second;
    }
    
    public void setTime(long elapseTime){
        long totalSeconds = elapseTime / 1000;
    this.second = totalSeconds % 60;
    long totalMinutes = totalSeconds / 60;
    this.minute = totalMinutes % 60;
    long totalHours = totalMinutes / 60;
    this.hour = totalHours % 24;
        
    }
    
    
    
    
    public Time(long elapseTime){
        long totalSeconds = elapseTime / 1000;
    this.second = totalSeconds % 60;
    long totalMinutes = totalSeconds / 60;
    this.minute = totalMinutes % 60;
    long totalHours = totalMinutes / 60;
    this.hour = totalHours % 24;
}
        
    
       
    public static void main(String[] args) {
    Time time1 = new Time(); 
    Time time2 = new Time(5555550000L); 
    Time time3 = new Time(5, 23, 55); 

    System.out.println("Time 1 (Sistem Saati): " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
    System.out.println("Time 2 (Milisaniyeli): " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
    System.out.println("Time 3 (Parametreli): " + time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());
    }
    
}
    
    
