package oop3_4;

public class MyTime {

	private int hour;
	private int minute;
	private int second;

	public MyTime() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}

	public MyTime(int hour, int minute, int second) {

		try {
			this.setTime(hour, minute, second);
		} catch (IllegalArgumentException e0) {
			System.out.println("Invalid hour minute or second");
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}

	public void setTime(int hour, int minute, int second) throws IllegalArgumentException {

		if (MyTime.isValidHour(hour)) {
			this.hour = hour;
		} else {
			throw new IllegalArgumentException();

		}
		if (MyTime.isValidMinuteOrSecond(minute)) {
			this.minute = minute;
		} else {
			throw new IllegalArgumentException();
		}
		if (MyTime.isValidMinuteOrSecond(second)) {
			this.second = second;
		} else {
			throw new IllegalArgumentException();
		}

	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) throws IllegalArgumentException {

		if (MyTime.isValidHour(hour))
			this.hour = hour;
		else
			throw new IllegalArgumentException();
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) throws IllegalArgumentException {

		if (MyTime.isValidMinuteOrSecond(minute))
			this.minute = minute;
		else
			throw new IllegalArgumentException();
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) throws IllegalArgumentException {

		if (MyTime.isValidMinuteOrSecond(second))
			this.second = second;
		else
			throw new IllegalArgumentException();
	}

	public static boolean isValidHour(int hour) {

		return (hour >= 0 && hour <= 23) ? true : false;

	}

	public static boolean isValidMinuteOrSecond(int hour) {

		return (hour >= 0 && hour <= 59) ? true : false;
	}

	public String toString() {

		return this.getHour() + ":" + this.getMinute() + ":" + this.getSecond();

	}

	public MyTime nextSecond() {

		if (this.hour == 23 && this.minute == 59 && this.second == 59) {

			this.hour = 0;
			this.minute = 0;
			this.second = 0;

		} else {
			if (this.second == 59) {

				this.nextMinute();
				this.second = 0;

			} else
				this.second++;

		}
		return this;
	}

	public MyTime previousSecond() {

		if (this.hour == 0 && this.minute == 0 && this.second == 0) {

			this.hour = 23;
			this.minute = 59;
			this.second = 59;

		} else {

			if (this.second == 0) {
				this.previousMinute();
				this.second = 59;
			} else
				this.second--;

		}
		return this;
	}

	public MyTime nextMinute() {

		if (this.hour == 23 && this.minute == 59) {

			this.hour = 0;
			this.minute = 0;
		} else {

			if (this.minute == 59) {
				this.nextHour();
				this.minute = 0;
			} else
				this.minute++;

		}
		return this;
	}

	public MyTime previousMinute() {

		if (this.hour == 0 && this.minute == 0) {

			this.hour = 23;
			this.minute = 59;
		} else {
			if (this.minute == 0) {
				this.previousHour();
				this.minute = 59;
			} else
				this.minute--;
		}
		return this;
	}

	public MyTime nextHour() {

		if (this.hour == 23) {

			this.hour = 0;

		} else {

			this.hour++;

		}
		return this;
	}

	public MyTime previousHour() {

		if (this.hour == 0) {

			this.hour = 23;

		} else {
			this.hour--;
		}
		return this;
	}
}
