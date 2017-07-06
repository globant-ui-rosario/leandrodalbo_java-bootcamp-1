package model;

import java.util.List;

public class Meeting {
	private int meetingID;
	private List<Attendee> attendes;
	private Room room;
	private int timeSlot;

	public Meeting() {
	}

	public int getMeetingID() {
		return meetingID;
	}

	public void setMeetingID(int meetingID) {
		this.meetingID = meetingID;
	}

	public List<Attendee> getAttendes() {
		return attendes;
	}

	public void setAttendes(List<Attendee> attendes) {
		this.attendes = attendes;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(int timeSlot) {
		this.timeSlot = timeSlot;
	}

}
