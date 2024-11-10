import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import meetings.MeetingManager;

public class PriorityTestSuite {

	@Test
	public void testCaseOne() {
		MeetingManager meetingRequest = new MeetingManager();
		assertEquals(0, meetingRequest.calculatePriority(10, 15, 0));
	}

	@Test
	public void testCaseTwo() {
		MeetingManager meetingRequest = new MeetingManager();
		assertEquals(76, meetingRequest.calculatePriority(10, 15, 1));
	}

	@Test
	public void testCaseThree() {
		MeetingManager meetingRequest = new MeetingManager();
		assertEquals(78, meetingRequest.calculatePriority(10, 15, 3));
	}

	@Test
	public void testCaseFour() {
		MeetingManager meetingRequest = new MeetingManager();
		assertEquals(79, meetingRequest.calculatePriority(10, 15, 4));
	}

	@Test
	public void testCaseFive() {
		MeetingManager meetingRequest = new MeetingManager();
		assertEquals(80, meetingRequest.calculatePriority(10, 15, 5));
	}

	@Test
	public void testCaseSix() {
		MeetingManager meetingRequest = new MeetingManager();
		assertEquals(21, meetingRequest.calculatePriority(10, 3, 3));
	}

	@Test
	public void testCaseSeven() {
		MeetingManager meetingRequest = new MeetingManager();
		assertEquals(22.5, meetingRequest.calculatePriority(10, 4, 3));
	}

	@Test
	public void testCaseEight() {
		MeetingManager meetingRequest = new MeetingManager();
		assertEquals(120, meetingRequest.calculatePriority(10, 29, 3));
	}

	@Test
	public void testCaseNine() {
		MeetingManager meetingRequest = new MeetingManager();
		assertEquals(123, meetingRequest.calculatePriority(10, 30, 3));
	}

	@Test
	public void testCaseTen() {
		MeetingManager meetingRequest = new MeetingManager();
		assertEquals(63, meetingRequest.calculatePriority(5, 15, 3));
	}

	@Test
	public void testCaseEleve() {
		MeetingManager meetingRequest = new MeetingManager();
		assertEquals(66, meetingRequest.calculatePriority(6, 15, 3));
	}

	@Test
	public void testCaseTwelve() {
		MeetingManager meetingRequest = new MeetingManager();
		assertEquals(90, meetingRequest.calculatePriority(14, 15, 3));
	}

	@Test
	public void testCaseThirteen() {
		MeetingManager meetingRequest = new MeetingManager();
		assertEquals(1000, meetingRequest.calculatePriority(15, 15, 3));
	}
}
