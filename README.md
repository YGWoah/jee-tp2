# Patient Management System

This is a simple Patient Management System developed as a homework assignment. It is built using Java, Spring Boot, and Maven.

## Project Structure

The project is structured as follows:

- `src/main/java/com/example/demo`: This is the main package containing the application's source code.
    - `Application.java`: This is the main class that runs the application.
    - `entities`: This package contains the entity classes like `Patient`, `Doctor`, `Appointment`, `Consultation`, etc.
    - `repositories`: This package contains the repository interfaces like `PatientRepository` and `AppointmentRepository`.
    - `web`: This package contains the `PatientRestService` class which handles HTTP requests.

## Setup

To run this project, you need to have Java and Maven installed on your system. Follow these steps:

1. Clone the repository: `git clone https://github.com/YGWoah/jee-tp2.git`
2. Navigate to the project directory: `cd jee-tp2`
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`

## Features

- Add a new patient
- Retrieve all patients
- Retrieve a patient by ID
- Manage appointments
