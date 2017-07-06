package services;

import java.util.ArrayList;
import java.util.List;

import model.Attendee;
import model.Meeting;
import model.Room;

public class MeetingsServiceImp implements MeetingsService {

	private List<Meeting> meetings;

	public MeetingsServiceImp() {

		this.meetings = new ArrayList<Meeting>();

	}

	@Override
	public List<Attendee> getAttendees() {
		Attendee at1 = new Attendee();
		Attendee at2 = new Attendee();
		at1.setAttendeeID(1);
		at1.setName("AT1");
		at2.setAttendeeID(2);
		at2.setName("AT2");
		List<Attendee> att = new ArrayList<Attendee>();
		att.add(at2);
		att.add(at1);
		return att;
	}

	@Override
	public List<Room> getRooms() {
		Room r1 = new Room();
		Room r2 = new Room();
		r1.setRoomID(1);
		r2.setRoomID(2);
		List<Room> rom = new ArrayList<Room>();
		rom.add(r2);
		rom.add(r1);
		return rom;
	}

	@Override
	public void createMeeting(Meeting meeting) {

		meeting.setMeetingID(meeting.hashCode());
		meetings.add(meeting);

	}

	@Override
	public void updateMeeting(Meeting meeting, int meetingId) {
		int pos = 0;
		for (Meeting actualMeeting : meetings) {

			if (actualMeeting.getMeetingID() == meetingId) {

				meetings.set(pos, meeting);

			}

			pos++;
		}
	}

	@Override
	public void deleteMeeting(int meetingId) {

		for (Meeting meeting : meetings) {

			if (meeting.getMeetingID() == meetingId) {

				meetings.remove(meeting);

			}

		}
	}

	@Override
	public List<Meeting> getAllMeetings() {

		return this.meetings;

	}

}
