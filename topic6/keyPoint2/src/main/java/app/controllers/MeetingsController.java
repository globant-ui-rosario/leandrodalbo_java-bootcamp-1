package app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Attendee;
import model.Meeting;
import model.Room;
import services.MeetingsService;
import services.MeetingsServiceImp;

@RestController
public class MeetingsController {

	private MeetingsService meetingsService = new MeetingsServiceImp();

	@RequestMapping("/attendees")
	public List<Attendee> getAttendees() {

		return meetingsService.getAttendees();

	}

	@RequestMapping("/rooms")
	public List<Room> getRooms() {

		return meetingsService.getRooms();

	}

	@RequestMapping(method = RequestMethod.POST, value = "/meeting")
	public void createMeeting(@RequestBody Meeting meeting) {

		meetingsService.createMeeting(meeting);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/meeting/{meetingId}")
	public void deleteMeeting(@PathVariable int meetingId) {

		meetingsService.deleteMeeting(meetingId);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/meeting/{meetingId}")
	public void updateMeeting(@RequestBody Meeting meeting, @PathVariable int meetingId) {

		meetingsService.updateMeeting(meeting, meetingId);

	}

	@RequestMapping(method = RequestMethod.GET, value = "/meetings")
	public List<Meeting> getAllMeetings() {

		return meetingsService.getAllMeetings();

	}

}
