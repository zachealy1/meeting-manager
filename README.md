# Meeting Manager System

The Meeting Manager System is a Java-based application designed to manage user logins, main.java.meetings, and priorities. It provides functionalities to handle different main.java.login types, manage main.java.meetings with different priority levels, and perform various administrative tasks related to user sessions and meeting schedules.

**This work was completed as a part of my undergraduate degree in Applied Software Engineering at Swansea University, which CGI Inc. sponsored.**

## Project Structure

The project includes the following main components:

- **Login Management**: Handles user main.java.login sessions and differentiates between main.java.login types.
- **Meeting Management**: Manages meeting details and priorities, ensuring efficient scheduling and tracking.

### Key Files

- `Main.java`: The main entry point for running the application, providing a command-line interface for interacting with the system.
- `LoginManager.java`: Manages user logins, handling different types of users and their authentication processes.
- `LoginType.java`: Defines various main.java.login types available in the system.
- `MeetingManager.java`: Manages main.java.meetings, including scheduling and tracking details for each meeting.
- `LoginManagerTestSuite.java`: Contains tests for the main.java.login management functionalities to ensure reliability and correctness.
- `PriorityTestSuite.java`: Contains tests for priority-related functions within the meeting management system.

## Features

- **User Login**: Supports multiple types of user logins, managed through `LoginManager`.
- **Meeting Scheduling**: Allows scheduling of main.java.meetings with different priorities and provides functionalities to manage meeting records.
- **Test Suites**: Includes test suites for main.java.login management and priority functionalities to ensure code reliability.

## Getting Started

### Prerequisites

- Java 8 or later
- An IDE like Eclipse or IntelliJ to run the project

### Setup

1. Clone the repository to your local machine.
2. Open the project in your preferred IDE.
3. Ensure that the project’s directory structure matches the package names.

### Running the Application

1. Compile the project files.
2. Run the `Main` class to start the application.
3. Follow the console instructions to interact with the application.

---

## Usage

1. **Login Management**: The system supports different main.java.login types and authenticates users through the `LoginManager`.
2. **Meeting Management**: Schedule, track, and manage main.java.meetings, allowing users to prioritize tasks based on meeting importance.

---

## Testing

The project includes test suites to ensure the accuracy of core functionalities:

- **LoginManagerTestSuite**: Verifies the correctness of main.java.login handling and user session management.
- **PriorityTestSuite**: Tests the priority management for main.java.meetings, ensuring tasks are handled based on their importance.

To run tests, you can execute the test files in your IDE or use a testing framework compatible with Java, such as JUnit.

---
