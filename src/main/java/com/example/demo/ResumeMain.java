package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ResumeMain {

    public static void main(String[] args) {
        boolean condition = false;
        Scanner Scan = new Scanner(System.in);
        Resume1 newresume;
        String answer;
        ArrayList<Resume1> resumes = new ArrayList<>();
        do {
            newresume = new Resume1();


            System.out.println("Enter your FirstName:");
            newresume.setFirstName(Scan.nextLine());

            System.out.println("Enter your LastName :");
            newresume.setLastName(Scan.nextLine());

            System.out.println("Enter your Email:");
            newresume.setEmail(Scan.nextLine());
            System.out.println("====================================================================================");
            System.out.println("Enter your EducationalAcheivements:");
            newresume.setEducationalAcheivements(Scan.nextLine());

            System.out.println("Enter your institution:");
            newresume.setInstitution(Scan.nextLine());

            System.out.println("Enter your Another degree:");
            newresume.setAnotherdegree(Scan.nextLine());
            System.out.println("=====================================================================================");
            System.out.println("Enter your experiences:");
            newresume.setExperiences(Scan.nextLine());

            System.out.println("Enter your otherexperiences:");
            newresume.setOtherexperiences(Scan.nextLine());

            System.out.println("Enter your skill rating:");
            newresume.setSkill(Scan.nextLine());

            System.out.println("Enter your job title:");
            newresume.setJobtitle(Scan.nextLine());

            System.out.println("Enter your start date:");
            newresume.setStartdate(Scan.nextLine());

            System.out.println("Enter your end date:");
            newresume.setEnddate(Scan.nextLine());
            System.out.println("====================================================================================");


            final boolean add = resumes.add(newresume);

            System.out.println("Do you want enter another resume");
            answer = Scan.nextLine();

            if (answer.equalsIgnoreCase("no") || answer.
                    equalsIgnoreCase("n")) {

                condition = false;
            } else {

                condition = true;
            }


        } while (!condition);

        for (Resume1 eachresume : resumes) {
            System.out.println(eachresume.getFirstName());


        }

    }
}
