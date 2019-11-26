public class Time {
 public  long hour;
 public  long min;
 public  long sec;

 public Time() {
  long totalsec = System.currentTimeMillis() / 1000;
  long totalmin = totalsec / 60;
  long totalhour = totalmin / 60;
  this.hour = totalhour %24;
  this.min = totalmin % 60;
  this.sec = totalsec & 60;
 }
 public Time(long hour, long min, long sec) {
  this.hour = hour;
  this.min = min;
  this.sec = sec;

 }

 public Time(long elapseTime) {
  long totalsec = elapseTime / 1000;
  long totalmin = totalsec / 60;
  long totalhour = totalmin / 60;
  this.hour = totalhour % 24;
  this.min = totalmin % 60;
  this.sec = totalsec % 60;
 }
public long getHour() {
  return hour;
}
public long getMin() {
  return min;
}
public long getSec() {
  return sec;
}

}
