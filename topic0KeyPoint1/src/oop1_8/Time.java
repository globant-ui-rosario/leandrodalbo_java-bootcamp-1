package oop1_8;

public class Time {
	// No input validation needed
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public String toString() {
		return this.getHour() + ":" + this.getMinute() + ":" + this.getSecond();
	}

	public Time nextSecond() {
		this.second++;
		return this;
	}

	public Time previusSecond() {
		this.second--;
		return this;
	}
	
	public static void main(String[]args){
		
		Time time =new Time(10,30,30);
		System.out.println(time.toString());
		System.out.println(time.previusSecond().toString());
		System.out.println(time.nextSecond().toString());
	}
}
