package com.project;

import org.apache.commons.cli.*;

public class RecruitmentApp {

    public void run(String input) {
        if (Integer.parseInt(input) == 1 ) {
//            Administrator admin = new Administrator();
//            admin.start();
            System.out.println("admin");
        } else if (Integer.parseInt(input) == 2) {
//            Employee emp = new Employee();
//            emp.start();
            System.out.println("employee");
        } else if (Integer.parseInt(input) == 3) {
//            Employer empl = new Employer();
//            empl.start();
            System.out.println("employer");
        } else if (Integer.parseInt(input) == 4) {
            System.out.println("Thank you! The system will now exit.");
            System.exit(1);
        } else {
            System.out.println("[ERROR] Invalid input!");
        }
    }
}