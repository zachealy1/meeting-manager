/**
 * A file that calculates the priority of a meeting. 
 */

package meetings;

/**
 * The MeetingManager class calculates the priority of a meeting.
 *
 * @author Zac Healy
 *
 * @version 1.0
 * @since 2023-05-11
 */
public class MeetingManager {
  
  /** Minimum number of attendees. */
  public static final int MIN_ATTENDEES = 5; 
  /** Maximum number of attendees. */
  public static final int MAX_ATTENDEES = 15; 
  /** Minimum number of people under management. */
  public static final int MANAGER_MIN = 6; 
  /** Minimum priority value. */
  public static final int MIN_PRIORITY = 0; 
  /** Maximum priority for meeting. */
  public static final int MAX_PRIORITY = 1000;
  /** Priority factor for calculation. */
  public static final int CALCULATION_FACTOR = 3; 

  /**
   * Constructor for the meeting manager.
   */
  public MeetingManager() {
    super();
  }

  /**
   * Checks if the given number of attendees is valid or not.
   *
   * <p>Side-effect free.
   * Referentially transparent.
   *
   * @param numOfPeople The number of people attending the meeting.
   * @throws IllegalArgumentException if the number of attendees is less than 5.
   */
  public void validAttendees(int numOfPeople) {
    // Checks if people attending is less than the minimum attendees.
    if (numOfPeople < MIN_ATTENDEES) {
      throw new IllegalArgumentException("Invalid Number of Attendees");
    }
  }

  /**
   * Checks if the urgency is valid.
   *
   * <p>Side-effect free.
   * Referentially transparent.
   *
   * @param urgency The urgency of the meeting.
   */
  public void isUrgencyValid(int urgency) {
    // Checks if urgency is outside the valid range.
    if (urgency < 0 || urgency > 5) {
      throw new IllegalArgumentException("Invalid Urgency Rating");
    }
  }

  /**
   * Checks if the urgency level is below a certain threshold.
   *
   * <p>Side-effect free. 
   * Referentially transparent.
   *
   * @param urgency The urgency level of the meeting.
   * @return true if the urgency level is 0, false otherwise.
   */
  public boolean isUrgencyBelowThreshold(int urgency) {
    return urgency <= 0;
  }

  /**
   * Checks if the meeting's capacity has been reached.
   *
   * <p>Side-effect free. 
   * Referentially transparent.
   *
   * @param numOfPeople The number of people attending the meeting.
   * @return true if the capacity has been reached, false otherwise.
   */
  public boolean isCapacityReached(int numOfPeople) {
    return numOfPeople >= MAX_ATTENDEES;
  }

  /**
   * Calculates the line manager factor based on the number of people under
   * management.
   *
   * <p>Side-effect free. 
   * Referentially transparent.
   *
   * @param numUnderManagement The number of people under management.
   * @return 2 if the number of people under management is less than 5, 1
   *         otherwise.
   */
  public int lineManagerFactor(int numUnderManagement) {
    // Checks if number of people under management is below the minimum.
    if (numUnderManagement < MANAGER_MIN) {
      return 2;
    } else {
      return 1;
    }
  }

  /**
   * Calculates the priority of the meeting based on the number of attendees,
   * the number of people under management, and the urgency level.
   *
   * <p>Side-effect free. 
   * Not referentially transparent.
   *
   * @param numOfPeople        The number of people attending the meeting.
   *
   * @param numUnderManagement The number of people under management.
   *
   * @param urgency            The urgency level of the meeting.
   * @return the calculated priority of the meeting
   */
  public double calculatePriority(int numOfPeople, int numUnderManagement, int urgency) {

    isUrgencyValid(urgency); // Checks if the urgency is valid.
    validAttendees(numOfPeople); // Checks the number of attendees is valid.
    // Checks if capacity is reached and returns the maximum priority.
    if (isCapacityReached(numOfPeople)) {
      return MAX_PRIORITY;
    }
    // The line managers factor for calculation.
    double lineManagerFactor = lineManagerFactor(numUnderManagement); 

    double priority = (((numOfPeople + numUnderManagement) * CALCULATION_FACTOR)
        + urgency) / lineManagerFactor; // Calculation for priority.
    // Checks if urgency is below minimum and returns the minimum priority.
    if (isUrgencyBelowThreshold(urgency)) {
      priority = MIN_PRIORITY;
    }
    return priority;
  }
}
