package services;

import java.util.List;
import org.springframework.stereotype.Service;
import model.Attendee;
import model.Meeting;
import model.Room;

@Service
public interface MeetingsService {

	public List<Attendee> getAttendees();

	public List<Room> getRooms();

	public void createMeeting(Meeting meeting);

	public void updateMeeting(Meeting meeting, int meetingId);

	public void deleteMeeting(int meetingId);

	public List<Meeting> getAllMeetings();
}
