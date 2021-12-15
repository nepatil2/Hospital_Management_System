package com.bl.hms;

import java.util.HashMap;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        UserInterface userinterface = new UserInterface();
        int option = userinterface.showMainMenu();
        Application application = new Application();
        application.handleUserSelection(option);


    }
    void handleUserSelection(int option){
        switch (option){
            case 1 :
                addDoctor();
                break;
            case 2 :
                break;
            case 3 :
                break;
            case 4 :
                break;
            case 5 :
                break;
            case 6 :
                break;
            case 7 :
                break;
            case 8 :
                break;
            case 9 :
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;

        }
    }

    private void addDoctor() {
        Scanner sc = new Scanner(System.in);
        Doctor doctor = new Doctor();
        System.out.println("Enter Doctor name :");
        doctor.name = sc.nextLine();
        System.out.println("Enter Doctor ID :");
        doctor.Id = sc.nextLine();
        System.out.println("Enter Doctor emailID :");
        doctor.emailId = sc.nextLine();
        System.out.println("Enter Doctor specialisation :");
        doctor.specialisation = sc.nextLine();
        System.out.println("Enter Doctor mobile number :");
        doctor.mobileNumber = sc.nextLong();

        doctor.availability = new HashMap();
        doctor.availability.put(Doctor.weekDays.SUNDAY, "10 AM to 12 PM");
        doctor.availability.put(Doctor.weekDays.MONDAY, "10 AM to 12 PM");
        doctor.availability.put(Doctor.weekDays.TUESDAY, "10 AM to 12 PM");
        doctor.availability.put(Doctor.weekDays.WEDNESDAY, "10 AM to 12 PM");
        doctor.availability.put(Doctor.weekDays.THURSDAY, "10 AM to 12 PM");
        doctor.availability.put(Doctor.weekDays.FRIDAY, "10 AM to 12 PM");
        doctor.availability.put(Doctor.weekDays.SATURDAY, "10 AM to 12 PM");

        DoctorRepo doctorRepo = new DoctorRepo();
        doctorRepo.add(doctor);

    }
    private void addPatient() {
        Scanner sc = new Scanner(System.in);
        Patient patient = new Patient();
        System.out.println("Enter patient name :");
        patient.name = sc.nextLine();
        System.out.println("Enter patient ID :");
        patient.patienId = sc.nextLine();
        System.out.println("Enter patient emailID :");
        patient.emailId = sc.nextLine();
        System.out.println("Enter patient age :");
        patient.age = sc.nextInt();
        System.out.println("Enter patient mobile number :");
        patient.mobileNumber = sc.nextLong();
        System.out.println("Enter patient address :");
        patient.address = sc.nextLine();
        System.out.println("Enter patient Disease :");
        patient.disease = sc.nextLine();


        int option;
        option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Female");
                break;
            case 2:
                System.out.println("Male");
                break;
            case 3:
                System.out.println("other");
                break;
            default:
                System.out.println("Enter Correct option");
        }
        PatientRepo patientRepo = new PatientRepo();
        patientRepo.add(patient);
    }

    private void addAppointment(){
        Scanner sc = new Scanner(System.in);
        Appointment appointment = new Appointment();
        System.out.println("Enter PatientId :");
        appointment.patientId = sc.nextLine();
        System.out.println("Enter Doctor Name :");
        appointment.doctorName = sc.nextLine();

        AppointmentRepo appointmentRepo = new AppointmentRepo();
        appointmentRepo.add(appointment);
    }

}
