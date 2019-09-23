import com.sun.org.glassfish.gmbal.Description;

import java.util.ArrayList;
import java.util.Scanner;

public class ResumeApp {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        String userInput ="";
        String name = "";
        String email= "";
        String degree= "";
        String major= "";
        String university= "";
        String company= "";
        String title= "";
        String description= "";
        String skill = "";
        String rating ="";
        int start= 0;
        int end= 0;
        int year= 0;
//        int counter = 1;


    ArrayList<BasicInfo>basicInfos = new ArrayList<>();

        BasicInfo info = new BasicInfo();
        System.out.println("Please enter your full name: ");
        name = key.nextLine();
        info.setName(name);

        System.out.println("Please enter your email: ");
        email = key.nextLine();
        info.setEmail(email);

    ArrayList<Education>educations = new ArrayList<>();
        Education educationPage = new Education();
        System.out.println("Please enter degree type (Associate's, Bachelor's, Master's, PhD, etc.): ");
        degree = key.nextLine();
        educationPage.setDegree(degree);

        System.out.println("Please enter degree your Major: ");
        major = key.nextLine();
        educationPage.setMajor(major);

        System.out.println("Please enter the name of your University: ");
        university = key.nextLine();
        educationPage.setUniversity(university);

        System.out.println("Which year did you graduate? ");
        year = key.nextInt();
        key.nextLine();
        educationPage.setYear(year);

    ArrayList<Experience>experiences = new ArrayList<>();
        Experience experiencePage = new Experience();
        System.out.println("Please enter a work experience ");
        company = key.nextLine();
        experiencePage.setCompany(company);

        System.out.println("Please enter a your job title at this company: ");
        title = key.nextLine();
        experiencePage.setTitle(title);

        System.out.println("Date Started: ");
        start = key.nextInt();
        experiencePage.setStart(start);

        System.out.println("Date Ended: ");
        end = key.nextInt();
        key.nextLine();
        experiencePage.setEnd(end);

        System.out.println("Please add a job description ");
        description = key.nextLine();
        experiencePage.setDescription(description);

    ArrayList<Skill>skills = new ArrayList<>();
        Skill skillPage = new Skill();
        System.out.println("Please enter a skill ");
        skill = key.nextLine();
        skillPage.setSkill(skill);

        System.out.println("What is your rating/proficiency with this skill (Fundamental, Novice, Intermediate, Advanced, Expert)? ");
        rating = key.nextLine();
        skillPage.setRating(rating);

                basicInfos.add(info);
                educations.add(educationPage);
                experiences.add(experiencePage);
                skills.add(skillPage);

                System.out.println("============================================ " +
                                   "\n" + info.getDisplayInfo() +
                                   "\nEDUCATION" +
                                   "\n" + educationPage.getDisplayEdu()+
                                   "\nWORK EXPERIENCE" +
                                   "\n" + experiencePage.getDisplayEx()+
                                   "\n" + skillPage.getSkill());



    }
}
