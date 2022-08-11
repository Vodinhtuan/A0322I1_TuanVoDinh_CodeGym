package ss04_class_vs_oop.bai_tap;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime, endTime;

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public StopWatch() {
        startTime=LocalTime.now();
        endTime = LocalTime.now();
    }

    public LocalTime getStartTime() {
        return getStartTime();
    }

    /*public void setStartTime() {
        this.startTime = startTime;
    }*/
    public LocalTime getEndTime(){
        return endTime;
    }
    /*public void setEndTime(){
        this.endTime = endTime;
    }*/
    public StopWatch(LocalTime startTime,LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public void start(){
        startTime = LocalTime.now();
    }

    public void stop(){
        endTime=LocalTime.now();
    }
    public int getElapsedTime(){
        int miliSecond = ((endTime.getHour()-startTime.getHour())*3600 + (endTime.getMinute()-startTime.getMinute())*60 + (endTime.getSecond()-startTime.getSecond())*1000);
        return miliSecond;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println("Start time: " + stopWatch.startTime);
        System.out.println("End time: " + stopWatch.endTime);
        System.out.println("Elapsed time: " + stopWatch.getElapsedTime());
    }
}
