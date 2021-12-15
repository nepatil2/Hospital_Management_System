package com.bl.hms;

import java.util.Scanner;

public class UserInterface {
    public int showMainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1.Add Doctor\n 2.Delete Doctor\n 3.Update Doctor\n" +
                " 4. Get Doctor\n 5. List All Doctors" + "Enter 6.Add Patient\n 7.Delete Patient\n 8.Update Patient\n" +
                " 9. Get Patient\n 10. List all Patient" + "Enter 11.Add Appointment\n 12.Delete Appointment\n 13.Update Appointment\n"
                + "14. Get Appointment\n 15. List all Appointments");

        int option = sc.nextInt();
        return option;
    }
}
