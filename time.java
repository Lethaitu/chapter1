package chap1;

import java.sql.Time;

public class time {
     private int hour;
     private int minutes;
     private int seconds;
     
     public time(int hour, int minutes, int seconds) {
    	 this.hour=hour;
    	 this.minutes=minutes;
    	 this.seconds=seconds;
     }
     public int gethour() {
    	 return hour;
     }
     public int getminutes() {
    	 return minutes;
     }
     public int getseconds() {
    	 return seconds;
     }
     public void sethour(int hour) {
    	 this.hour=hour;
     }
     public void setminutes(int minutes) {
    	 this.minutes=minutes;
     }
     public void setseconds (int seconds) {
    	 this.seconds=seconds;
     }
     public void settime(int hour, int minutes, int seconds){
    this.hour=hour;
    this.minutes=minutes;
    this.seconds=seconds;
     }
     public String toString() {
    	 return "time("+"hour="+hour+"minutes="+minutes+"seconds="+seconds+')';
     }
     public time nextsecond() {
    	 int newseconds=seconds+1;
    	 int newminutes=minutes;
    	 int newhour=hour;
    return new time(newhour, newminutes, newseconds);
     }
     public time previoussecond() {
    	 int newseconds=seconds-1;
    	 int newminutes=minutes;
    	 int newhour=hour;
    return new time(newhour, newminutes, newseconds);
     }
     }

